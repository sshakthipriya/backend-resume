package com.resume.maker.respository;

import com.resume.maker.model.SkillDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillDetailsRespository extends JpaRepository<SkillDetails,Integer> {
    List<SkillDetails> findByStudentId(Integer studentId);
}
