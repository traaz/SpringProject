package com.example.Proje.webAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proje.business.abstracts.TechnologyService;
import com.example.Proje.business.requests.technologyRequests.CreateTechnologyRequest;
import com.example.Proje.business.requests.technologyRequests.DeleteTechnologyRequest;
import com.example.Proje.business.requests.technologyRequests.UpdateTechnologyRequest;
import com.example.Proje.business.responses.technologyResponses.GetAllTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	
	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllTechnologyResponse> getAll(){
		return technologyService.getAll();
	}
	
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest deleteTechnology) {
		technologyService.add(deleteTechnology);
	}
	@DeleteMapping("/delete")
	public void delete(DeleteTechnologyRequest deleteTechnology) {
		technologyService.delete(deleteTechnology);
	}

	@PutMapping("/update")
	void update(UpdateTechnologyRequest uptadeTechnology){
		technologyService.update(uptadeTechnology);
	}
	
	

}
