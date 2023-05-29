package com.example.cabinet_medical.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@Entity

public class Doctor extends User{
    private String specialite;

    @OneToMany(mappedBy = "doctor")
    private ArrayList<Consultation>consultations;

    @OneToMany(mappedBy = "doctor")
    private ArrayList<Prescription>prescriptions;

    @ManyToMany(mappedBy = "doctors")
    private ArrayList<Patient>patients;

    public Doctor(String first_name, String last_name, String username, String password, String email, String role, String specialite) {
        super(first_name, last_name, username, password, email, role);
        this.specialite = specialite;
    }

    public Doctor(String first_name, String last_name, String username, String password, String email, String role) {
        super(first_name, last_name, username, password, email, role);
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public ArrayList<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(ArrayList<Consultation> consultations) {
        this.consultations = consultations;
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}
