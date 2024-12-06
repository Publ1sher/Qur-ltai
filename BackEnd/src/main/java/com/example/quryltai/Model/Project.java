package com.example.quryltai.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long project_id;
    @OneToOne
    @JoinColumn(name = "user_id")
    User owner_id;
    String title;
    String description;
    String short_description;
    String status;
    String date_of_posts;
}
