package com.example.week13_day_02_lab.repositories;

import com.example.week13_day_02_lab.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
