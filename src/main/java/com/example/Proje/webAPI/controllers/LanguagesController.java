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
	public List<ProgrammingLanguage> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id){
		return languageService.getById(id);
	}
	
	@PostMapping("/add")
	void add(ProgrammingLanguage language) throws Exception{
		languageService.add(language);
	}
	@DeleteMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);
	}

	@PutMapping("/update")
	void update(int id, String newName) throws Exception {
		languageService.update(id, newName);
	}

	
	
}
