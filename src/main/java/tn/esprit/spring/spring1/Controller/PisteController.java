package tn.esprit.spring.spring1.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring1.Entity.Piste;
import tn.esprit.spring.spring1.serviceInterface.IPisteService;

import java.util.List;
@Tag(name = "Gestion Pistes")
@RestController
@RequestMapping("/Piste")
@AllArgsConstructor
public class PisteController {
    IPisteService pisteService;

    @GetMapping("/retrieveAllPistes")

    public List<Piste> retrieveAllPistes() {
        return pisteService.retrieveAllPistes();
    }
@PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }
@GetMapping("/retrievePiste/{numPiste}")
    public Piste retrievePiste(@PathVariable("numPiste") Long numPiste) {
        return pisteService.retrievePiste(numPiste);
    }
@GetMapping
    public List<Piste> RetrieveBySkieur(String nomS, Long numInscription) {
        return pisteService.RetrieveBySkieur(nomS, numInscription);
    }

}
