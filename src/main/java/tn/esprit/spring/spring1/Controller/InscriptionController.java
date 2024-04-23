package tn.esprit.spring.spring1.Controller;

import tn.esprit.spring.spring1.Entity.Inscription;
import tn.esprit.spring.spring1.serviceInterface.IInscriptionService;

import java.util.List;

public class InscriptionController {
    IInscriptionService iInscriptionService;

    public List<Inscription> retrieveAllInscriptions() {
        return iInscriptionService.retrieveAllInscriptions();
    }

    public Inscription addInscription(Inscription inscription) {
        return iInscriptionService.addInscription(inscription);
    }

    public Inscription updateInscription(Inscription inscription) {
        return iInscriptionService.updateInscription(inscription);
    }

    public Inscription retrieveInscription(Long numInscription) {
        return iInscriptionService.retrieveInscription(numInscription);
    }

    public Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur) {
        return iInscriptionService.addRegistrationAndAssignToSkier(inscription, numSkieur);
    }
}
