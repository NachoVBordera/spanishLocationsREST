package api.spainLocations.controllers;

import api.spainLocations.models.CcaaModel;
import api.spainLocations.services.CcaaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/ccaa")
public class CcaaController {
    @Autowired
    private CcaaService ccaaService;

    @GetMapping
    public ArrayList<CcaaModel> getCcaa(){
       return this.ccaaService.getCcaa();
    }

}
