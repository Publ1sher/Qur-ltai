package com.example.quryltai.model.assembly;

import com.example.quryltai.model.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "assembly_comments")
public class AssemblyComments {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "assembly_id")
    private Assembly assembly;

    @Column(nullable = false)
    private String comment;

    private LocalDateTime createdAt;
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

}
