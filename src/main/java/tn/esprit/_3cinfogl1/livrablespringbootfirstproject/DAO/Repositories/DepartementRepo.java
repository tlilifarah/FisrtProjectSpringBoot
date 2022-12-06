package tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Departement;

public interface DepartementRepo extends CrudRepository <Departement,Long> {
}
