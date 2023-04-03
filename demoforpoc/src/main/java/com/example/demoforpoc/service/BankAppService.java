package com.example.demoforpoc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoforpoc.entity.Bankappointments;

@Service
public interface BankAppService {
	
	List<Bankappointments> getDetails();
    Bankappointments savetheAppointments(Bankappointments bankappointments);
    Bankappointments updatetheAppointments(int appid,Bankappointments bankappointments);
    void deletetheAppointments(int appid);
}
