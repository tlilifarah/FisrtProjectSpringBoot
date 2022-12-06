package tn.esprit._3cinfogl1.livrablespringbootfirstproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit._3cinfogl1.livrablespringbootfirstproject.DAO.Repositories.UnisersiteRepo;

@Service
public class UniversiteService implements IUniversiteService{
    @Autowired
    private UnisersiteRepo ur;
}
