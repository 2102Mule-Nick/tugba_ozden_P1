package com.revature.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan("com.revature")
@Configuration
public class AppConfig {
	public static final String DATASOURCE_URL = 
			"jdbc:postgresql://" + 
			System.getenv("POS_DB_URL") + 
			":5432/" + 
			System.getenv("POS_DB_NAME") + 
			"?";
	public static final String DATASOURCE_DRIVERNAME = "org.postgresql.Driver";
	public static final String DATASOURCE_USERNAME = System.getenv("POS_DB_USERNAME");
	public static final String DATASOURCE_PASSWORD = System.getenv("POS_DB_PASSWORD");
	public static final String DATASOURCE_SCHEMA = System.getenv("POS_DB_SCHEMA");
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(DATASOURCE_URL);
		dataSource.setDriverClassName(DATASOURCE_DRIVERNAME);
		dataSource.setUsername(DATASOURCE_USERNAME);
		dataSource.setPassword(DATASOURCE_PASSWORD);
		dataSource.setSchema(DATASOURCE_SCHEMA);
		return dataSource;
		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		System.out.println("!!!!!!!runningBlogFormJDBCTemplate!!!!!");
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		return template;
	}


}
