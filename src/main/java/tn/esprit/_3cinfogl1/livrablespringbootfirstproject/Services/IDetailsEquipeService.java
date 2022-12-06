package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.DetailsEquipe;

import java.util.List;

public interface IDetailsEquipeService {

    DetailsEquipe AddDetailsEquipe(DetailsEquipe de);
    DetailsEquipe  UpdateDetailsEquipe(DetailsEquipe de);
    void deleteDetailsEquipe (DetailsEquipe de);
    void deleteDetailsEquipe (Long id);
    List<DetailsEquipe> findAllDetailsEquipe();
    DetailsEquipe findDetailsEquipeById(Long id);

}
