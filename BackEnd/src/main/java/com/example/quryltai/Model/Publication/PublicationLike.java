package com.example.quryltai.Model.Publication;

import com.example.quryltai.Model.Assembly.Assembly;
import com.example.quryltai.Model.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "publication_likes")
public class PublicationLike {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "publication_id")
    private Publication publication;

    private LocalDateTime createdAt;
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

}
