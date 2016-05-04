package com.medical.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by a.amouzesh on 05/12/15.
 */
@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

    @Value("${jdbc.driverName}")
    private String driverName;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.userName}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource =
                new DriverManagerDataSource();
        dataSource.setDriverClassName(driverName);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setPackagesToScan("com.medical.model");
        factoryBean.setConfigLocation(new ClassPathResource("hibernate.cfg.xml"));
        return factoryBean;
    }

    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager manager = new HibernateTransactionManager();
        manager.setDefaultTimeout(6000);
        manager.setSessionFactory(sessionFactory);
        return manager;
    }
}
