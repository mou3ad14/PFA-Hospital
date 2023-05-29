package com.example.cabinet_medical.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointment_id;
    private Date appointment_date;
    private String appointment_hour;
    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Secretary secretary;






}
