package com.example.cabinet_medical.Repository;

import com.example.cabinet_medical.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
