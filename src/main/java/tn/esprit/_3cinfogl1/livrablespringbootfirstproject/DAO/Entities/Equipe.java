package tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau ;
    @OneToOne
    private DetailsEquipe d;

    @ManyToMany
    List<Etudiant> etudiants;


}
