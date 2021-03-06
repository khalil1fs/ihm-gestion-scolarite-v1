package com.example1.test1_withoutsecurity.service;


import com.example1.test1_withoutsecurity.Dao.DepartementDao;
import com.example1.test1_withoutsecurity.bean.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementService {
    @Autowired
    private DepartementDao departementDao;

    public Departement findByNomDepartement(String nom_depart) {
        return departementDao.findByNomDepartement(nom_depart);
    }

    public int save(Departement departement) {
        if (findByNomDepartement(departement.getNom_Depart()) != null)
            return -1;
        else if (departement.getNom_Depart() == null) return -2;
        else {
            departementDao.save(departement);
            return 1;
        }
    }

    public List<Departement> findAll() {
        return departementDao.findAll();
    }

}
