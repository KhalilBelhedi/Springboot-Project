package tn.esprit.spring.spring1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numSkieur;
     String nomS;
     String prenomS;
     LocalDate dateNaissance;
     String ville;
    @JsonIgnore
    @OneToMany (mappedBy = "skieur")
     Set<Inscription> inscription;

    @JsonIgnore
    @ManyToMany
     Set<Piste> Skieur_Piste  ;

    @JsonIgnore
    @OneToOne
     Abonnement abonnement;


}
