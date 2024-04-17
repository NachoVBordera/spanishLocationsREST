package api.spainLocations.services;

import api.spainLocations.models.ProvincesModel;
import api.spainLocations.repositories.IProvincesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProvincesService {

    @Autowired
    IProvincesRepository provincesRepository;

    public ArrayList<ProvincesModel> getProvinces(){

        return (ArrayList<ProvincesModel>) provincesRepository.findAll();
    }
}
