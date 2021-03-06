package com.example1.test1_withoutsecurity.service;

import com.example1.test1_withoutsecurity.Dao.NoteDao;
import com.example1.test1_withoutsecurity.bean.Matiere;
import com.example1.test1_withoutsecurity.bean.Note;
import com.example1.test1_withoutsecurity.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteDao noteDao;
    @Autowired
    private MatiereService matiereService;
    @Autowired
    private StudentService studentService;

    public Note findByReference(String reference) {
        return noteDao.findByReference(reference);
    }

    public int save(Note note) {
        Student student = studentService.findByApoge(note.getStudent().getApoge());
        Matiere matiere = matiereService.findByMatiereNom(note.getMatiere().getName_Matiere());

        if (note.getResultat() < 0 || note.getResultat() > 20) return -1;
        else if (findByReference(note.getReference()) != null) return -2;
        else if (student == null)
            return -3;
        else if (matiere == null) return -4;
        else {
            Long i = noteDao.NoteReferenceIncrement();
            if (i == null) i = 0L;
            note.setDate_Note(new Date());
            note.setReference("N" + (1 + i));
            note.setMatiere(matiere);
            note.setStudent(student);
            noteDao.save(note);
            return 1;
        }

    }

    public List<Note> findByResultat(double resultat) {
        return noteDao.findByResultat(resultat);
    }

    public List<Note> findByNv(String mat) {
        return noteDao.findByNv(mat);
    }

    public List<Note> findByRatt(String mat) {
        return noteDao.findByRatt(mat);
    }

    public List<Note> findByVM(String mat) {
        return noteDao.findByVM(mat);
    }

    public List<Note> findAll() {
        return noteDao.findAll();
    }

}
