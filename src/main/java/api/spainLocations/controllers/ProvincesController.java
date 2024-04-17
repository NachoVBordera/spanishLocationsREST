package api.spainLocations.controllers;

import api.spainLocations.models.ProvincesModel;
import api.spainLocations.services.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/provinces")
public class ProvincesController {
    @Autowired
    private ProvincesService provincesService;

    @GetMapping
    public ArrayList<ProvincesModel> getProvinces(){
        return this.provincesService.getProvinces();
    }

}
