package org.paulvargas.webapp.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.paulvargas.webapp.dao.Common;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class MyBatisConfig {

	@Bean(name = "firstDataSource")
	@Lazy(value = false)
	public DataSource dataSourceOne() {
		return new HikariDataSource();
	}
	
	@Bean(name = "firstSqlSessionFactory")
	@Lazy(value = false)
	public SqlSessionFactory firstSqlSessionFactory(@Qualifier("firstDataSource") final DataSource dataSource)
			throws Exception {
		final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		final SqlSessionFactory factory = factoryBean.getObject();
		factory.getConfiguration().setMapUnderscoreToCamelCase(true);
		return factory;
	}

	/**
	 * Returns a bean factory for the {@link CorpoMapper} interface (MyBatis).
	 *
	 * @param sqlSessionFactory a factory for MyBatis (injected by Spring)
	 * @return a factory for {@link CorpoMapper} (MyBatis)
	 * @throws Exception if an exception occurs while the factory is created
	 */
	@Bean
	public MapperFactoryBean<Common> corpoMapper(
			@Qualifier("firstSqlSessionFactory") final SqlSessionFactory sqlSessionFactory) throws Exception {
		final MapperFactoryBean<Common> factoryBean = new MapperFactoryBean<>(Common.class);
		factoryBean.setSqlSessionFactory(sqlSessionFactory);
		return factoryBean;
	}	
}
