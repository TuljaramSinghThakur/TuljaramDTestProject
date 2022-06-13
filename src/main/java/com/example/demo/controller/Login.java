package com.example.demo.controller;

import com.example.demo.service.ExternalAPIS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class Login {

    @Autowired
    ExternalAPIS externalAPIS;

    @GetMapping(path = "/hello")
    public Object sayHelloWorld() throws Exception {
        HttpResponse response = externalAPIS.sendGet();
        return response.body();
    }
}
