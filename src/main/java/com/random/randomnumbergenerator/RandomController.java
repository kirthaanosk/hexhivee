package com.random.randomnumbergenerator;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomController {

    @GetMapping("/")
    public String home(Model model) {

        Random random = new Random();

        int number = random.nextInt(100) + 1;

        model.addAttribute("randomNumber", number);

        return "index";
    }

}