package tn.esprit.spring.spring1.serviceImpl;

import tn.esprit.spring.spring1.Entity.Inscription;
import tn.esprit.spring.spring1.Entity.Skieur;
import tn.esprit.spring.spring1.Repository.InscriptionRepository;
import tn.esprit.spring.spring1.Repository.SkieurRepository;
import tn.esprit.spring.spring1.serviceInterface.IInscriptionService;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceImpl implements IInscriptionService {
    InscriptionRepository inscriptionRepository;
    SkieurRepository skieurRepository;
    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Override
    public Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }

}