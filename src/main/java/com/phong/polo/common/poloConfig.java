package com.phong.polo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "poloEntityManagerFactory", transactionManagerRef = "poloTransactionManager", basePackages = "com.phong.polo.dao.polo.repositories")
public class poloConfig {
    @Bean(name = "poloDataSource")
    @ConfigurationProperties(prefix = "polo.datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "poloEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean poloEntityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("poloDataSource") DataSource dataSource){
        return builder.dataSource(dataSource).packages("com.phong.polo.dao.polo.entities").persistenceUnit("account").build();
    }
    @Bean(name = "poloTransactionManager")
    public PlatformTransactionManager poloTransactionManager(@Qualifier("poloEntityManagerFactory")EntityManagerFactory poloEntityManagerFactory){
        return new JpaTransactionManager(poloEntityManagerFactory);
    }
}
