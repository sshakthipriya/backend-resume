package com.resume.maker.respository;


import com.resume.maker.model.WorkDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkDetailsRespository extends JpaRepository<WorkDetails,Integer> {
    List<WorkDetails> findByStudentId(Integer studentId);
}
