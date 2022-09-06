package org.alkemy.app.service.impl;

import org.alkemy.app.dto.CourseDTO;
import org.alkemy.app.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class CourseServiceImpl implements CourseService {

    private static final Logger logger = Logger.getLogger(CourseServiceImpl.class.getName());

    public CourseDTO save(CourseDTO newCourseDTO) {
        logger.log(Level.INFO, "Request to save the course : {}", newCourseDTO);
        //TODO: implementar
        return new CourseDTO();
    }

    public CourseDTO findOne(Long id) {
        logger.log(Level.INFO, "Request to get Course : {}", id);
        //TODO: implementar
        return new CourseDTO();
    }

}
