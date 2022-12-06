package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Equipe;

import java.util.List;

public interface IEquipeService {

    Equipe AddEquipe(Equipe e);
    Equipe  UpdateEquipe(Equipe e);
    void deleteEquipe(Equipe e);
    void deleteEquipe(Long id);
    List<Equipe> findAllEquipe();
    Equipe findEquipeById(Long id);

}
