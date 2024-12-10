package com.example.quryltai.model.team;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "profiles")
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @Column
    private String imageUrl;

    @Column(nullable = false)
    private String shortDescription;

    @Column(nullable = false)
    private String status;
}
