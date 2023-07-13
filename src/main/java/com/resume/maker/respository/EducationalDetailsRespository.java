package com.resume.maker.respository;

import com.resume.maker.model.EducationalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationalDetailsRespository extends JpaRepository<EducationalDetails,Integer> {
    List<EducationalDetails> findByStudentId(Integer studentId);
}
