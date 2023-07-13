package com.resume.maker.respository;

import com.resume.maker.model.AdditionalSectionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdditionalSectionalDetailsRespository extends JpaRepository<AdditionalSectionDetails,Integer>
{
    List<AdditionalSectionDetails> findByStudentId(Integer studentId);
}
