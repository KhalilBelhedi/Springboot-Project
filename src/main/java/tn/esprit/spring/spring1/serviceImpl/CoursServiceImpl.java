package tn.esprit.spring.spring1.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring1.Entity.Cours;
import tn.esprit.spring.spring1.Repository.CoursRepository;
import tn.esprit.spring.spring1.serviceInterface.ICoursService;

import java.util.List;

@Service
@AllArgsConstructor

public class CoursServiceImpl implements ICoursService {
    CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);}

    @Override
    public Cours test(Long numInscription) {
        return coursRepository.findByInscriptionNumInscription(numInscription);
    }

    @Override
    public Cours findByInscriptionNumInscription(Long numInscription) {
        return coursRepository.findByInscriptionNumInscription(numInscription);
    }


}
