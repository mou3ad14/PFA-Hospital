package com.example.cabinet_medical.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
public class Secretary extends User{


    @OneToMany(mappedBy = "secretary")
    private ArrayList<Appointment>appointments;


    public Secretary(String first_name, String last_name, String username, String password, String email, String role) {
        super(first_name, last_name, username, password, email, role);
    }

    public Secretary() {
    }
}
