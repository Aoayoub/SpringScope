package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyThread extends Thread{
    @Autowired
    SingletonClass singletonClass;
    @Override
    public void run() {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigBeans.class);
        applicationContext.register(ConfigBeans.class);
        singletonClass =applicationContext.getBean(SingletonClass.class);

    }

    @Override
    public String toString() {
        return "Singleton:"+singletonClass.hashCode();
    }
}
