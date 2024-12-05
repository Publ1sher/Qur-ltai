package com.example.quryltai.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increment PK
    private Long id;

    @Column(unique = true, nullable = false)
    @NotNull(message = "Login cannot be null")
    private String userName;

    @Column(nullable = false)
    @NotNull(message = "Password cannot be null")
    private String passwordHash;

    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "Surname cannot be null")
    private String surname;

    @NotNull(message = "Personal email cannot be null")
    @Email(message = "Invalid email format")
    private String personalEmail;

    @NotNull(message = "Personal email cannot be null")
    @Email(message = "Invalid email format")
    private String universityEmail;

    @Pattern(regexp = "^\\+?[1-9]\\d{9}$", message = "Invalid phone number format")
    @NotNull(message = "Phone cannot be null")
    private String phoneNumber;

    @Column(name = "date_od_birth", nullable = false)
    @NotNull(message = "Birthday cannot be null")
    @Past(message = "Birthday must be in the past")
    private LocalDate date_od_birth;

    private boolean isMale;  // Use Java naming convention

    private String role;
}
