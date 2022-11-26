package tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long idDepartement ;
      private String nomDepartement;

      @OneToMany(mappedBy = "depart")
       List<Etudiant> etudiants;
}
