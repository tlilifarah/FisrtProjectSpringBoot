package tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite ;
    private String nomUniversite;

    @OneToMany
    List<Departement> departements;
}
