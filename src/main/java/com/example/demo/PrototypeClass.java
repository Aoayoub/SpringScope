package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class PrototypeClass {
    @Override
    public String toString() {
        return ""+hashCode();
    }
}
