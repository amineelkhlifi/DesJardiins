package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.MovieDto;

public interface MovieService {

    MovieDto findMovie(Long id);

    Long addMovie(MovieDto movieDto);



}
