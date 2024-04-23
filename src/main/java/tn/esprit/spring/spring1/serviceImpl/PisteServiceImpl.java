package tn.esprit.spring.spring1.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring1.Entity.Piste;
import tn.esprit.spring.spring1.Repository.PisteRepository;
import tn.esprit.spring.spring1.serviceInterface.IPisteService;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPisteService{
    PisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> RetrieveBySkieur(String nomS, Long numInscription) {
      //  return pisteRepository.findByPisteSkieurNomSLikeAndPisteSkieurInscriptionNumInscription(nomS,numInscription);
    return null;
    }


}
