package com.damianosiak.semestr2.repositories;

import com.damianosiak.semestr2.model.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
    Optional<Artist> getFirstByFirstNameAndLastName(String firstName, String lastName);
}