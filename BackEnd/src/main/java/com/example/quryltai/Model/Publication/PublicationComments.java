package com.example.quryltai.model.publication;

import com.example.quryltai.model.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "publication_comments")
public class PublicationComments {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "publication_id")
    private Publication publication;

    @Column(nullable = false)
    private String comment;

    private LocalDateTime createdAt;
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

}
