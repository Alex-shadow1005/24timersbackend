package com.example.pro24timersbackend.controller;


import com.example.pro24timersbackend.domain.model.holdModel;
import com.example.pro24timersbackend.domain.service.holdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/hold")
public class holdController {

    private final holdService holdService;

    @Autowired //dependency injektion
    public holdController(holdService holdService) {
        this.holdService = holdService;
    }



   @GetMapping("/")
   public String home(){
        return "hello world";
   }




    @GetMapping
    public ResponseEntity<List<holdModel>> readteamList() {
        List<holdModel> teamlist = holdService.readteamList();
        return new ResponseEntity<>(teamlist, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public holdModel readteam(@PathVariable Long id) {
        Optional<holdModel> readteam = holdService.readteam(id);
        return readteam.orElse(null);
    }


   @PostMapping
   public ResponseEntity<holdController> createHold(@RequestBody holdModel model){
        holdService.create(model);
        return new ResponseEntity<>(HttpStatus.OK);
   }

   @PutMapping("/{id}")
    public ResponseEntity<holdModel> update(@PathVariable Long id, @RequestBody holdModel model){
        model.setId(id);
        return new ResponseEntity<>(holdService.update(model),HttpStatus.OK);
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<holdModel> delete(@PathVariable Long id){
        holdService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
   }

}


