package com.example.cabinet_medical.Repository;

import com.example.cabinet_medical.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
