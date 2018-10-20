package com.heaven.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ut")
public class UserTemplatesController {

    @Value("${heaven.key1}")
    private String key1;
    @Value("${heaven.key2}")
    private String key2;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("key1", key1);
        modelAndView.addObject("key2", key2);
        return modelAndView;
    }
}
