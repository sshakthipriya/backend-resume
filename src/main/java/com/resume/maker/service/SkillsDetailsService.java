package com.resume.maker.service;

import com.resume.maker.model.SkillDetails;
import com.resume.maker.respository.SkillDetailsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsDetailsService {

    @Autowired
    private SkillDetailsRespository skillDetailsRespository;

    public void saveSkillsDetails(List<SkillDetails> skills)
    {
        this.skillDetailsRespository.saveAll(skills);
    }

    public List<SkillDetails> getSkillsDetails(int studentId)
    {
        List<SkillDetails> skills = this.skillDetailsRespository.findByStudentId(studentId);
        return skills;
    }


    public void deleteSkillDetail(int id)
    {
        this.skillDetailsRespository.deleteById(id);
    }
}
