package com.example.clientdatabase.domain;


import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@Entity
@Table(name = "CITY")
public class City{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CITY_ID")
    private int id;

    @Column(name = "NAME_OF_CITY")
    private String nameOfCity;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    public City(){ }

    public City(int id, String nameOfCity, Client client){
        this.id = id;
        this.nameOfCity = nameOfCity;
        this.client = client;
    }

    public int getId() {
        return id;
    }


    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }
}


