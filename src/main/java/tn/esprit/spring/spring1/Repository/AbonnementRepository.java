package tn.esprit.spring.spring1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.spring.spring1.Entity.Abonnement;

import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {

//@Query(value = " SELECT a.numAbon ,s.numSkieur, s.firstName , s.lastName FROM Abonnement a JOIN Skieur s ON a.numSkieur = s.numSkieur WHERE a.dateFin BETWEEN SYSDATE AND SYSDATE + INTERVAL 7 DAY ",nativeQuery = true)
  //   List<Abonnement> retreiveSubscriptions();
@Query("select a from Abonnement a where a.dateFin < current date ")
List<Abonnement> getSubscriptionBydate();

}

