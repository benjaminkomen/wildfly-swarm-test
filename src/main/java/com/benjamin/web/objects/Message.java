package com.benjamin.web.objects;

import javax.enterprise.inject.Model;

@Model
public class Message {
    public String say() {
        return "Hello from JSF";
    }
}