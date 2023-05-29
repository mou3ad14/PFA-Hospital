package com.example.cabinet_medical.Repository;

import com.example.cabinet_medical.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
