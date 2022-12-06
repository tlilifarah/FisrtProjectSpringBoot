package tn.esprit._3cinfogl1.livrablespringbootfirstproject.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services.IContratService;

import java.util.List;
// exposition en wed service f restcontoller
@RestController
@RequestMapping("contrat")
public class ContratRestController {
    @Autowired
    private IContratService ics ;

    @PostMapping("ajouterc")
    Contrat addContract(@RequestBody Contrat c){//pour dire rahou bech yet3ada soi objet soi List mouch haja simple
        return  ics.AddContract(c);
    }
    @PutMapping("Modifierc")//kif ntesti fl post yi9oli unfoud , pour lexposer en xeb service
    Contrat  UpdateContract(@RequestBody  Contrat c){
        return  ics.AddContract(c);
    }
    @DeleteMapping("supprimerc")
    void deleteContract (@RequestBody Contrat c){
        ics.deleteContract(c);
    }
    @DeleteMapping("supprimercid/{id}")
    void deleteContract (@PathVariable Long id){
        ics.deleteContract(id);
    }
    @GetMapping("findAllc")
    List<Contrat> findAllContrat(){

        return ics.findAllContrat();
    }
    @GetMapping("findAllcById")
    Contrat findContratById(@RequestParam Long id){

        return  ics.findContratById(id);
    }



}
