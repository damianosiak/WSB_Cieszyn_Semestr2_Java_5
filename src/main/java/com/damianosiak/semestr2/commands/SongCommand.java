package com.damianosiak.semestr2.commands;

import com.damianosiak.semestr2.model.Artist;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class SongCommand {
    private Long id;
    private String title;
    private String genre;
    private String ismn;
    private String year;
    private String publisher;
    private Long artistId;
}