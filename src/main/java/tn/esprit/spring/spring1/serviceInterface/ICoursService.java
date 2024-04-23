package tn.esprit.spring.spring1.serviceInterface;

import tn.esprit.spring.spring1.Entity.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours  cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    Cours test (Long numInscription);

    Cours findByInscriptionNumInscription(Long numInscription);
}
