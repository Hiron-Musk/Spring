package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(){
        System.out.println("hello...");
        return "hello";
    }
    @GetMapping("/welcome")
    public String Welcome(){
        System.out.println("welcome...");
        return "welcome";
    }

    @GetMapping("/greeting")
    public String Greeting(){
        System.out.println("greeting...");
        return "greeting";
    }

}
