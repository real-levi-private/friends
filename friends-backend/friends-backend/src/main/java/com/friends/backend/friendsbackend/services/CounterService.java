package com.friends.backend.friendsbackend.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friends.backend.friendsbackend.baseClasses.Counter;
import com.friends.backend.friendsbackend.repos.CounterRepository;

@Service
public class CounterService {
    @Autowired
    private CounterRepository repo;

    public Counter increment() {
        Counter counter = repo.findById(1L).orElse(new Counter());
        counter.setCount(counter.getCount() + 1);
        return repo.save(counter);
    }

    public Counter get() {
        return repo.findById(1L).orElse(new Counter());
    }
}
