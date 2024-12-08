package com.example.quryltai.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    private int id;

    @Column(nullable = false)
    private String skill;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Skill parentSkill;
}
