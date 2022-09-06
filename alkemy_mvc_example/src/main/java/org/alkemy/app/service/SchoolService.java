package org.alkemy.app.service;

import org.alkemy.app.dto.CourseDTO;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class SchoolService {

    private static final Logger logger = Logger.getLogger(SchoolService.class.getName());

    public CourseDTO saveCourse(CourseDTO newCourseDTO) {
        logger.log(Level.INFO, "Request to save the course : {}", newCourseDTO);
        //TODO: implementar
        return new CourseDTO();
    }

    public CourseDTO findOneCourse(Long id) {
        logger.log(Level.INFO, "Request to get Course : {}", id);
        //TODO: implementar
        return new CourseDTO();
    }

}
