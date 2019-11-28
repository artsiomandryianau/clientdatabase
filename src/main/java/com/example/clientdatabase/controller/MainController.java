package com.example.clientdatabase.controller;


import com.example.clientdatabase.domain.City;
import com.example.clientdatabase.domain.Client;
import com.example.clientdatabase.repos.CityRepo;
import com.example.clientdatabase.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Set;

@Controller
public class MainController {


    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private CityRepo cityRepo;

    @GetMapping("/")
    public String greeting(Map<String,Object> model){
        return "greeting";
    }


    @GetMapping("/main")
    public String main(Model model) {
        Iterable<Client> clients = clientRepo.findAll();

        clients = clientRepo.findAll();
        model.addAttribute("clients", clients);

        return "main";
    }

    @PostMapping("/main")
    public String add(@RequestParam String name, @RequestParam String surname, @RequestParam String email, @RequestParam String dateOfBirth,
                      Map<String, Object> model, @RequestParam Set<City> city) {
        Client client = new Client(name, surname, email, dateOfBirth, city);

        clientRepo.save(client);

        Iterable<Client> clients = clientRepo.findAll();

        model.put("clients", clients);

        return "main";
    }


}
