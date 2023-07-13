package com.resume.maker.service;

import com.resume.maker.model.User;
import com.resume.maker.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRespository userRespository;

    public void saveUser(User theUser)
    {
        userRespository.save(theUser);
    }

    public User findByEmail(String email,String password)
    {
        User theUser = userRespository.findByEmail(email);
        if(theUser != null && theUser.getPassword().equals(password))
        {
            return theUser;
        }
        else
        {
            return null;
        }

    }
}
