package tn.esprit._3cinfogl1.livrablespringbootfirstproject.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Equipe;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("equipe")
public class EquipeRestController {

    @Autowired
    private IEquipeService ies;
    @PutMapping("addequipe")
    Equipe addEquipe (@RequestBody Equipe e){
       return ies.AddEquipe(e);
    }
    @PutMapping("updatequipe")
    Equipe updateEquipe(@RequestBody Equipe e){
        return ies.UpdateEquipe(e);
    }
    @DeleteMapping("deletequipe")
    void deleteEquipe(@RequestBody Equipe e){
        ies.deleteEquipe(e);
    }
    @DeleteMapping("deletequipe/{id}")
    void deleEquipeById(@PathVariable  Long id){
        ies.deleteEquipe(id);
    }
    @GetMapping("findAllEquipe")
    List<Equipe> findAllEquipe(){
        return ies.findAllEquipe();
    }
    @GetMapping("findallById")
    Equipe findAllById (@RequestParam Long id){
        return  ies.findEquipeById(id);
    }

}
