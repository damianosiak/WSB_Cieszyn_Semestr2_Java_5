package com.damianosiak.semestr2.repositories;

import com.damianosiak.semestr2.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
