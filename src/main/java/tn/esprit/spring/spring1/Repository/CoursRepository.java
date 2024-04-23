package tn.esprit.spring.spring1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.spring1.Entity.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
    Cours findByInscriptionNumInscription(Long numInscription);
}
