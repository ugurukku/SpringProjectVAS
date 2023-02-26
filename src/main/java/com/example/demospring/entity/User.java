package com.example.demospring.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "istifadeciler")
public class User {

    @Id
    private Integer id;

    @Column(name = "tam_ad")
    private String fullName;

    @Column(name = "tevellud")
    private LocalDate age;
}
