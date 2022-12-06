package tn.esprit._3cinfogl1.livrablespringbootfirstproject.RestController;


import org.springframework.web.bind.annotation.*;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Entities.Departement;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services.IDepartementService;

import java.util.List;

@RestController
@RequestMapping("departement")
public class DepartementRestController {

    private IDepartementService ids;

    @PostMapping("addD")
    public Departement AddDepartements (Departement d) {
        return ids.AddDepartement(d);
    }
    @PutMapping("updateD")
    public Departement UpdateDepartements(Departement d) {
        return ids.UpdateDepartement(d);
    }
    @DeleteMapping("deleteD")
    public void deleteDepartements (Departement d){
        ids.deleteDepartement(d);
    }
    @PutMapping("findAllD")
    public List<Departement> findAllDepartements() {
        return (List<Departement>) ids.findAllDepartement();
    }
}
