package com.example.Proje.webAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proje.business.abstracts.LanguageService;
import com.example.Proje.business.requests.programminLanguagesRequests.CreateProgrammingLanguageRequest;
import com.example.Proje.business.requests.programminLanguagesRequests.DeleteProgrammingLanguageRequest;
import com.example.Proje.business.requests.programminLanguagesRequests.UpdateProgrammingLanguageRequest;
import com.example.Proje.business.responses.programmingLanguagesResponses.GetAllProgrammingLanguagesResponse;
import com.example.Proje.business.responses.programmingLanguagesResponses.GetByIdProgrammingLanguagesResponse;
import com.example.Proje.entities.concretes.ProgrammingLanguage;


@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public GetByIdProgrammingLanguagesResponse getById(int id){
		return languageService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguage) throws Exception{
		languageService.add(createProgrammingLanguage);
	}
	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguage) {
		languageService.delete(deleteProgrammingLanguage);
	}

	@PutMapping("/update")
	void update(UpdateProgrammingLanguageRequest uptadeProgrammingLanguage) throws Exception {
		languageService.update(uptadeProgrammingLanguage);
	}

	
	
}
