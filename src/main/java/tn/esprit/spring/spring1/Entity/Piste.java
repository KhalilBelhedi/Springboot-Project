package tn.esprit.spring.spring1.Entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
 // @Table (name = "Piste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numPiste;
    @Enumerated(EnumType.STRING)
    Couleur couleur;

    // private LocalDate date;

   String nomPiste;
   Integer longueur ;
   Integer Pent ;
    @ManyToMany(mappedBy = "Skieur_Piste")
    Set<Skieur> PisteSkieur ;


}
