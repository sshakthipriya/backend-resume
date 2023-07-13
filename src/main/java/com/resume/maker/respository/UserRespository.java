package com.resume.maker.respository;

import com.resume.maker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Integer> {
   User findByEmail(String email);
}
