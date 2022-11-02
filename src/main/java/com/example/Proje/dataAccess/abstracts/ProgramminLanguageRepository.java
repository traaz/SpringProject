package com.example.Proje.dataAccess.abstracts;

import java.util.List;

import com.example.Proje.entities.concretes.ProgrammingLanguage;



public interface ProgramminLanguageRepository {
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	
	void add(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	void update(int id, String name);
	

}
