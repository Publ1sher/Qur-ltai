package com.example.quryltai.db.repositories;

import com.example.quryltai.db.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT c FROM Student c WHERE c.universityEmail = :email")
    Optional<Student> findByEmailOptional(String email);
}
