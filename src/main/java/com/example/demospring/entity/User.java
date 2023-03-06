package com.example.demospring.entity;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "istifadeciler")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "tam_ad")
    @JsonAlias(value = "tam_ad")
    private String fullName;

    @Column(name = "tevellud")
    private LocalDate age;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    List<Blog> blogs;

}
