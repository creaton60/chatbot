package com.hello.chatbot.api.configuration;

import akka.actor.ActorSystem;
import com.hello.chatbot.api.configuration.extension.SpringExtension;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.hello.chatbot.api"})
@EnableWebMvc
@EnableJpaRepositories(basePackages = {"com.hello.chatbot.api.repository"})
public class ChatBotConfig extends WebMvcConfigurerAdapter{

    @Autowired
    private SpringExtension springExtension;

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendarAdapter = new HibernateJpaVendorAdapter();
        jpaVendarAdapter.setDatabase(Database.MYSQL);

        return jpaVendarAdapter;
    }

    protected Properties additionalHibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "validate");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        properties.setProperty("hibernate.show_sql", "false");

        return properties;
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Qualifier("dataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean lemfb = new LocalContainerEntityManagerFactoryBean();
        lemfb.setDataSource(dataSource);
        lemfb.setJpaVendorAdapter(jpaVendorAdapter());
        lemfb.setPackagesToScan("com.hello.chatbot.api.domain");
        lemfb.setJpaProperties(additionalHibernateProperties());
        return lemfb;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));

        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        jackson2HttpMessageConverter.setPrettyPrint(true);
        converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));

        List<MediaType> mediaTypeList = new ArrayList<MediaType>();
        mediaTypeList.add(MediaType.valueOf("text/html;charset=UTF-8"));
        mediaTypeList.add(MediaType.valueOf("application/json;charset=UTF-8"));
        mediaTypeList.add(MediaType.valueOf("application/v1+json;charset=UTF-8"));

        jackson2HttpMessageConverter.setSupportedMediaTypes(mediaTypeList);
        converters.add(jackson2HttpMessageConverter);
    }

    @Bean
    public ActorSystem actorSystem(){
        ActorSystem system = ActorSystem.create("HelloChatBotSystem", akkaConfiguration());
        springExtension.initialize(applicationContext);

        return system;
    }

    @Bean
    public Config akkaConfiguration(){
        return ConfigFactory.load();
    }

}
