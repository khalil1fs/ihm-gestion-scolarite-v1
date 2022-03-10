package com.example1.test1_withoutsecurity.Dao;

import com.example1.test1_withoutsecurity.bean.Absence;
import com.example1.test1_withoutsecurity.bean.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbsenceDao extends JpaRepository<Absence ,Long > {

    Absence findAbsenceByReference(String reference) ;

    @Query("select a, matiere from Absence a,Matiere matiere where a.student.apoge =: absence_stu and a.seance.matiere.name_Matiere =: absance_mat ")
    List<Absence> findParStudent(@Param("absence_stu") String  absence_stu,@Param("absence_mat") String  absence_mat);

    @Query("select a from Absence a where a.seance.reference =: absence_sea")
    List<Absence> findParSeance(@Param("absence_sea") String absence_sea);


}
