package com.example.Proje.business.abstracts;

import java.util.List;


import com.example.Proje.business.requests.technologyRequests.CreateTechnologyRequest;
import com.example.Proje.business.requests.technologyRequests.DeleteTechnologyRequest;
import com.example.Proje.business.requests.technologyRequests.UpdateTechnologyRequest;
import com.example.Proje.business.responses.technologyResponses.GetAllTechnologyResponse;

public interface TechnologyService {
	
	List<GetAllTechnologyResponse> getAll();
	void add(CreateTechnologyRequest createTechnology);
	void delete(DeleteTechnologyRequest deleteTechnology);
	void update(UpdateTechnologyRequest updateTechnology);

}
