package com.example.Proje.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proje.business.abstracts.TechnologyService;
import com.example.Proje.business.requests.technologyRequests.CreateTechnologyRequest;
import com.example.Proje.business.requests.technologyRequests.DeleteTechnologyRequest;
import com.example.Proje.business.requests.technologyRequests.UpdateTechnologyRequest;
import com.example.Proje.business.responses.technologyResponses.GetAllTechnologyResponse;
import com.example.Proje.dataAccess.abstracts.ProgramminLanguageRepository;
import com.example.Proje.dataAccess.abstracts.TechnologyRepository;
import com.example.Proje.entities.concretes.ProgrammingLanguage;
import com.example.Proje.entities.concretes.Technology;


@Service
public class TechnologyManager implements TechnologyService{
	private TechnologyRepository technologyRepository;
	private ProgramminLanguageRepository languageRepository;
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, ProgramminLanguageRepository languageRepository) {
		super();
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}
	

	@Override
	public List<GetAllTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> responses = new ArrayList<GetAllTechnologyResponse>();
		for(Technology technology : technologies) {
			GetAllTechnologyResponse response = new GetAllTechnologyResponse();
			response.setId(technology.getTechnologyId());
			response.setName(technology.getTechnologyName());
			response.setLanguageId(technology.getProgrammingLanguage().getId());
			responses.add(response);
		
		}
		return responses;
		
	}



	@Override
	public void add(CreateTechnologyRequest createTechnology) {
		Technology technology = new Technology();
		ProgrammingLanguage language = languageRepository.findById(createTechnology.getLanguageId()).get();
		technology.setTechnologyName(createTechnology.getName());
		technology.setProgrammingLanguage(language);
		
		
		technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnology) {
		technologyRepository.deleteById(deleteTechnology.getId());
		
		
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnology) {
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = languageRepository.findById(updateTechnology.getLanguageId()).get();
		technology.setTechnologyId(updateTechnology.getId());
		technology.setTechnologyName(updateTechnology.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		
		technologyRepository.save(technology);
		
	}

}
