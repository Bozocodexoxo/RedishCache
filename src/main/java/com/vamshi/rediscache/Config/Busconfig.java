package com.vamshi.rediscache.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

import javax.sql.DataSource;

@Configuration
public class Busconfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dr = new DriverManagerDataSource();
        dr.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dr.setUsername("root");
        dr.setPassword("tiger");
        return dr;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}