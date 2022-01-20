package com.example.demo.Repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>{
 
}
