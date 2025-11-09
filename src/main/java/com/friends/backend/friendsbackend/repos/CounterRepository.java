package com.friends.backend.friendsbackend.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.friends.backend.friendsbackend.baseClasses.Counter;

public interface CounterRepository extends JpaRepository<Counter, Long> {}
