package com.example.Proje.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proje.business.abstracts.LanguageService;
import com.example.Proje.dataAccess.abstracts.ProgramminLanguageRepository;
import com.example.Proje.entities.concretes.ProgrammingLanguage;


@Service
public class LanguageManager implements LanguageService{
	
	private ProgramminLanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(ProgramminLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
	
		if(programmingLanguage.getName().isBlank() || programmingLanguage.getName().isEmpty()) {
			System.out.println("İsim bos olmaz");
		}
		else {
			for(ProgrammingLanguage language : languageRepository.getAll()) {
				if(programmingLanguage.getName().equalsIgnoreCase(language.getName())) {
					throw new Exception("Hatalı bilgi");
				}
					
				}
			languageRepository.add(programmingLanguage);
			System.out.println("Eklendi");
			}
			
		}
		
	

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}

	@Override
	public void update(int id, String name) throws Exception{
		if(name.isBlank() || name.isEmpty()) {
			System.out.println("İsim bos olmaz");
		}
		else {
			for(ProgrammingLanguage language : languageRepository.getAll()) {
				if(name.equalsIgnoreCase(language.getName())) {
					throw new Exception("Hatalı bilgi");
				}
					
				}
	
		languageRepository.update(id, name);
		System.out.println("Güncellendi");
	}

}
}