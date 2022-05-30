package com.example.pro24timersbackend.repo;


import com.example.pro24timersbackend.domain.model.holdModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoldRepo extends JpaRepository<holdModel,Long> {
}
