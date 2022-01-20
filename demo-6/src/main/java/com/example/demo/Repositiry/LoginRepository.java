package com.example.demo.Repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
Login findByUsernameAndPassword(String username, String password);
 
}
