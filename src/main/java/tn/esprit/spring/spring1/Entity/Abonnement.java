package tn.esprit.spring.spring1.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Abonnement implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long numAbon ;
    LocalDate dateDebut;
    LocalDate dateFin;

    Float prixAbon ;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbon ;


}
