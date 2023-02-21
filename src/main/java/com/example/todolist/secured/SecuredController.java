package com.example.todolist.secured;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/secured")
public class SecuredController {

    @GetMapping("/test")
    public ResponseEntity<String> testRoute() {
        return ResponseEntity.ok("You are logged in!");
    }
}
