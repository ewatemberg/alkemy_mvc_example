package org.alkemy.app.controller;

import org.alkemy.app.config.ApiVersion;
import org.alkemy.app.dto.StudentDTO;
import org.alkemy.app.service.StudentService;
import org.alkemy.app.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class StudentController {

    Logger logger = Logger.getLogger(StudentController.class.getName());

    public static final String PATH = "/students";
    public static final String PATH_ID = PATH + "/{id}";

    @Autowired //patron creacional (singleton)
    private StudentService studentService;

    /**
     * Crea un nuevo estudiante
     *
     * @param studentDTO
     * @return
     */
    @PostMapping(value = ApiVersion.V1 + PATH)
    public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO studentDTO) {
        logger.log(Level.INFO, "REST request to save Student : {}", studentDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(studentService.save(studentDTO));
    }


    /**
     * Obtiene la informacion de un estudiante por id
     *
     * @param id
     * @return
     */
    @GetMapping(ApiVersion.V1 + PATH_ID)
    public ResponseEntity<StudentDTO> get(@PathVariable Long id) {
        logger.log(Level.INFO, "REST request to get Student : {}", id);
        return ResponseEntity
                .ok()
                .body(studentService.findOne(id));
    }

}
