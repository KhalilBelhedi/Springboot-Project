package tn.esprit.spring.spring1.serviceInterface;

import tn.esprit.spring.spring1.Entity.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();

    Inscription addInscription(Inscription inscription);

    Inscription updateInscription(Inscription inscription);

    Inscription retrieveInscription(Long numInscription);

    Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur);

}
