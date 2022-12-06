package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Departement;

import java.util.List;

public interface IDepartementService {
    Departement AddDepartement(Departement d);
    Departement  UpdateDepartement (Departement d);
    void deleteDepartement (Departement d);
    //void deleteDepartement (Long id);
    List<Departement> findAllDepartement();
    //Departement findDepartementById(Long id);

}
