package org.paulvargas.webapp.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.zaxxer.hikari.HikariDataSource;

public class AppConfig {
	@Bean(name = "firstDataSource")
	@ConfigurationProperties(prefix = "datasources.first")
	public DataSource dataSourceOne() {
		return new HikariDataSource();
	}
	
	@Bean(name = "firstSqlSessionFactory")
	public SqlSessionFactory firstSqlSessionFactory(@Qualifier("firstDataSource") final DataSource dataSource)
			throws Exception {
		final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		final SqlSessionFactory factory = factoryBean.getObject();
		factory.getConfiguration().setMapUnderscoreToCamelCase(true);
		return factory;
	}	
}
