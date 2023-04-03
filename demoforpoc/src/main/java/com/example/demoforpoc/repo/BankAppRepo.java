package com.example.demoforpoc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoforpoc.entity.Bankappointments;

@Repository
public interface BankAppRepo extends JpaRepository<Bankappointments, Integer>{

}
