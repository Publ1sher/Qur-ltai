package com.example.quryltai.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController extends BaseController {

    @GetMapping("/user")
    public String userInfo() {
        return data.get("universityEmail");
    }

}
