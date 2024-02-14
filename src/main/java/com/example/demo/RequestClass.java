package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


public class RequestClass {
    @Override
    public String toString() {
        return ""+hashCode();
    }
}
