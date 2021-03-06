package com.example1.test1_withoutsecurity.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Matiere implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name_Matiere;

    @ManyToOne                          // Verified
    private Filiere filiere;

    @ManyToOne                          // New
    private Niveau niveau;

    @ManyToOne
    private Prof prof;

    public Matiere() {
    }

    public Matiere(Long id, String name_Matiere, Filiere filiere, Niveau niveau) {
        this.id = id;
        this.name_Matiere = name_Matiere;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public void setId_Matiere(Long id) {
        this.id = id;
    }


    public String getName_Matiere() {
        return name_Matiere;
    }

    public void setName_Matiere(String name_Matiere) {
        this.name_Matiere = name_Matiere;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
