package tn.esprit.spring.spring1.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring1.Entity.Moniteur;
import tn.esprit.spring.spring1.Repository.MoniteurRepository;
import tn.esprit.spring.spring1.serviceInterface.IMoniteurService;

import java.util.List;
@Service
@AllArgsConstructor
public class MoniteurServiceImpl implements IMoniteurService {
    MoniteurRepository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }
}
