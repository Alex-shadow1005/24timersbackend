package com.example.pro24timersbackend.repo;

import com.example.pro24timersbackend.domain.model.rytterModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RytterRepo extends JpaRepository<rytterModel,Long> {
}
