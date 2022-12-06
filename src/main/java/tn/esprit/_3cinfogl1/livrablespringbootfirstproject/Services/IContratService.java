package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;

import java.util.List;

public interface IContratService {

    Contrat  AddContract(Contrat c);
    Contrat  UpdateContract(Contrat c);
    void deleteContract (Contrat c);
    void deleteContract (Long id);
    List<Contrat> findAllContrat();
    Contrat findContratById(Long id);



}
