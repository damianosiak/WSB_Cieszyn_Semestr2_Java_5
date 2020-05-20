package com.damianosiak.semestr2.converters;
import com.damianosiak.semestr2.commands.SongCommand;
import com.damianosiak.semestr2.model.Artist;
import com.damianosiak.semestr2.model.Song;
import com.damianosiak.semestr2.repositories.ArtistRepository;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by pk on 2019-06-03
 */
@Component
public class SongCommandToSong implements Converter<SongCommand, Song> {

    private ArtistRepository artistRepository;

    public SongCommandToSong(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Synchronized
    @Nullable
    @Override
    public Song convert(SongCommand source) {
        if (source == null) {
            return null;
        }

        final Song song = new Song();
        song.setId(source.getId());
        song.setTitle(source.getTitle());
        song.setGenre(source.getGenre());
        song.setYear(source.getYear());
        song.setIsmn(source.getIsmn());
        song.setPublisher(source.getPublisher());

        Optional<Artist> artist = artistRepository.findById(source.getArtistId());

        if (artist.isPresent()) {
            song.getArtists().add(artist.get());
        }

        return song;
    }
}
