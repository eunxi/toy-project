package com.eunxi.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String main(){
        System.out.println("Index Controller");

        return "index";
    }
}
