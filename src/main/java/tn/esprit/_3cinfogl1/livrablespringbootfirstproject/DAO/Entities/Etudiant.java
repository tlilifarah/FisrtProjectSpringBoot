package tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;

    @ManyToOne
    Departement depart;

    @ManyToMany(mappedBy = "etudiants")
    List<Equipe> equipes;

    @OneToMany(mappedBy = "etudiant")
    List<Contrat> contrats;



}
