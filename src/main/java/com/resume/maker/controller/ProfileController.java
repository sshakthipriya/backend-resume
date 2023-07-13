package com.resume.maker.controller;

import com.resume.maker.model.Profile;
import com.resume.maker.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public Profile saveProfile(@RequestBody Profile profile)
    {
        this.profileService.saveProfile(profile);
        return profile;
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Profile getProfile(@PathVariable int id)
    {
        Profile profile = this.profileService.getProfile(id);
        return profile;
    }
}
