package com.example1.test1_withoutsecurity.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Niveau implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // reference
    private String semestre; // s5 s1 ....

//    public Filiere getFiliere() {
//        return filiere;
//    }
//
//    public void setFiliere(Filiere filiere) {
//        this.filiere = filiere;
//    }
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Filiere filiere;

    //
//    @JsonIgnore
//    @OneToMany(mappedBy = "niveau")         // Verified
//    private List<Student> students;
//
//
//    @JsonIgnore
//    @OneToMany(mappedBy = "niveau")               // New
//    private List<Matiere> matieress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Niveau() {
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

//    public Filiere getFiliere() {
//        return filiere;
//    }
//
//    public void setFiliere(Filiere filiere) {
//        this.filiere = filiere;
//    }
}
//
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//}
