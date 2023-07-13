package com.resume.maker.service;

import com.resume.maker.model.AdditionalSectionDetails;
import com.resume.maker.respository.AdditionalSectionalDetailsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditionalSectionalDetailsService
{
    @Autowired
    private AdditionalSectionalDetailsRespository additionalSectionalDetailsRespository;


    public void saveSection(List<AdditionalSectionDetails> sections)
    {
        this.additionalSectionalDetailsRespository.saveAll(sections);
    }

    public List<AdditionalSectionDetails> getSections(int studentId)
    {
        return this.additionalSectionalDetailsRespository.findByStudentId(studentId);
    }

    public void deleteSection(int id)
    {
        this.additionalSectionalDetailsRespository.deleteById(id);
    }
}
