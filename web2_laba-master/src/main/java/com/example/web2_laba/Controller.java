package com.example.web2_laba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/name")
    public String getName() {
        return "Мисліборський Дмитро КП-22";
    }
}

