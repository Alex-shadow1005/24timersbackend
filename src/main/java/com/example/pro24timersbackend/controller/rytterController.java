package com.example.pro24timersbackend.controller;



import com.example.pro24timersbackend.domain.model.rytterModel;

import com.example.pro24timersbackend.domain.service.rytterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/rytter")
public class rytterController {

    private final rytterService rytterService;

    @Autowired //dependency injektion
    public rytterController(rytterService rytterService) {
        this.rytterService = rytterService;
    }

    @GetMapping()
    public ResponseEntity<List<rytterModel>> readbikerList() {
        List<rytterModel> bikerlist = rytterService.readbikerList();
        return new ResponseEntity<>(bikerlist, HttpStatus.OK);
    }
   /* @GetMapping("/{hold")
    public ResponseEntity<List<rytterModel>> readbikerlistbyTeam(@PathVariable ("hold") String name ) {
        Optional<rytterModel> bikerlistbyteam = rytterService.readbikerbyteam(Long.valueOf(name));
        //List<rytterModel> bikerlist = rytterService.readbikerList();
        return new ResponseEntity<List<rytterModel>>(bikerlistbyteam,HttpStatus.OK);
    }

    */

    @GetMapping("/{id}")
    public rytterModel readbiker(@PathVariable Long id) {
        Optional<rytterModel> readbiker = rytterService.readbiker(id);
        return readbiker.orElse(null);
    }


    @PostMapping
    public ResponseEntity<rytterController> addBiker(@RequestBody rytterModel model){
        rytterService.create(model);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<rytterModel> update(@PathVariable Long id, @RequestBody rytterModel model){
        model.setId(id);
        return new ResponseEntity<>(rytterService.update(model),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<rytterModel> delete(@PathVariable Long id){
        rytterService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}