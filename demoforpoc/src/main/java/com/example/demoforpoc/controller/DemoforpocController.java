package com.example.demoforpoc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoforpoc.entity.Bankappointments;
import com.example.demoforpoc.service.BankAppService;

@RestController
@RequestMapping(value="/bankappointment")
public class DemoforpocController {
	
	private BankAppService bankAppService;
	
	public DemoforpocController(BankAppService bankAppService) {
		super();
		this.bankAppService=bankAppService;
	}
	
	@GetMapping(value="/bankappdetails")
	public ResponseEntity<List<Bankappointments>> getAppdetails() {
		return ResponseEntity.ok(bankAppService.getDetails());
	}
	
	
	@PostMapping(value="/savebankappdetails")
	public ResponseEntity<Bankappointments> bankdetails(@Valid @RequestBody Bankappointments bankappointments) {
		return new ResponseEntity<>(bankAppService.savetheAppointments(bankappointments),HttpStatus.CREATED);
	 }
	
	@PutMapping(value="/updatebankdetails/{appid}")
	public ResponseEntity<Bankappointments> updateBankAppointments(@PathVariable int appid,@RequestBody Bankappointments bankappointments) {
		return ResponseEntity.ok(bankAppService.updatetheAppointments(appid, bankappointments));
	}
	
	@DeleteMapping(value="/deletebankdetails/{appid}")
	public ResponseEntity<String> deleteBankAppointments(@PathVariable int appid) {
		bankAppService.deletetheAppointments(appid);
		 return ResponseEntity.ok("Record Deleted");
	}

}
