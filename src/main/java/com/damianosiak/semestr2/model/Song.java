package com.damianosiak.semestr2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genre;
    private String ismn;
    private String year;
    private String publisher;

    @ManyToMany
    private Set<Artist> artists = new HashSet<>();

    public Song(String title, String genre, String ismn, String year, String publisher) {
        this.title = title;
        this.genre = genre;
        this.ismn = ismn;
        this.year = year;
        this.publisher = publisher;
    }
}