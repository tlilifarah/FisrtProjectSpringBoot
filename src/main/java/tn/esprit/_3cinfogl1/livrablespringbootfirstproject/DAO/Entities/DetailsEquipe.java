package tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailsEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailsEquipe;
    private Integer salle;
    private String thematique;
    @OneToOne(mappedBy = "d")
    private Equipe e;
}