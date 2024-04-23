package tn.esprit.spring.spring1.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.spring1.Entity.Cours;
import tn.esprit.spring.spring1.serviceInterface.ICoursService;

import java.util.List;
@Tag(name = "Gestion Cours")
@RestController
@RequestMapping("/Cours")
@AllArgsConstructor
public class CoursController {

   ICoursService coursService;
@GetMapping("/retrieveAllCourses")
    public List<Cours> retrieveAllCourses() {
        return coursService.retrieveAllCourses();
    }
@PostMapping("/addCours")
    public Cours addCours(@RequestBody Cours cours) {
        return coursService.addCours(cours);
    }
@PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours cours) {
        return coursService.updateCours(cours);
    }
@GetMapping("/test/{numInscription}")
    public Cours test(@PathVariable("numInscription") Long numInscription) {
        return coursService.test(numInscription);
    }

    @GetMapping("/retrieveCours/{numCours}")
    public Cours retrieveCours(@PathVariable("numCours") Long numCours) {
        return coursService.retrieveCours(numCours);


    }
}
