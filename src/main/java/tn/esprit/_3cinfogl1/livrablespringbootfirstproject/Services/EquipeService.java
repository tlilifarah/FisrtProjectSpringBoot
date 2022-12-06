package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Equipe;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories.EquipeRepo;

import java.util.List;

@Service
public class EquipeService implements IEquipeService{

    @Autowired
    private EquipeRepo equipeRepo ;

   public Equipe AddEquipe(Equipe e){
        return equipeRepo.save(e);
    }
    public Equipe  UpdateEquipe(Equipe e){
        return equipeRepo.save(e);
    }
    public void deleteEquipe(Equipe e){
        equipeRepo.delete(e);
    }
    public void deleteEquipe(Long id){
        equipeRepo.deleteById(id);
    }
    public List<Equipe> findAllEquipe(){
        return (List<Equipe>) equipeRepo.findAll();
    }
    public Equipe findEquipeById(Long id){
        return equipeRepo.findById(id).get();
    }


}
