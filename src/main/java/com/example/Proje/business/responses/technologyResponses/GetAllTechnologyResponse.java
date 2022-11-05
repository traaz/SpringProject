package com.example.Proje.business.responses.technologyResponses;

public class GetAllTechnologyResponse {
	private int id;
	private String name;
	private int languageId;
	public GetAllTechnologyResponse() {
		super();
	}
	public GetAllTechnologyResponse(int id, String name, int languageId) {
		super();
		this.id = id;
		this.name = name;
		this.languageId = languageId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
