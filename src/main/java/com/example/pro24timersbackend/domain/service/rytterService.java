package com.example.pro24timersbackend.domain.service;


import com.example.pro24timersbackend.domain.model.rytterModel;
import com.example.pro24timersbackend.repo.RytterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class rytterService {

    private final RytterRepo rytterRepo;



    @Autowired
    public rytterService(RytterRepo rytterRepo) {
        this.rytterRepo = rytterRepo;
    }

    //read all
    public List<rytterModel> readbikerList(){
        return rytterRepo.findAll();
    }
    public Optional<rytterModel> readbikerbyteam(Long holdnavn){
        return rytterRepo.findById(holdnavn);
    }
    //read one ById
    public Optional<rytterModel> readbiker(Long id){
        return rytterRepo.findById(id);
    }
    //create
    public void create(rytterModel model){
        rytterRepo.save(model);
    }
    //update
    public rytterModel update(rytterModel model){

        return rytterRepo.save(model);
    }
    //delete
    public void delete(Long id){
        rytterRepo.deleteById(id);
    }


}


