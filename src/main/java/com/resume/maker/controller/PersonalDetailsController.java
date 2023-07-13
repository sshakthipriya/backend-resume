package com.resume.maker.controller;

import com.resume.maker.model.PersonalDetails;
import com.resume.maker.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/personalDetails")
public class PersonalDetailsController {

    @Autowired
    private PersonalDetailsService personalDetailsService;

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public PersonalDetails savePersonal(@RequestBody PersonalDetails personal)
    {
        personalDetailsService.savePersonalDetails(personal);
        return personal;
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public PersonalDetails getPersonal(@PathVariable int id)
    {
        return this.personalDetailsService.getPersonalDetails(id);
    }
}
