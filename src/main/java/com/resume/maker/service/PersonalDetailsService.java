package com.resume.maker.service;

import com.resume.maker.model.PersonalDetails;
import com.resume.maker.respository.PersonalDetailsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class PersonalDetailsService {
    @Autowired
    private PersonalDetailsRespository personalDetailsRespository;

    public void savePersonalDetails(PersonalDetails personal)
    {
        personalDetailsRespository.save(personal);
    }

    public PersonalDetails getPersonalDetails(int id)
    {
        Optional<PersonalDetails> optionalPersonal = personalDetailsRespository.findById(id);
        if (optionalPersonal.isPresent())
        {
            PersonalDetails personal = optionalPersonal.get();
            return personal;
        }
        else
        {
            return null;
        }
    }
}
