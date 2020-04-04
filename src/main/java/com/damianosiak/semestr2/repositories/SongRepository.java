package com.damianosiak.semestr2.repositories;

import com.damianosiak.semestr2.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {

}
