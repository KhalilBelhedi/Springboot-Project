package tn.esprit.spring.spring1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
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
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCours;
    Integer niveau ;
    @Enumerated(EnumType.STRING)
    Support support;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;


    Float prix;
    Integer creneau ;
    @OneToMany (mappedBy = "cours")
@JsonIgnore
     Set<Inscription> inscription;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
     Moniteur moniteur;
}
