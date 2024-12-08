package com.example.quryltai.Model.Assembly;

import com.example.quryltai.Model.Skill;
import com.example.quryltai.Model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "assemblies")
public class Assembly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(nullable = false)
    private String goal;

    @Column(nullable = false)
    private String shortDescription;

    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner;

    @ManyToMany
    @JoinTable(
            name = "assembly_likes",
            joinColumns = @JoinColumn(name = "assembly_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> likedByUsers;

    @ManyToMany
    @JoinTable(
            name = "assembly_comments",
            joinColumns = @JoinColumn(name = "assembly_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> CommentedByUsers;

    @ManyToMany
    @JoinTable(
            name = "assembly_skills",
            joinColumns = @JoinColumn(name = "assembly_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private List<Skill> sKills;
}
