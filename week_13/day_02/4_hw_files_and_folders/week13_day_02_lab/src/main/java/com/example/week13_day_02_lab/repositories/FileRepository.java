package com.example.week13_day_02_lab.repositories;

import com.example.week13_day_02_lab.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
