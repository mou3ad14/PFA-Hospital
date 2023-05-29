package com.example.cabinet_medical;

import com.example.cabinet_medical.Entities.Doctor;
import com.example.cabinet_medical.Repository.DoctorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CabinetMedicalApplicationTests {
    @Autowired
    private DoctorRepository doctorRepository;
    @Test
    public void TestDoctor(){
        Doctor doctor=new Doctor()
    }

}
