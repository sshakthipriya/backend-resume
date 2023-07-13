package com.resume.maker.controller;

import com.resume.maker.model.EducationalDetails;
import com.resume.maker.model.WorkDetails;
import com.resume.maker.service.EducationalDetailsService;
import com.resume.maker.service.WorkDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/workDetails")
public class WorkDetailsController
{
    @Autowired
    private WorkDetailsService workDetailsService;


    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<WorkDetails> saveWorkDetails(@RequestBody List<WorkDetails> workDetailsList)
    {
        this.workDetailsService.saveWorkDetails(workDetailsList);
        return workDetailsList;
    }

    @GetMapping("/{studentId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<WorkDetails> getWorkDetails(@PathVariable int studentId)
    {
        return this.workDetailsService.getWorkDetailsDetails(studentId);
    }
    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public int deleteWorkDetails(@PathVariable int id)
    {
        this.workDetailsService.deleteWorkDetails(id);
        return id;
    }
}
