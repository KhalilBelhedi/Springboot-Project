package tn.esprit.spring.spring1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.spring1.Entity.Piste;
import java.util.List;


@Repository
public interface PisteRepository extends JpaRepository<Piste,Long> {
  //  List<Piste> findByPisteSkieurNomSLikeAndPisteSkieurInscriptionNumInscription(String nomS, Long numInscription);
    //List <Piste> findByPisteSkieur
}
