package tn.esprit.spring.spring1.serviceInterface;

import tn.esprit.spring.spring1.Entity.Piste;

import java.util.List;

public interface IPisteService {
    List <Piste> retrieveAllPistes();
    Piste addPiste(Piste  piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
    List <Piste> RetrieveBySkieur(String nomS,Long numInscription);
}
