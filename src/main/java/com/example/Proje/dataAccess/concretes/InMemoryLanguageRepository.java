package com.example.Proje.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Proje.dataAccess.abstracts.ProgramminLanguageRepository;
import com.example.Proje.entities.concretes.ProgrammingLanguage;



@Repository
public class InMemoryLanguageRepository implements ProgramminLanguageRepository{
	
	List<ProgrammingLanguage> languages;
	
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(2, "Kotlin"));
		languages.add(new ProgrammingLanguage(3, "Python"));
	}
	

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage language : languages) {
			if(language.getId() == id) {
				return language;
			}
		}
		return null;
		
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		int lastId = languages.size();
		programmingLanguage.setId(lastId + 1);
		languages.add(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		ProgrammingLanguage deleteLanguageId = getById(id);
		languages.remove(deleteLanguageId);
		
	}

	
	@Override
	public void update(int id, String name) {
		for(ProgrammingLanguage language : languages) {
			if(language.getId() == id) {
				language.setName(name);
			}
		}
		
	
		
	}

}
