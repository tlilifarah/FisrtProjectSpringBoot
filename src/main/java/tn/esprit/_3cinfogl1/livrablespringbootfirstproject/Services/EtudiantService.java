package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Etudiant;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories.EtudiantRepo;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{

    @Autowired
    private EtudiantRepo er;

    public  Etudiant AddEtudiant(Etudiant etudiant){
        return er.save(etudiant);
    }
    public Etudiant  UpdateEtudiant(Etudiant etudiant){
        return er.save(etudiant);
    }
    public void deleteEtudiant (Etudiant etudiant){
         er.delete(etudiant);
    }
    public void deleteEtudiant(Long id){
        er.deleteById(id);
    }
    public List<Etudiant> findAllEtudiant(){
        return (List<Etudiant>) er.findAll();
    }
    public Etudiant findEtudiantById(Long id){
        return er.findById(id).get();
    }


}
