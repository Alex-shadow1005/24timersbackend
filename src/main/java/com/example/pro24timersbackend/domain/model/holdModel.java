package com.example.pro24timersbackend.domain.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class holdModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String holdnavn;




    public holdModel() {
    }

    public holdModel(Long id, String holdnavn) {
        this.id = id;
        this.holdnavn = holdnavn;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHoldnavn() {
        return holdnavn;
    }

    public void setHoldnavn(String holdnavn) {
        this.holdnavn = holdnavn;
    }



}
