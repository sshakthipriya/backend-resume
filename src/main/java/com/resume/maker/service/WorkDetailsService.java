package com.resume.maker.service;

import com.resume.maker.model.EducationalDetails;
import com.resume.maker.model.WorkDetails;
import com.resume.maker.respository.EducationalDetailsRespository;
import com.resume.maker.respository.WorkDetailsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkDetailsService {

    @Autowired
    private WorkDetailsRespository workDetailsRespository;

    public void saveWorkDetails(List<WorkDetails> workDetails)
    {
        this.workDetailsRespository.saveAll(workDetails);
    }

    public List<WorkDetails> getWorkDetailsDetails(int studentId)
    {
        List<WorkDetails> workDetailsList = this.workDetailsRespository.findByStudentId(studentId);
        return workDetailsList;
    }

    public void deleteWorkDetails(int id)
    {
        this.workDetailsRespository.deleteById(id);
    }
}
