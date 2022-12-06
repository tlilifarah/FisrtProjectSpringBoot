package tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories;

import org.apache.catalina.LifecycleState;
import org.springframework.data.repository.CrudRepository;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;

import java.util.Date;
import java.util.List;

public interface ContratRepo extends CrudRepository<Contrat,Long > {

    //select * from contrat where archive =(valeur passer en parametre)
    List<Contrat> getByArchive (boolean archive);
    //select * from contrat where archive = (parm) and datedebutc =()
    List<Contrat> getByArchiveAndDatedebutC(boolean archive , Date date);
    //select * from contrat where archive > (parm) and datedebutc < (param)
    List<Contrat> getByDatedebutCBetween(Date date1 , Date date2);
}
