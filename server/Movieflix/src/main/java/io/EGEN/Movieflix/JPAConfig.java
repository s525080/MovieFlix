package io.EGEN.Movieflix;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class JPAConfig {
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		
	   emf.setDataSource(dataSource());
	   emf.setPackagesToScan("io.EGEN.Movieflix.*");
	   
	   JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	   emf.setJpaVendorAdapter(adapter);
	   
	   emf.setJpaProperties(properties());
		return emf;
	}
	
	@Bean
	public DataSource dataSource(){ 
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/movieflix");
		ds.setUsername("root");
		ds.setPassword("Abhi@2017");
		
		return ds;
	}
	
	@Bean
	public PlatformTransactionManager txnManager(EntityManagerFactory emf){
		JpaTransactionManager txn = new JpaTransactionManager(emf);
		
		return txn;
		//use in service layer
	}
	
	
	private Properties properties(){
		
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.setProperty("hibernate.hbm2ddl.auto", "validate");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.format_sql", "true");
		
		
		return props;
		
	}

}
