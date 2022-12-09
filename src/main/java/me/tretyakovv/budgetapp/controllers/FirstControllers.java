package me.tretyakovv.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControllers {

    @GetMapping("")
    public String helloWorld() {
        return "Hello";
    }

    @GetMapping("/path/to/page")
    public String page() {
        return "page";
    }

}
