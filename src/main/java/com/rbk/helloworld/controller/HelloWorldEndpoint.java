package com.rbk.helloworld.controller;

import org.hibernate.validator.constraints.Length;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@RestController
@Validated
public class HelloWorldEndpoint {

    @GetMapping("/hello")
    public ResponseEntity<String> getMessage(@RequestParam("name") @Length(max = 30) String name, @RequestParam("age") @Max(200) @Min(0) int age) {
        return ResponseEntity.ok("Hello " + name + " "+age);
    }

    @PostMapping("/message")
    @ResponseBody
    public ResponseEntity<String> postMessage(@RequestBody @NotEmpty String message) {
        return ResponseEntity.ok("Your message was " + message);
    }
}
