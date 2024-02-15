package com.example.demo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@SpringBootApplication
public class DemoApplication extends HttpServlet {
@Autowired
static ServletContext servletContext;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);



	}

}
