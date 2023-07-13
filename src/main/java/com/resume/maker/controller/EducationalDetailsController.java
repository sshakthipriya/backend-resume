package com.resume.maker.controller;

import com.resume.maker.model.EducationalDetails;
import com.resume.maker.service.EducationalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/educationalDetails")
public class EducationalDetailsController
{
    @Autowired
    private EducationalDetailsService educationalDetailsService;


    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<EducationalDetails> saveEducationalDetails(@RequestBody List<EducationalDetails> educationList)
    {
        this.educationalDetailsService.saveEducationalDetails(educationList);
        return educationList;
    }

    @GetMapping("/{studentId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<EducationalDetails> getEducationalDetails(@PathVariable int studentId)
    {
        return this.educationalDetailsService.getEducationalDetails(studentId);
    }
    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public int deleteEducationDetails(@PathVariable int id)
    {
        this.educationalDetailsService.deleteEducationDetails(id);
        return id;
    }
}
