package org.paulvargas.tutorials;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FooServlet
 */
@WebServlet("/foo")
public class FooServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger LOG = Logger.getLogger(FooServlet.class.getName());

	/**
	 * {@inheritDoc}
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");

		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String tzOffset = request.getParameter("timezoneOffset");

		String tz = date.replaceAll(".*?(GMT[+-]\\d{4}).*", "$1");
		String tzName = date.replaceAll(".*?\\((.*?)\\)", "$1");

		PrintWriter out = response.getWriter();

		TimeZone timeZone = TimeZone.getTimeZone(tz);
		out.println("------------------------------------");
		out.printf("%s = %s%n", "tz", tz);
		out.printf("%s = %s%n", "getDisplayName", timeZone.getDisplayName());
		out.printf("%s = %s%n", "getID", timeZone.getID());
		out.printf("%s = %s%n", "getRawOffset", timeZone.getRawOffset());
		out.printf("%s = %s%n", "toString", timeZone.toString());
		out.printf("%s = %s%n", "observesDaylightTime", timeZone.observesDaylightTime());
		out.printf("%s = %s%n", "useDaylightTime", timeZone.useDaylightTime());

		timeZone = TimeZone.getTimeZone(tzName);
		out.println("------------------------------------");
		out.printf("%s = %s%n", "tzName", tzName);
		out.printf("%s = %s%n", "getDisplayName", timeZone.getDisplayName());
		out.printf("%s = %s%n", "getID", timeZone.getID());
		out.printf("%s = %s%n", "getRawOffset", timeZone.getRawOffset());
		out.printf("%s = %s%n", "toString", timeZone.toString());
		out.printf("%s = %s%n", "observesDaylightTime", timeZone.observesDaylightTime());
		out.printf("%s = %s%n", "useDaylightTime", timeZone.useDaylightTime());
		out.flush();
	}

	/**
	 * {@inheritDoc}
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
