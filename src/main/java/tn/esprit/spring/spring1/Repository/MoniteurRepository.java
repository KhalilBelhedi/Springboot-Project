package tn.esprit.spring.spring1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.spring1.Entity.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {
}
