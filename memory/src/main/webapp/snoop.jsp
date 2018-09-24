<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="javax.servlet.http.*"%>
<%@ page import="java.lang.management.*"%>
<%@ page import="java.util.*"%>
<%!
	public static String toHumanString(MemoryUsage mu) {
		if (mu == null) {
			return null;
		}
		StringBuilder buf = new StringBuilder(0);
		buf.append("init: <span title=").append(mu.getInit()).append("><strong>").append(humanReadableByteCount(mu.getInit())).append("</strong></span>, ");
		buf.append("used: <span title=").append(mu.getUsed()).append("><strong>").append(humanReadableByteCount(mu.getUsed())).append("</strong></span>, ");
		buf.append("committed: <span title=").append(mu.getCommitted()).append("><strong>").append(humanReadableByteCount(mu.getCommitted())).append("</strong></span>, ");
		buf.append("max: <span title=").append(mu.getMax()).append("><strong>").append(humanReadableByteCount(mu.getMax())).append("</strong></span>");
		return buf.toString();
	}

    // http://codepen.io/rgfx/pen/gpEzVv
	public static String toHorizontalStackedBarChart(MemoryUsage mu) {
		if (mu == null) {
			return null;
		}
		StringBuilder buf = new StringBuilder(0);
		buf.append("<span style=\" background-color: #e8e8e8; display: block; position:relative; width: 100%; height: 1.2em; color: white;\">");
		double used = mu.getUsed() * 100.0 / mu.getMax();
		double committed = (mu.getCommitted() - mu.getUsed()) * 100.0 / mu.getMax();
		buf.append("<span style=\"width: ").append(String.format("%.0f%%;", used)).append(" display: inline-block; box-sizing: border-box; background-color: red; float: left; height: 100%; text-align: right;\">").append(humanReadableByteCount(mu.getUsed()))/*.append(String.format(" %.1f%%", used) )*/.append("&nbsp;</span>");
		buf.append("<span style=\"width: ").append(String.format("%.0f%%;", committed)).append(" display: inline-block; box-sizing: border-box; background-color: green; float: left; height: 100%; text-align: right;\">").append(humanReadableByteCount(mu.getCommitted()))/*.append(String.format(" %.1f%%", committed) )*/.append("&nbsp;</span>");
		buf.append("</span>");
		return buf.toString();
	}

	// http://stackoverflow.com/a/3758880/870248
	public static String humanReadableByteCount(long bytes) {
		int unit = 1024;
		if (bytes < unit) {
			return bytes + " B";
		}
		int exp = (int) (Math.log(bytes) / Math.log(unit));
		char pre = "KMGTPE".charAt(exp - 1);
		return String.format("%.2f %sB", bytes / Math.pow(unit, exp), pre);
	}

	public static Map<String, String> getSystemProperties() {
		Map<String, String> map = new TreeMap<String, String>();
		Set<Map.Entry<Object, Object>> set = System.getProperties().entrySet();
		for (Map.Entry<Object, Object> entry : set) {
			map.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
		}
		return map;
	}

	public static Map<String, String> getEnvironment() {
		Map<String, String> map = new TreeMap<String, String>();
		Set<Map.Entry<String, String>> set = System.getenv().entrySet();
		for (Map.Entry<String, String> entry : set) {
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}

%>
<html>
	<head>
		<title>WebApp JSP Snoop page</title>
		<meta charset="UTF-8">
		<meta http-equiv="refresh" content="30">
		<style>
			body {
				font-family: monospace;
				word-break: break-all;
			}
			tr td:first-child {
				word-break: keep-all;
			}
		</style>
	</head>
	<body>

		<h1>WebApp JSP Snoop page</h1>

		<h2>JVM Memory Monitor</h2>


		<table border="0" width="100%">

			<tbody>
				<tr>
					<td colspan="2" align="center">
						<h3>Memory MXBean</h3>
					</td>
				</tr>

				<tr>
					<td width="200">Heap Memory Usage</td>
					<td><%=toHumanString(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage())%></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><%=toHorizontalStackedBarChart(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage())%></td>
				</tr>

				<tr>
					<td>Non-Heap Memory Usage</td>
					<td><%=toHumanString(ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage())%></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><%=toHorizontalStackedBarChart(ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage())%></td>
				</tr>

				<tr>
					<td colspan="2"></td>
				</tr>

				<tr>
					<td colspan="2" align="center">
						<h3>Memory Pool MXBeans</h3>
					</td>
				</tr>

			</tbody>
		</table>
		<%
			Iterator<?> iter = ManagementFactory.getMemoryPoolMXBeans().iterator();
			while (iter.hasNext()) {
				MemoryPoolMXBean item = (MemoryPoolMXBean) iter.next();
        %>

		<table style="border: 1px #98AAB1 solid;" border="0" width="100%">

			<tbody>
				<tr>
					<td colspan="2" align="center"><strong><%= item.getName()%></strong></td>
				</tr>

				<tr>
					<td width="200">Type</td>
					<td><%= item.getType()%></td>
				</tr>

				<tr>
					<td>Usage</td>
					<td><%= toHumanString(item.getUsage())%></td>
				</tr>

				<tr>
					<td>Peak Usage</td>
					<td><%= toHumanString(item.getPeakUsage())%></td>
				</tr>

				<tr>
					<td>Collection Usage</td>
					<td><%= toHumanString(item.getCollectionUsage())%></td>
				</tr>

			</tbody>
		</table>


		<%
			}
        %>

		<h2>Request information</h2>

		<table>
			<tr>
				<th align="right">Requested URL:</th>
				<td><%= HttpUtils.getRequestURL(request)%></td>
			</tr>
			<tr>
				<th align="right">Request method:</th>
				<td><%= request.getMethod()%></td>
			</tr>
			<tr>
				<th align="right">Request URI:</th>
				<td><%= request.getRequestURI()%></td>
			</tr>
			<tr>
				<th align="right">Request protocol:</th>
				<td><%= request.getProtocol()%></td>
			</tr>
			<tr>
				<th align="right">Servlet path:</th>
				<td><%= request.getServletPath()%></td>
			</tr>
			<tr>
				<th align="right">Path info:</th>
				<td><%= request.getPathInfo()%></td>
			</tr>
			<tr>
				<th align="right">Path translated:</th>
				<td><%= request.getPathTranslated()%></td>
			</tr>
			<tr>
				<th align="right">Query string:</th>
				<td>
					<% if (request.getQueryString() != null) {
							out.write(request.getQueryString().replaceAll("<", "&lt;").replaceAll(">", "&gt;"));
						}%>
				</td>
			</tr>
			<tr>
				<th align="right">Content length:</th>
				<td><%= request.getContentLength()%></td>
			</tr>
			<tr>
				<th align="right">Content type:</th>
				<td><%= request.getContentType()%></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<th align="right">Server name:</th>
				<td><%= request.getServerName()%></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<th align="right">Server port:</th>
				<td><%= request.getServerPort()%></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<th align="right">Remote user:</th>
				<td><%= request.getRemoteUser()%></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<th align="right">Remote address:</th>
				<td><%= request.getRemoteAddr()%></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<th align="right">Remote host:</th>
				<td><%= request.getRemoteHost()%></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<th align="right">Authorization scheme:</th>
				<td><%= request.getAuthType()%></td>
			</tr>
			<tr>
			</tr>
		</table>

		<%
			Enumeration e = request.getHeaderNames();
			if (e != null && e.hasMoreElements()) {
        %>
		<h2>Request headers</h2>

		<table>
			<tr>
				<th align="left">Header:</th>
				<th align="left">Value:</th>
			</tr>
			<%
				while (e.hasMoreElements()) {
					String k = (String) e.nextElement();
            %>
			<tr>
				<td><%= k%></td>
				<td><%= request.getHeader(k)%></td>
			</tr>
			<%
				}
            %>
		</table>
		<%
			}
        %>


		<%
			e = request.getParameterNames();
			if (e != null && e.hasMoreElements()) {
        %>
		<h2>Request parameters</h2>
		<table>
			<tr valign="top">
				<th align="left">Parameter:</th>
				<th align="left">Value:</th>
				<th align="left">Multiple values:</th>
			</tr>
			<%
				while (e.hasMoreElements()) {
					String k = (String) e.nextElement();
					String val = request.getParameter(k);
					String vals[] = request.getParameterValues(k);
            %>
			<tr valign="top">
				<td><%= k.replaceAll("<", "&lt;").replaceAll(">", "&gt;")%></td>
				<td><%= val.replaceAll("<", "&lt;").replaceAll(">", "&gt;")%></td>
				<td>
					<%
						for (int i = 0; i < vals.length; i++) {
							if (i > 0) {
								out.print("<BR>");
							}
							out.print(vals[i].replaceAll("<", "&lt;").replaceAll(">", "&gt;"));
						}
                    %>
				</td>
			</tr>
			<%
				}
            %>
		</table>
		<%
			}
        %>


		<%
			e = request.getAttributeNames();
			if (e != null && e.hasMoreElements()) {
        %>
		<h2>Request Attributes</h2>
		<table>
			<tr valign="top">
				<th align="left">Attribute:</th>
				<th align="left">Value:</th>
			</tr>
			<%
				while (e.hasMoreElements()) {
					String k = (String) e.nextElement();
					Object val = request.getAttribute(k);
            %>
			<tr valign="top">
				<td><%= k.replaceAll("<", "&lt;").replaceAll(">", "&gt;")%></td>
				<td><%= val.toString().replaceAll("<", "&lt;").replaceAll(">", "&gt;")%></td>
			</tr>
			<%
				}
            %>
		</table>
		<%
			}
        %>


		<%
			e = getServletConfig().getInitParameterNames();
			if (e != null && e.hasMoreElements()) {
        %>
		<h2>Init parameters</h2>
		<table>
			<tr valign="top">
				<th align="left">Parameter:</th>
				<th align="left">Value:</th>
			</tr>
			<%
				while (e.hasMoreElements()) {
					String k = (String) e.nextElement();
					String val = getServletConfig().getInitParameter(k);
            %>
			<tr valign="top">
				<td><%= k%></td>
				<td><%= val%></td>
			</tr>
			<%
				}
            %>
		</table>
		<%
			}
        %>


		<%
			if (session != null) {
				e = session.getAttributeNames();
				if (e.hasMoreElements()) {
        %>
		<h2>Session Attributes</h2>
		<table>
			<tr valign="top">
				<th align="left">Parameter:</th>
				<th align="left">Value:</th>
			</tr>
			<%
				while (e.hasMoreElements()) {
					String k = (String) e.nextElement();
					Object val = session.getAttribute(k);
            %>
			<tr valign="top">
				<td><%= k%></td>
				<td><%= val%></td>
			</tr>
			<%
				}
            %>
		</table>
		<%
				}
			}
        %>


		<%
			if (session != null) {
				e = session.getServletContext().getAttributeNames();
				if (e.hasMoreElements()) {
        %>
		<h2>Application Attributes</h2>
		<table>
			<tr valign="top">
				<th align="left">Parameter:</th>
				<th align="left">Value:</th>
			</tr>
			<%
				while (e.hasMoreElements()) {
					String k = (String) e.nextElement();
					Object val = session.getServletContext().getAttribute(k);
            %>
			<tr valign="top">
				<td><%= k%></td>
				<td><%= val%></td>
			</tr>
			<%
				}
            %>
		</table>
		<%
				}
			}
        %>

		<h2>System Properties</h2>
		<table style="border: 1px #ccc solid; border-collapse: collapse; " border="1" width="100%">
			<tr valign="top">
				<th align="left">Property:</th>
				<th align="left">Value:</th>
			</tr>
			<%
				for (Map.Entry<String, String> entry : getSystemProperties().entrySet()) {
			%>
			<tr valign="top">
				<td><%=entry.getKey()%></td>
				<td><%=entry.getValue()%></td>
			</tr>
			<%
				}
			%>
		</table>

		<h2>Environment</h2>
		<table style="border: 1px #ccc solid; border-collapse: collapse; " border="1" width="100%">
			<tr valign="top">
				<th align="left">Variable Name:</th>
				<th align="left">Value:</th>
			</tr>
			<%
				for (Map.Entry<String, String> entry : getEnvironment().entrySet()) {
			%>
			<tr valign="top">
				<td><%=entry.getKey()%></td>
				<td><%=entry.getValue()%></td>
			</tr>
			<%
				}
			%>
		</table>	

	</body>
</html>

