package com.example.pro24timersbackend.controller;

import com.example.pro24timersbackend.domain.model.holdModel;
import com.example.pro24timersbackend.repo.HoldRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class holdControllerTest {

    @Autowired
    private HoldRepo holdRepo;

    @Test
    void readteamList() {
    }

    @Test
    void readteam() {
        holdModel holdmodel = new holdModel();
        holdRepo.save(holdmodel);
        assertEquals(holdmodel.getHoldnavn(),holdRepo.findById(1L).get().getHoldnavn());
    }

    @Test
    void createHold() {

            holdModel holdmodel = new holdModel();
            holdRepo.save(holdmodel);
            assertEquals(holdmodel.getHoldnavn(),holdRepo.findById(1L).get().getHoldnavn());
        }





    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}