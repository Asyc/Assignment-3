package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // need a controller method to show initial HTML form

    @RequestMapping("/Movie")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // need a controller method to read form data and
    // add data to the model

    @RequestMapping("/MovieName")
    public String showFavoriteMovie(@RequestParam("movieName") String movieName, Model model) {
        model.addAttribute("movieName", movieName);
        model.addAttribute("message", movieName + " is my favorite movie");

        return "helloworld";
    }
}








