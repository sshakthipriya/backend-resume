package com.resume.maker.controller;

import com.resume.maker.model.User;
import com.resume.maker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/customer")
public class CustomerController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public User saveUser(@RequestBody User theUser)
    {
        userService.saveUser(theUser) ;
        return theUser;
    }

    @GetMapping("/{email}/{password}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<User> findByEmail(@PathVariable String email,@PathVariable String password)
    {
        User theUser = userService.findByEmail(email,password);
        if (theUser != null) {
            return ResponseEntity.ok(theUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
