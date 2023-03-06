package com.example.demospring.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "paylashimlar")
public class Blog {

    @Id
    @GeneratedValue
    Integer id;

    @Column(name = "blog_bashligi")
    String header;

    @Column(name = "blog_kontenti")
    String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
}
