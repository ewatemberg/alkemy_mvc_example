package org.alkemy.app.service.impl;

import org.alkemy.app.dto.StudentDTO;
import org.alkemy.app.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = Logger.getLogger(StudentServiceImpl.class.getName());

    public StudentDTO save(StudentDTO newStudentDTO) {
        logger.log(Level.INFO, "Request to save the student : {}", newStudentDTO);
        //TODO: implementar
        return new StudentDTO();
    }

    public StudentDTO findOne(Long id) {
        logger.log(Level.INFO, "Request to get student : {}", id);
        //TODO: implementar
        return new StudentDTO();
    }

}
