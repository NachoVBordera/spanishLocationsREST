package api.spainLocations.services;

import api.spainLocations.models.CcaaModel;
import api.spainLocations.repositories.ICcaaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CcaaService {

    @Autowired
    ICcaaRepository ccaaRepository;

    public ArrayList<CcaaModel> getCcaa(){

        return (ArrayList<CcaaModel>) ccaaRepository.findAll();
    }
}
