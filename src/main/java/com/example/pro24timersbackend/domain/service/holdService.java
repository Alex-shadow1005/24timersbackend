package com.example.pro24timersbackend.domain.service;


import com.example.pro24timersbackend.domain.model.holdModel;
import com.example.pro24timersbackend.repo.HoldRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class holdService {
    private final HoldRepo holdRepo;


    @Autowired
    public holdService(HoldRepo holdRepo) {
        this.holdRepo = holdRepo;
    }
    //read all
    public List<holdModel> readteamList(){
        return holdRepo.findAll();
    }
    //read one ById
    public Optional<holdModel> readteam(Long id){
        return holdRepo.findById(id);
    }
    //create
    public void create(holdModel model){
        holdRepo.save(model);
    }
    //update
    public holdModel update(holdModel model){
        return holdRepo.save(model);
    }
    //delete
    public void delete(Long id){
        holdRepo.deleteById(id);
    }

}
