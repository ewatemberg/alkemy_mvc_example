package org.alkemy.app.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.HashSet;
import java.util.Set;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class FullCourseDTO extends CourseDTO {

    private Set<StudentDTO> students = new HashSet<>();


}
