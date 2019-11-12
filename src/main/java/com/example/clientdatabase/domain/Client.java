package com.example.clientdatabase.domain;


import javax.persistence.*;
import java.util.Random;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String surname;
    private String email;
    private String dateOfBirth;
    private String accountNumber;
    private String ballance;


    public Client() { }

    public Client(String name, String surname, String email, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = generateAccountNumber();
        this.ballance = "0.00";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBallance() {
        return ballance;
    }

    public void setBallance(String ballance) {
        this.ballance = ballance;
    }

    public String generateAccountNumber(){
        String result = "10 1580";
        Random rg = new Random();


        for (int i =0; i<6; i++){
            result += " " + Integer.toString(rg.nextInt(1000)*10);
        }

        return result;

    }
}
