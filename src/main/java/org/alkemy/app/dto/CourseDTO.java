package org.alkemy.app.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CourseDTO {

    private Long id;
    private String name;
    private int maximumCapacity;

}
