package org.paulvargas.webapp.config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	private static Logger logger = LogManager.getLogger();

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebMvcConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
		FrameworkServlet servlet = super.createDispatcherServlet(servletAppContext);
		if (servlet instanceof DispatcherServlet) {
			((DispatcherServlet) servlet).setThrowExceptionIfNoHandlerFound(true);
			servlet.setDispatchOptionsRequest(true);
			servlet.setDispatchTraceRequest(true);
			servlet.setEnableLoggingRequestDetails(true);
		}
		return servlet;
	}

}