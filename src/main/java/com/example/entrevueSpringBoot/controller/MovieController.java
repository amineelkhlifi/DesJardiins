package com.example.entrevueSpringBoot.controller;

import com.example.entrevueSpringBoot.api.MovieApi;
import com.example.entrevueSpringBoot.model.MovieDto;
import com.example.entrevueSpringBoot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController implements MovieApi {

    @Autowired
    private MovieService movieService;

    @Override
    public ResponseEntity<Long> addMovie(MovieDto movie) {
        Long addedMovieId = movieService.addMovie(movie);
        return new ResponseEntity<>(addedMovieId, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<MovieDto> getMovieById(Long id) {
        MovieDto movieDto = movieService.findMovie(id);

        return movieDto == null ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(movieDto, HttpStatus.OK);
    }
}
