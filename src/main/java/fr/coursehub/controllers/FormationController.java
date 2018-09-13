package fr.coursehub.controllers;


import fr.coursehub.model.Formation;
import fr.coursehub.model.Sujet;
import fr.coursehub.repositories.FormationRepository;
import fr.coursehub.repositories.SujetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
public class FormationController {
    @Autowired
    private FormationRepository formationRepository;
    @Autowired
    private SujetRepository sujetRepository;

    @RequestMapping(value="/formations",method=RequestMethod.GET)
    public List<Formation> getFormations(){
        return formationRepository.findAll();
    }

  /*  @RequestMapping(value="/formations/{id}/sujets/",method=RequestMethod.GET)
    public Set<Sujet> getSujetsByFormation(@PathVariable long id){
        return sujetRepository.getSujetsFormationID(id);
    }*/

    @GetMapping(value="/formations/{id}")
    public Formation getFormation(@PathVariable long id){
        return formationRepository.findById(id).get();
    }
}
