package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.DetailsEquipe;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories.ContratRepo;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories.DetailsEquipeRepo;

import java.util.List;

@Service
public class DetaillsEquipeService implements IDetailsEquipeService{

    @Autowired
    private DetailsEquipeRepo detEquiRep;


    @Override
    public DetailsEquipe AddDetailsEquipe(DetailsEquipe de) {
        return detEquiRep.save(de);
    }

    @Override
    public DetailsEquipe UpdateDetailsEquipe(DetailsEquipe de) {
        return detEquiRep.save(de);
    }

    @Override
    public void deleteDetailsEquipe(DetailsEquipe de) {
        detEquiRep.delete(de);
    }

    @Override
    public void deleteDetailsEquipe(Long id) {
        detEquiRep.deleteById(id);
    }

    @Override
    public List<DetailsEquipe> findAllDetailsEquipe() {
        return (List<DetailsEquipe>) detEquiRep.findAll();
    }

    @Override
    public DetailsEquipe findDetailsEquipeById(Long id) {
        return detEquiRep.findById(id).get();//soit return objet ou objetvide pour eviter null (exceotion null)
    }

}
