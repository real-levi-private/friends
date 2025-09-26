package com.friends.backend.friendsbackend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friends.backend.friendsbackend.baseClasses.Counter;
import com.friends.backend.friendsbackend.services.CounterService;

@RestController
@RequestMapping("/api/counter")
public class CounterController {
    @Autowired
    private CounterService service;

    @PostMapping
    public Counter increment() {
        return service.increment();
    }

    @GetMapping
    public Counter get() {
        return service.get();
    }
}
