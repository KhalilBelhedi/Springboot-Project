package tn.esprit.spring.spring1.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring1.Entity.Moniteur;
import tn.esprit.spring.spring1.serviceInterface.IMoniteurService;

import java.util.List;
@Tag(name = "Gestion Moniteurs")
@RestController
@RequestMapping("/Moniteur")
@AllArgsConstructor
public class MoniteurController {
    IMoniteurService moniteurService;
@GetMapping("/retrieveAllMoniteurs")
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurService.retrieveAllMoniteurs();
    }
@PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.addMoniteur(moniteur);
    }
@PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.updateMoniteur(moniteur);
    }
@GetMapping("/retrieveMoniteur/{numMoniteur1}")
    public Moniteur retrieveMoniteur(@PathVariable("numMoniteur1") Long numMoniteur) {
        return moniteurService.retrieveMoniteur(numMoniteur);
    }
}
