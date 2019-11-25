package com.nolimits.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

    @GetMapping(value = "/test", produces = {"application/json;charset=UTF-8"})
    public String hello() {
        return "hello";
    }

}

