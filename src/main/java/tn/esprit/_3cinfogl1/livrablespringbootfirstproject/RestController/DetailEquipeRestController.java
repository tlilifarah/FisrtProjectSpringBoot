package tn.esprit._3cinfogl1.livrablespringbootfirstproject.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.DetailsEquipe;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services.IContratService;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services.IDetailsEquipeService;

import java.util.List;

@RestController
@RequestMapping("detailequipe")
public class DetailEquipeRestController {

    @Autowired
    private IDetailsEquipeService des ;

    @PostMapping("ajouterequipe")
    DetailsEquipe addDetailEquipe(@RequestBody DetailsEquipe de){//pour dire rahou bech yet3ada soi objet soi List mouch haja simple
        return  des.AddDetailsEquipe(de);
    }
    @PutMapping("Modifierequipe")//kif ntesti fl post yi9oli unfoud , pour lexposer en xeb service
    DetailsEquipe  UpdateContract(@RequestBody  DetailsEquipe de){
        return  des.UpdateDetailsEquipe(de);
    }
    @DeleteMapping("supprimerequipe")
    void deleteContract (@RequestBody DetailsEquipe de){
        des.deleteDetailsEquipe(de);
    }
    @DeleteMapping("supprimercidequipe/{id}")
    void deleteContract (@PathVariable Long id){
        des.deleteDetailsEquipe(id);
    }
    @GetMapping("findAlleuipe")
    List<DetailsEquipe> findAllContrat(){
        return des.findAllDetailsEquipe();
    }
    @GetMapping("findAllcById")
    DetailsEquipe findContratById(@RequestParam Long id){
        return  des.findDetailsEquipeById(
                id);
    }



}
