package com.example.clientdatabase.repos;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.clientdatabase.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
