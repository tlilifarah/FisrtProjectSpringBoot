package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    Etudiant AddEtudiant(Etudiant etudiant);
    Etudiant  UpdateEtudiant(Etudiant etudiant);
    void deleteEtudiant (Etudiant etudiant);
    void deleteEtudiant(Long id);
    List<Etudiant> findAllEtudiant();
    Etudiant findEtudiantById(Long id);

}
