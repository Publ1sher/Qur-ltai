package com.example.quryltai.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment PK
    @Column(name = "project_id")
    private Long projectId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user; // Joining the column

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "short_description", nullable = true, length = 255)
    private String shortDescription;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "date_of_posts", nullable = false)
    private LocalDate dateOfPosts;
}