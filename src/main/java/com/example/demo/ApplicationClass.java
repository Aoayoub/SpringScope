package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;


public class ApplicationClass {
    @Override
    public String toString() {
        return ""+hashCode();
    }
}
