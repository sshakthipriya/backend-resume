package com.resume.maker.controller;

import com.resume.maker.model.SkillDetails;
import com.resume.maker.service.SkillsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/skillsDetails")
public class SkillsDetailsController {

    @Autowired
    private SkillsDetailsService skillsDetailsService;

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<SkillDetails> saveSkillsDetails(@RequestBody List<SkillDetails> skills)
    {
        this.skillsDetailsService.saveSkillsDetails(skills);
        return skills;
    }

    @GetMapping("/{studentId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<SkillDetails> getSkillsDetails(@PathVariable int studentId)
    {
        return this.skillsDetailsService.getSkillsDetails(studentId);
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public int deleteSkillDetails(@PathVariable int id)
    {
        this.skillsDetailsService.deleteSkillDetail(id);
        return id;
    }
}
