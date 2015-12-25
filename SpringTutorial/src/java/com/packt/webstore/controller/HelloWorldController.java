package com.packt.webstore.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController{
 
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("message","what this?");
        return model;
       // return new ModelAndView("hello", "message", "what is this");
    }
   
}