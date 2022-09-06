package org.alkemy.app.service;

import org.alkemy.app.dto.StudentDTO;

public interface StudentService {

    /**
     * Este metodo me permite guardar un nuevo estudiante en la BD
     * @param newStudentDTO
     * @return
     */
    public StudentDTO save(StudentDTO newStudentDTO);

    /**
     * Este metodo me permite obtener un estudiante por id
     * @param id
     * @return
     */
    public StudentDTO findOne(Long id);
}
