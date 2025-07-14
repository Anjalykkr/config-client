package com.demo.config.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/home")
@RestController
public class MessageController {

    @Value("${message.value:Default message}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
}
