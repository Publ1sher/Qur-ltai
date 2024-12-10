package com.example.quryltai.model.publication;

import com.example.quryltai.model.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "publications")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String head;

    private String description;

    private LocalDateTime publicationDate;
    @PrePersist
    protected void onCreate() {
        publicationDate = LocalDateTime.now();
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
