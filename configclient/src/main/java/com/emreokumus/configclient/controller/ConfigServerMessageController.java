package com.emreokumus.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/rest")
public class ConfigServerMessageController {

    @Value("${message:Config Server is not working. Please check...}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return this.message;
    }
}
