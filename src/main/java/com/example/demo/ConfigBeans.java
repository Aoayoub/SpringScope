package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
@Configuration
public class ConfigBeans {
    @Bean
    @Scope("singleton")
    public SingletonClass singletonClass()
    {
        return new SingletonClass();
    }
    @Bean
    @Scope("prototype")
    public PrototypeClass prototypeClass()
    {
        return new PrototypeClass();
    }
    @Bean
    @SessionScope
    public SessionClass sessionClass()
    {
        return new SessionClass();
    }
    @Bean
    @RequestScope
    public RequestClass requestClass()
    {
        return new RequestClass();
    }
    @Bean
    @ApplicationScope
    public ApplicationClass applicationClass()
    {
        return new ApplicationClass();
    }

}
