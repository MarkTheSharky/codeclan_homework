package com.example.week13_day_02_lab.repositories;

import com.example.week13_day_02_lab.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
