package com.resume.maker.service;

import com.resume.maker.model.EducationalDetails;
import com.resume.maker.respository.EducationalDetailsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationalDetailsService {

    @Autowired
    private EducationalDetailsRespository educationalDetailsRespository;

    public void saveEducationalDetails(List<EducationalDetails> educationalList)
    {
        this.educationalDetailsRespository.saveAll(educationalList);
    }

    public List<EducationalDetails> getEducationalDetails(int studentId)
    {
        List<EducationalDetails> educationalList = this.educationalDetailsRespository.findByStudentId(studentId);
        return educationalList;
    }

    public void deleteEducationDetails(int id)
    {
        this.educationalDetailsRespository.deleteById(id);
    }
}
