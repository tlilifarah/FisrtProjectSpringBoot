package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories.ContratRepo;

import java.util.List;

@Service
public class ContratService implements IContratService{

    @Autowired //pourcreer linstance f spring IOC
    private ContratRepo cr;

    @Override
    public Contrat AddContract(Contrat c) {
        return cr.save(c);
    }

    @Override
    public Contrat UpdateContract(Contrat c) {
        return cr.save(c);
    }

    @Override
    public void deleteContract(Contrat c) {
        cr.delete(c);
    }

    @Override
    public void deleteContract(Long id) {
        cr.deleteById(id);
    }

    @Override
    public List<Contrat> findAllContrat() {
        return (List<Contrat>) cr.findAll();
    }

    @Override
    public Contrat findContratById(Long id) {
        return cr.findById(id).get();//soit return objet ou objetvide pour eviter null (exceotion null)
    }
}
