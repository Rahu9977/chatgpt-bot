package com.generative.controller;

import com.generative.service.CustomBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bot")
public class CustomBotController {

    @Autowired
    CustomBotService botService;

    @GetMapping("/chat")
    public String chat(@RequestParam("prompt") String prompt){
        return botService.generateResponse(prompt);
    }

}
