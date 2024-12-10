package com.example.quryltai.db.entities;

import com.example.quryltai.db.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "universities")
public class University extends BaseEntity {

    @Column(name = "name")
    private String name;
}
