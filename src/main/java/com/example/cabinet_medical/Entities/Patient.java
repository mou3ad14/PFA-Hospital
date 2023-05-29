package com.example.cabinet_medical.Entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity

public class Patient extends User{

    private int age;
    private String gender;
    private String phoneNumber;

    @OneToMany(mappedBy = "patient")
    private ArrayList<Medical_record>medicalRecords;

    @OneToMany(mappedBy = "patient")
    private ArrayList<Appointment>appointments;

    @ManyToMany
    private ArrayList<Doctor>doctors;


    public Patient(String first_name, String last_name, String username, String password, String email, String role, int age, String gender, String phoneNumber) {
        super(first_name, last_name, username, password, email, role);
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }


    public Patient(String first_name, String last_name, String username, String password, String email, String role) {
        super(first_name, last_name, username, password, email, role);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Medical_record> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(ArrayList<Medical_record> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
}
