package com.example.cabinet_medical.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class Prescription {

    @Id
    private String code;
    private String type;

    @ManyToOne
    private Doctor doctor;

    public Prescription(String code, String type, Doctor doctor) {
        this.code = code;
        this.type = type;
        this.doctor = doctor;
    }

    public Prescription() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
