package com.example.libraryproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "biography" )
@Getter
@Setter
@NoArgsConstructor
public class Biography {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

//    @OneToOne(mappedBy = "authors")
//    @JoinColumn(name = "authorID")
//    private Biography birthDate;

    @Column(name = "birth_date")
    private LocalDate birthDate;

//    @OneToOne(mappedBy = "authors")
//    @JoinColumn(name = "authorID")
    @Column(name = "birth_place")
    private String birthPlace;

//    @OneToMany(mappedBy = "authors")
//    @JoinColumn(name = "authorID")
//    private List<Author> awards = new ArrayList<>();
}
