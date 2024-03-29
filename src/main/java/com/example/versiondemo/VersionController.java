package com.example.versiondemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    private static final String APPLICATION_VERSION = "1.42.5";

    @GetMapping("/")
    public String getDemoApplication() {
        return "Hello Version!";
    }

    @GetMapping("/version")
    public String getVersion() {
        return APPLICATION_VERSION;
    }

}
