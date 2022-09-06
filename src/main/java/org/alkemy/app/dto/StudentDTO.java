package org.alkemy.app.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
