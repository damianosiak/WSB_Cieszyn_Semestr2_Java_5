package com.damianosiak.semestr2.repositories;

import com.damianosiak.semestr2.model.Artist;
import com.damianosiak.semestr2.model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {

    List<Song> getAllByArtistsIsContaining(Artist artist);
}