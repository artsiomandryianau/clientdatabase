package com.example.clientdatabase.repos;

import com.example.clientdatabase.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepo extends CrudRepository<Client, Long> {
    List<Client> findByName(String name);

    Client findById(int id);


}
