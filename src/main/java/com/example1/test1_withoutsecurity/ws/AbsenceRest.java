package com.example1.test1_withoutsecurity.ws;

import com.example1.test1_withoutsecurity.service.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gestion/absence")
public class AbsenceRest {
    @Autowired
    private AbsenceService absenceService;

}
