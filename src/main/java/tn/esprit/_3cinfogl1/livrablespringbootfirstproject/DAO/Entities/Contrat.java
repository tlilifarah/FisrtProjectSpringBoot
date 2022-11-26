package tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="t_contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id" )
    private long idContrat;
    @Temporal(TemporalType.DATE)
    private Date datedebutC;
    @Temporal(TemporalType.DATE)
    private Date datefinC;
    //@Enumerated(EnumType.ORDINAL)
    @Enumerated(EnumType.STRING)
    private  Specialite specialite;
    private boolean archive;
    private float montanC;

    @ManyToOne
    private Etudiant etudiant;

}
