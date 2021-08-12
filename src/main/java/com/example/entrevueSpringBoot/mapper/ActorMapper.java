package com.example.entrevueSpringBoot.mapper;


import com.example.entrevueSpringBoot.repository.entity.Actor;
import com.example.entrevueSpringBoot.model.ActorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",
        uses = { MovieMapper.class },
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ActorMapper {

    @Mapping(target = "movies", ignore = true)
    ActorDto actorToActorDto(Actor actor);
    Actor actorDtoToActor(ActorDto actorDto);
}
