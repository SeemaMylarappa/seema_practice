package com.example.demoforpoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demoforpoc.entity.Bankappointments;


import com.example.demoforpoc.repo.BankAppRepo;

@Controller
public class WebPocController {
	
	@Autowired
	BankAppRepo bankAppRepo;
	
	@RequestMapping("/")
	public String bankDet(Model model) {
		List<Bankappointments> bankapplist=bankAppRepo.findAll();
		model.addAttribute("bankapplist", bankapplist);
		return "bankappointpage";
	}
	
	@RequestMapping("/new")
	public String addApp(Model model) {
		Bankappointments addAppList=new Bankappointments();
		model.addAttribute("addAppList", addAppList);
		return "addpage";
	}

	@PostMapping("/add")
	public String addAppoint(Bankappointments bankappointments) {
		bankAppRepo.save(bankappointments);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{appid}")
	public ModelAndView editDetail(@PathVariable("appid") int appid) {
		ModelAndView view=new ModelAndView("editpage");
		Bankappointments bankappointments=bankAppRepo.findById(appid).orElse(null);
		view.addObject("bankappointments", bankappointments);
		return view;
		
	}
	
	@RequestMapping("/delete/{appid}")
	public String deleteDetail(@PathVariable("appid") int appid) {
		bankAppRepo.deleteById(appid);
		return "redirect:/";
	}
}
