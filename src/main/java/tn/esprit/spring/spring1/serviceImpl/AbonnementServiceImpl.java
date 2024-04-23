package tn.esprit.spring.spring1.serviceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.spring1.Entity.Abonnement;
import tn.esprit.spring.spring1.Entity.Skieur;
import tn.esprit.spring.spring1.Repository.AbonnementRepository;
import tn.esprit.spring.spring1.Repository.SkieurRepository;
import tn.esprit.spring.spring1.serviceInterface.IAbonnementService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class AbonnementServiceImpl implements IAbonnementService {
    AbonnementRepository abonnementRepository;
    SkieurRepository skieurRepository;

    @Override
    public void retreiveSubscriptions() {

        List<Abonnement> abonnements = new ArrayList<>();
        abonnements = abonnementRepository.getSubscriptionBydate();


        List<Abonnement> list = new ArrayList<>();
        for (Abonnement abon : abonnements) {
            long difference = ChronoUnit.DAYS.between(LocalDate.now(), abon.getDateFin());
            if (difference > 7){
                log.info(abon.getNumAbon().toString()+"|"+abon.getDateFin().toString());
            }

        }

    }

}
