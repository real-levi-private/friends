package com.friends.backend.friendsbackend.baseClasses;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Counter {
    @Id
    private Long id = 1L; // singleton counter
    private int count;

    // Getters and setters
}
