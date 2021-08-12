package com.example.entrevueSpringBoot.service.impl;

import com.example.entrevueSpringBoot.model.MovieDto;
import com.example.entrevueSpringBoot.repository.MovieRepository;
import com.example.entrevueSpringBoot.repository.entity.Movie;
import com.example.entrevueSpringBoot.service.MovieService;
import com.example.entrevueSpringBoot.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public MovieDto findMovie(Long id) {
        Optional<Movie> foundedMovie = movieRepository.findById(id);
        return foundedMovie.map(movie -> movieMapper.movieToMovieDto(movie)).orElse(null);
    }

    @Override
    public Long addMovie(MovieDto movieDto) {
        Movie movie = movieRepository.save(movieMapper.movieDtoToMovie(movieDto));
        return movie.getId();
    }
}
