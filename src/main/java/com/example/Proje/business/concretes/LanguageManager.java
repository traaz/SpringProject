package com.example.Proje.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proje.business.abstracts.LanguageService;
import com.example.Proje.business.requests.programminLanguagesRequests.CreateProgrammingLanguageRequest;
import com.example.Proje.business.requests.programminLanguagesRequests.DeleteProgrammingLanguageRequest;
import com.example.Proje.business.requests.programminLanguagesRequests.UpdateProgrammingLanguageRequest;
import com.example.Proje.business.responses.programmingLanguagesResponses.GetAllProgrammingLanguagesResponse;
import com.example.Proje.business.responses.programmingLanguagesResponses.GetByIdProgrammingLanguagesResponse;
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
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		List<ProgrammingLanguage> languages = languageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> languagesResponses = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for (ProgrammingLanguage language : languages) {
			GetAllProgrammingLanguagesResponse response = new GetAllProgrammingLanguagesResponse();
			response.setId(language.getId());
			response.setName(language.getName());
			languagesResponses.add(response);
		}
		return languagesResponses;
	}

	@Override
	public GetByIdProgrammingLanguagesResponse getById(int id) {
	 
		ProgrammingLanguage language = languageRepository.findById(id).get();
		GetByIdProgrammingLanguagesResponse response = new GetByIdProgrammingLanguagesResponse();
		response.setName(language.getName());
		
		return response;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguage) throws Exception {
	
		if(createProgrammingLanguage.getName().isBlank() || createProgrammingLanguage.getName().isEmpty()) {
			System.out.println("İsim bos olmaz");
		}
		else {
			for(ProgrammingLanguage languages : languageRepository.findAll()) {
				if(createProgrammingLanguage.getName().equalsIgnoreCase(languages.getName())) {
					throw new Exception("Hatalı bilgi");
				}
					
				}
			ProgrammingLanguage language = new ProgrammingLanguage();
			language.setName(createProgrammingLanguage.getName());
			languageRepository.save(language);
			System.out.println("Eklendi");
			}
			
		}
		
	

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguage) {

		languageRepository.deleteById(deleteProgrammingLanguage.getId());
		
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest uptadeProgrammingLanguage) throws Exception{
		if(uptadeProgrammingLanguage.getName().isBlank() || uptadeProgrammingLanguage.getName().isEmpty()) {
			System.out.println("İsim bos olmaz");
		}
		else {
			for(ProgrammingLanguage languages : languageRepository.findAll()) {
				if(uptadeProgrammingLanguage.getName().equalsIgnoreCase(languages.getName())) {
					throw new Exception("Hatalı bilgi");
				}
					
				}
	
	    ProgrammingLanguage language = new ProgrammingLanguage();
	    language.setId(uptadeProgrammingLanguage.getId());
	    language.setName(uptadeProgrammingLanguage.getName());
		languageRepository.save(language);
		System.out.println("Güncellendi");
	}

}
}