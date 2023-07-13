package com.resume.maker.respository;

import com.resume.maker.model.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDetailsRespository  extends JpaRepository<PersonalDetails, Integer>
{
}
