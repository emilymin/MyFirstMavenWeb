package com.tw.mpang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LanguageController {
    @RequestMapping("/sayHello")
    public String translate(){
        return "index";
    }
}
