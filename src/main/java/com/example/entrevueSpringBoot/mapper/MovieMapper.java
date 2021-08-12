package com.example.entrevueSpringBoot.mapper;


import com.example.entrevueSpringBoot.repository.entity.Movie;
import com.example.entrevueSpringBoot.model.MovieDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",
        uses = { ActorMapper.class },
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS )
public interface MovieMapper {

    MovieDto movieToMovieDto(Movie movie);
    Movie movieDtoToMovie(MovieDto movieDto);
}
