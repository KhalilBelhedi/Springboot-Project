package tn.esprit.spring.spring1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.spring1.Entity.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
}
