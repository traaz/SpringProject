package com.example.Proje.business.requests.technologyRequests;

public class CreateTechnologyRequest {
	private String name;
	private int languageId;
	public CreateTechnologyRequest() {
		super();
	}
	public CreateTechnologyRequest(String name, int languageId) {
		super();
		this.name = name;
		this.languageId = languageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	
	

}
