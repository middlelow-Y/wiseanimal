package com.test.wiseanimal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wise-animal")
public class WiseAnimalController {
    @GetMapping("/cat")
    public String wiseCat(){
        return "wiseanimal-cat.html";
    }

}
