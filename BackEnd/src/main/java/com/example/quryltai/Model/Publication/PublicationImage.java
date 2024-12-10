package com.example.quryltai.model.publication;

import jakarta.persistence.*;

@Entity
@Table(name = "publication_images")
public class PublicationImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "publication_id")
    private Publication publication;
}
