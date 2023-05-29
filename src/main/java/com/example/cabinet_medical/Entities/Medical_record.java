package com.example.cabinet_medical.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity

public class Medical_record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long record_id;
    private Date date;

    @ManyToOne
    private Patient patient;

    public Medical_record(Long record_id, Date date, Patient patient) {
        this.record_id = record_id;
        this.date = date;
        this.patient = patient;
    }

    public Medical_record() {
    }

    public Long getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Long record_id) {
        this.record_id = record_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
