package org.alkemy.app.controller;

import org.alkemy.app.config.ApiVersion;
import org.alkemy.app.dto.CourseDTO;
import org.alkemy.app.service.SchoolService;
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
public class SchoolController {

    Logger logger = Logger.getLogger(SchoolController.class.getName());

    public static final String PATH = "/courses";
    public static final String PATH_ID = PATH + "/{id}";

    private SchoolService schoolService = new SchoolService();

    /**
     * Crea un nuevo curso
     *
     * @param courseDTO
     * @return
     */
    @PostMapping(value = ApiVersion.V1 + PATH)
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO) {
        logger.log(Level.INFO, "REST request to save Course : {}", courseDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(schoolService.saveCourse(courseDTO));
    }


    /**
     * Obtiene la informacion de un curso por id
     *
     * @param id
     * @return
     */
    @GetMapping(ApiVersion.V1 + PATH_ID)
    public ResponseEntity<CourseDTO> get(@PathVariable Long id) {
        logger.log(Level.INFO, "REST request to get Course : {}", id);
        return ResponseEntity
                .ok()
                .body(schoolService.findOneCourse(id));
    }

}
