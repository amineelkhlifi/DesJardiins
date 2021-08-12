package com.example.entrevueSpringBoot.model;

import java.util.Objects;
import com.example.entrevueSpringBoot.model.ActorDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MovieDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-12T16:57:50.640+01:00[Africa/Casablanca]")
public class MovieDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("actors")
  @Valid
  private List<ActorDto> actors = null;

  public MovieDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MovieDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MovieDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MovieDto actors(List<ActorDto> actors) {
    this.actors = actors;
    return this;
  }

  public MovieDto addActorsItem(ActorDto actorsItem) {
    if (this.actors == null) {
      this.actors = new ArrayList<>();
    }
    this.actors.add(actorsItem);
    return this;
  }

  /**
   * Get actors
   * @return actors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ActorDto> getActors() {
    return actors;
  }

  public void setActors(List<ActorDto> actors) {
    this.actors = actors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieDto movieDto = (MovieDto) o;
    return Objects.equals(this.id, movieDto.id) &&
        Objects.equals(this.title, movieDto.title) &&
        Objects.equals(this.description, movieDto.description) &&
        Objects.equals(this.actors, movieDto.actors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, actors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

