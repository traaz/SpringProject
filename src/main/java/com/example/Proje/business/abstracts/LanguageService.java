package com.example.Proje.business.abstracts;

import java.util.List;

import com.example.Proje.business.requests.programminLanguagesRequests.CreateProgrammingLanguageRequest;
import com.example.Proje.business.requests.programminLanguagesRequests.DeleteProgrammingLanguageRequest;
import com.example.Proje.business.requests.programminLanguagesRequests.UpdateProgrammingLanguageRequest;
import com.example.Proje.business.responses.programmingLanguagesResponses.GetAllProgrammingLanguagesResponse;
import com.example.Proje.business.responses.programmingLanguagesResponses.GetByIdProgrammingLanguagesResponse;


public interface LanguageService {
	
	List<GetAllProgrammingLanguagesResponse> getAll();
	GetByIdProgrammingLanguagesResponse getById(int id);
	
	void add(CreateProgrammingLanguageRequest createProgrammingLanguage) throws Exception;
	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguage);
	void update(UpdateProgrammingLanguageRequest uptadeProgrammingLanguage) throws Exception;

}
