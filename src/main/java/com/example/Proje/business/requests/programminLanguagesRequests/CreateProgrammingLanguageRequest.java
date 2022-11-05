package com.example.Proje.business.requests.programminLanguagesRequests;

public class CreateProgrammingLanguageRequest {
	
	private String name;

	public CreateProgrammingLanguageRequest() {
		super();
	}

	public CreateProgrammingLanguageRequest(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
