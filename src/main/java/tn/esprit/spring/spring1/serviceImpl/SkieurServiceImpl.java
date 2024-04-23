package tn.esprit.spring.spring1.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring1.Entity.Skieur;
import tn.esprit.spring.spring1.Repository.SkieurRepository;
import tn.esprit.spring.spring1.serviceInterface.ISkieurService;

import java.util.List;
@Service
@AllArgsConstructor

public class SkieurServiceImpl implements ISkieurService {
    SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
     skieurRepository.deleteById(numSkieur);

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }
}
