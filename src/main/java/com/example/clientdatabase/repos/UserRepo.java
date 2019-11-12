package com.example.clientdatabase.repos;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.clientdatabase.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
