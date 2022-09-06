package org.alkemy.app.service;

import org.alkemy.app.dto.CourseDTO;

public interface CourseService {

    /**
     * Este metodo me permite guardar un nuevo curso en la BD
     * @param newCourseDTO
     * @return
     */
    public CourseDTO save(CourseDTO newCourseDTO);

    /**
     * Este metodo me permite obtener un curso por id
     * @param id
     * @return
     */
    public CourseDTO findOne(Long id);

}
