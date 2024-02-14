package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;


public class SessionClass {
    @Override
    public String toString() {
        return ""+hashCode();
    }
}
