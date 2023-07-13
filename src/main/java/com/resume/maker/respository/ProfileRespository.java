package com.resume.maker.respository;
import com.resume.maker.model.PersonalDetails;
import com.resume.maker.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRespository extends JpaRepository<Profile, Integer>
{
}
