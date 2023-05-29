package com.example.cabinet_medical.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consulation_id;

    private Date consultation_date;
    private Double consultation_price;

    @ManyToOne
    private Doctor doctor;


    public Consultation(Long consulation_id, Date consultation_date, Double consultation_price, Doctor doctor) {
        this.consulation_id = consulation_id;
        this.consultation_date = consultation_date;
        this.consultation_price = consultation_price;
        this.doctor = doctor;
    }

    public Consultation() {
    }

    public Long getConsulation_id() {
        return consulation_id;
    }

    public void setConsulation_id(Long consulation_id) {
        this.consulation_id = consulation_id;
    }

    public Date getConsultation_date() {
        return consultation_date;
    }

    public void setConsultation_date(Date consultation_date) {
        this.consultation_date = consultation_date;
    }

    public Double getConsultation_price() {
        return consultation_price;
    }

    public void setConsultation_price(Double consultation_price) {
        this.consultation_price = consultation_price;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
