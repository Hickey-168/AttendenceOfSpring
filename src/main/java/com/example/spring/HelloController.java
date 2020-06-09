package com.example.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {


    @RequestMapping(value = "/hickey", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
