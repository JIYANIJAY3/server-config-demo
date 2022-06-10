package com.inexture.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/rest")
public class ClientController {

    @Value("${msg:Config Server is not working. Please check...}")
    private String massage;

    @Value("${rest.name}")
    private String msg;

    @GetMapping("/msg")
    public String getMassage()
    {
        return msg;
    }
}
