package com.resume.maker.controller;

import com.resume.maker.model.AdditionalSectionDetails;
import com.resume.maker.service.AdditionalSectionalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/additonalSection")
public class AdditionalSectionalDetailsController
{
    @Autowired
    private AdditionalSectionalDetailsService additionalSectionalDetailsService;

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<AdditionalSectionDetails> saveSections(@RequestBody  List<AdditionalSectionDetails> sections)
    {
        this.additionalSectionalDetailsService.saveSection(sections);
        return sections;
    }

    @GetMapping("/{studentId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<AdditionalSectionDetails> getSection(@PathVariable int studentId)
    {
        return this.additionalSectionalDetailsService.getSections(studentId);
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public int deleteSection(@PathVariable int id)
    {
         this.additionalSectionalDetailsService.deleteSection(id);
         return id;
    }
 }
