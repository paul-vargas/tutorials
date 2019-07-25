package org.paulvargas.webapp.config;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	private static Logger logger = LogManager.getLogger();
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/favicon.ico").addResourceLocations("classpath:org/paulvargas/assets/icons/")
				.setCacheControl(CacheControl.maxAge(1, TimeUnit.MINUTES));
	}

	@Override
	public void addViewControllers(final ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		// registry.addViewController("/admin").setViewName("admin/index");
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		for (HttpMessageConverter<?> converter : converters) {
			if (converter instanceof StringHttpMessageConverter) {
				logger.info("Customizing converter: {}", converter);
				StringHttpMessageConverter stringHttpMessageConverter = (StringHttpMessageConverter) converter;
				stringHttpMessageConverter.setDefaultCharset(StandardCharsets.UTF_8);
			}
		}
	}
	
	@Bean
	TilesConfigurer tilesConfigurer() {
		// https://www.programcreek.com/java-api-examples/?code=jegbjerg/webapp-base/webapp-base-master/src/main/java/dk/freecode/config/DispatcherConfig.java#
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions("/WEB-INF/layouts/layouts.xml", "/WEB-INF/views/**/views.xml");
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}
}
