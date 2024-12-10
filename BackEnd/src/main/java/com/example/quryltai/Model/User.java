package com.example.quryltai.model;

import com.example.quryltai.model.assembly.Application;
import com.example.quryltai.model.assembly.Assembly;
import com.example.quryltai.model.publication.Publication;
import com.example.quryltai.model.team.Team;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increment PK
    private Long id;

    @Column(unique = true, nullable = false)
    @NotNull(message = "Login cannot be null")
    private String username;

    @Column(nullable = false)
    @NotNull(message = "Password cannot be null")
    private String password;

    @Column(nullable = false)
    @NotNull(message = "Name cannot be null")
    private String name;

    @Column(nullable = false)
    @NotNull(message = "Surname cannot be null")
    private String surname;

    @Column(nullable = false)
    @NotNull(message = "Personal email cannot be null")
    @Email(message = "Invalid email format")
    private String personalEmail;

    @Column(nullable = false)
    @NotNull(message = "Personal email cannot be null")
    @Email(message = "Invalid email format")
    private String universityEmail;

    @Column(nullable = false)
    @Pattern(regexp = "^\\+?[1-9]\\d{9}$", message = "Invalid phone number format")
    @NotNull(message = "Phone cannot be null")
    private String phoneNumber;

    @Column(name = "date_of_birth", nullable = false)
    @NotNull(message = "Birthday cannot be null")
    @Past(message = "Birthday must be in the past")
    private LocalDate dateOfBirth;

    private boolean sex;

    private String role;

    @OneToMany(mappedBy = "user")
    private List<University> universities;

    @OneToMany(mappedBy = "owner")
    private List<Assembly> assemblies;

    @OneToMany(mappedBy = "user")
    private List<Application> applications;

    @OneToMany(mappedBy = "user")
    private List<Publication> publications;

    @ManyToMany
    @JoinTable(
            name = "user_skills",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private List<Skill> skills;

    @ManyToMany
    @JoinTable(
            name = "members",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    private List<Team> teams;


}
