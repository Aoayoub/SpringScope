package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerBean {
@Autowired
ConfigBeans configBeans;
    @GetMapping("/testscopeApplication")
    public String getapp()
    {
        MyThread myThread=new MyThread();
        myThread.run();

        return configBeans.applicationClass()+" ApplicationScope"+"----------"+myThread.toString();
    }
    @GetMapping("/testscoperequest")
    public String getrequest()
    {

        return configBeans.requestClass()+" Request Scope";
    }
    @GetMapping("/testscopesession")
    public String getsession()
    {

        return configBeans.sessionClass()+" Session Scope";
    }
    @GetMapping("/testprototype")
    public String getprototype()
    {

        return configBeans.prototypeClass()+"Prototype Scope";
    }
    @GetMapping("/testsingleton")
    public String getsingleton()
    {

        return configBeans.singletonClass()+" Singleton Scope";
    }
}
