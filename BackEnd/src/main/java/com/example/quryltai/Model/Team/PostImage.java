package com.example.quryltai.model.team;

import jakarta.persistence.*;

@Entity
@Table(name = "post_images")
public class PostImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
