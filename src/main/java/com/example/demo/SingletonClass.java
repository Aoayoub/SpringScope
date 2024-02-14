package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class SingletonClass {
    @Override
    public String toString() {
        return ""+hashCode();
    }
}
