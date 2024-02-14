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

		System.out.println(servletContext);
		AnnotationConfigApplicationContext context = (AnnotationConfigApplicationContext) WebApplicationContextUtils.getWebApplicationContext(servletContext);
		System.out.println(context);
		// Maintenant, vous pouvez obtenir les beans de votre contexte Spring et les utiliser
		ApplicationClass applicationClass = context.getBean(ApplicationClass.class);
		System.out.println(applicationClass);

	}

}
