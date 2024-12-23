package com.example.addition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    AdditionService additionService;

    @GetMapping("/add")
    public int addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return additionService.add(num1, num2);
    }
}
