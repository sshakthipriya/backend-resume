package com.resume.maker.service;

import com.resume.maker.model.PersonalDetails;
import com.resume.maker.model.Profile;
import com.resume.maker.respository.ProfileRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRespository profileRespository;

    public void saveProfile(Profile profile)
    {
        this.profileRespository.save(profile);
    }

    public Profile getProfile(int id)
    {
        Optional<Profile> optionalPersonal = profileRespository.findById(id);
        if (optionalPersonal.isPresent())
        {
            Profile profile = optionalPersonal.get();
            return profile;
        }
        else
        {
            return null;
        }
    }
}
