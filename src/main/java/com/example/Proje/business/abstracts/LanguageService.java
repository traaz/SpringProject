package com.example.Proje.business.abstracts;

import java.util.List;

import com.example.Proje.entities.concretes.ProgrammingLanguage;

public interface LanguageService {
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(int id);
	void update(int id, String name) throws Exception;

}
