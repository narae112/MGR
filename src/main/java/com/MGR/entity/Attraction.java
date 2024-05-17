package com.MGR.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(length = 10)
    private String condition;
//    boolean condition;
//pull test 2
    //pull test 4
    @Column(columnDefinition = "TEXT")
    private String information;
//pull test
    //pull test 3
    //test 6
    //test 9
    //나래 0219
}
