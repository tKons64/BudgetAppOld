package me.tretyakovv.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControllers {

    @GetMapping("")
    public String helloWorld() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String page() {
        return "Третьяков Константин"
                + ", программа - Бюджет семьи"
                + ", дата: 09.12.2022"
                + ", программа для ведения бюджета"
                ;
    }

}
