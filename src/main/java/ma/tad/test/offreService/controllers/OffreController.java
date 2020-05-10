package ma.tad.test.offreService.controllers;


import ma.tad.test.offreService.entities.Offre;
import ma.tad.test.offreService.services.IOffreService;
import ma.tad.test.offreService.services.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OffreController {

    private final IOffreService offreService;

    public OffreController(IOffreService offreService) {
        this.offreService = offreService;
    }

    @RequestMapping("/offres")
    public List<Offre> findAll(){
        final List<Offre> all = offreService.findAll();
        return all;
    }


    @GetMapping("/offres/{id}")
    public Offre findOne(@PathVariable("id") Long id){
        System.out.println("id = " + id);
        final Offre offre = offreService.findOne(id);
        return offre;
    }

    @PostMapping("/offres")
    public Offre saveOffre(@RequestBody Offre offre){
        Offre offreSaved = offreService.saveOffre(offre);
        return offreSaved;
    }

}
