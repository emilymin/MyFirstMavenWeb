package com.tw.mpang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PizzaController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showIndex(){
        return "index";
    }
}
