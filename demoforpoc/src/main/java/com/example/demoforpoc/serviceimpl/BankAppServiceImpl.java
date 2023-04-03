package com.example.demoforpoc.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoforpoc.entity.Bankappointments;
import com.example.demoforpoc.repo.BankAppRepo;
import com.example.demoforpoc.service.BankAppService;

@Service
public class BankAppServiceImpl implements BankAppService{

	private BankAppRepo bankAppRepo;
	
	public BankAppServiceImpl(BankAppRepo bankAppRepo) {
		super();
		this.bankAppRepo=bankAppRepo;
		
	}
	@Override
	public List<Bankappointments> getDetails() {
		
		return bankAppRepo.findAll();
	}
	@Override
	public Bankappointments savetheAppointments(Bankappointments bankappointments) {
		return bankAppRepo.save(bankappointments);
	}
	@Override
	public Bankappointments updatetheAppointments(int appid, Bankappointments bankappointments) {
		Bankappointments bankapp=bankAppRepo.findById(appid).orElse(null);
		bankapp.setAddress(bankappointments.getAddress());
		bankapp.setAppdate(bankappointments.getAppdate());
		bankapp.setAppname(bankappointments.getAppname());
		bankapp.setContactno(bankappointments.getContactno());
		return bankAppRepo.save(bankapp);
	}
	@Override
	public void deletetheAppointments(int appid) {
		bankAppRepo.deleteById(appid);
		
	}

}
