package tn.esprit.spring.spring1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.spring1.Entity.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
  //  Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur);
}
