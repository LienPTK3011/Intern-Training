package com.example.demo.Repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Room;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
 
}
