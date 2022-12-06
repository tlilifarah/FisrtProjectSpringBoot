package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Departement;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories.DepartementRepo;

import java.util.List;

@Service
public class DepartementService implements IDepartementService {

    @Autowired //pour crer linstance f spring IOC
    private DepartementRepo dr;

    @Override
    public Departement AddDepartement (Departement d) {
        return dr.save(d);
    }
    public Departement UpdateDepartement(Departement d) {
        return dr.save(d);
    }
    public void deleteDepartement (Departement d){
         dr.delete(d);
    }
    public List<Departement> findAllDepartement() {
        return (List<Departement>) dr.findAll();
    }
}
