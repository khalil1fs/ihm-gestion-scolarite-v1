package com.example1.test1_withoutsecurity.Dao;

import com.example1.test1_withoutsecurity.bean.Absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbsenceDao extends JpaRepository<Absence, Long> {
    public List<Absence> findAll();

    @Query("select max(absence.id) from Absence absence")
    Long absenceReferenceIncremet();

    @Query("select a, matiere from Absence a,Matiere matiere where a.student.apoge =: absence_stu and a.seance.matiere.name_Matiere =: absance_mat ")
    List<Absence> findParStudent(@Param("absence_stu") String absence_stu, @Param("absence_mat") String absence_mat);

    @Query("select absence from Absence absence where absence.student.apoge=:apoges")
    public Absence findAllAbsenceStudent(@Param("apoges") String apoges);

    @Query("select absence from Absence absence where absence.reference=:reference")
    public Absence findByReference(@Param("reference") String refrence);

    @Query("select a from Absence a where a.seance.reference =: absence_sea")
    List<Absence> findParSeance(@Param("absence_sea") String absence_sea);


}
