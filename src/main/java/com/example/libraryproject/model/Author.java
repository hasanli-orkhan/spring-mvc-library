package com.example.libraryproject.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "authors" )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long authorID;

    private String name;

    @Column(length = 1000)
    private String surname;
//
//    @ManyToMany
//    private List<Book> writtenBooks = new ArrayList<>();

    @Embedded
    private Test test;

    @OneToOne
    @JoinColumn(name = "bioID")
    private Biography biography;

    @Enumerated(value = EnumType.ORDINAL)
    private Nationality nationality;


}
