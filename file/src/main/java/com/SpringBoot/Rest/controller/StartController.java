package com.SpringBoot.Rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StartController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
