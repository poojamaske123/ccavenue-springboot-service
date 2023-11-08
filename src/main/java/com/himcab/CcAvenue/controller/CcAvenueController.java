package com.himcab.CcAvenue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/api/public/ccavenue")
public class CcAvenueController {

    @GetMapping("/hello")
    public String hello(Model model) {
        System.out.println("/hello called!!!!!");
        model.addAttribute("name");
        return "hello";
    }

    @GetMapping("/responseHandler")
    public String responseHandler( Model model) {
        System.out.println("/responseHandler called!!!!!");
        model.addAttribute("name");
        return "ccavResponseHandler";
    }
}
