package tn.esprit.spring.spring1.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring1.Entity.Skieur;
import tn.esprit.spring.spring1.serviceInterface.ISkieurService;

import java.util.List;
@Tag(name = "Gestion Skieurs")
@RestController
@RequestMapping("/Skieur")
@AllArgsConstructor
public class SkieurController {
    ISkieurService skieurService;
    @Operation(description = "Affichage Skieurs")
    @GetMapping("/retrieveAllSkieurs")
    public List<Skieur> retrieveAllSkieurs() {
        return skieurService.retrieveAllSkieurs();
    }

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return skieurService.addSkieur(skieur);
    }

    @DeleteMapping("/removeSkieur/{numSkieur}")
    public void removeSkieur(@PathVariable("numSkieur")Long numSkieur) {
        skieurService.removeSkieur(numSkieur);
    }

    @GetMapping("/retrieveSkieur/{numSkieur1}")
    public Skieur retrieveSkieur(@PathVariable("numSkieur1")Long numSkieur) {
        return skieurService.retrieveSkieur(numSkieur);
    }
}
