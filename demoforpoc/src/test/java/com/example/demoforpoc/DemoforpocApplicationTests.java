package com.example.demoforpoc;


import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.example.demoforpoc.entity.Bankappointments;
import com.example.demoforpoc.repo.BankAppRepo;

@SpringBootTest
class DemoforpocApplicationTests {

	@Autowired
	BankAppRepo bankAppRepo;
	
	
	@Test
	@Order(1)
	@Rollback(value=false)
	public void saveAppTest() {
		
		Bankappointments bankapp=new Bankappointments();
		bankapp.setAppname("shwetha");
		bankapp.setAddress("hubli");
		bankapp.setAppdate("2022-12-20");
		bankapp.setContactno("9876543789");
		bankAppRepo.save(bankapp);
		Assertions.assertThat(bankapp.getAppid()).isGreaterThan(0);
		
	}
	
	@Test
	@Order(2)
	@Rollback(value=false)
	public void showAppTest() {
		Bankappointments bankapp=bankAppRepo.findById(37).get();
		Assertions.assertThat(bankapp.getAppid()).isEqualTo(37);
	}
	
	@Test
	@Order(3)
	@Rollback(value=false)
	public void showListAppTest() {
		List<Bankappointments> bankapp=bankAppRepo.findAll();
		Assertions.assertThat(bankapp.size()).isGreaterThan(0);
	}
	
	@Test
	@Order(4)
	@Rollback(value=false)
	public void updateAppTest() {
		Bankappointments bankapp=bankAppRepo.findById(24).get();
		bankapp.setAppname("veeksha");
		bankapp.setAddress("mangalore");
		Bankappointments bankappupdate=bankAppRepo.save(bankapp);
		Assertions.assertThat(bankappupdate.getAppid()).isEqualTo(24);
		
	}
	
	@Test
	@Order(5)
	@Rollback(value=false)
	public void deleteAppTest() {
		Bankappointments bankapp=bankAppRepo.findById(41).get();
		bankAppRepo.delete(bankapp);
		Bankappointments bankapp1=null;
		Optional<Bankappointments> optionalEmployee = bankAppRepo.findById(41);
		if(optionalEmployee.isPresent()) {
			bankapp1=optionalEmployee.get();
		}
		Assertions.assertThat(bankapp1).isNull();
	}
}
