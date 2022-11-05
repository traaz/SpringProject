package com.example.Proje.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name="technologies")
@Entity
public class Technology {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="technology_id")
	private int technologyId;
	
	@Column(name="technology_name")
	private String technologyName;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private ProgrammingLanguage programmingLanguage;

	public Technology() {
		super();
	}

	public Technology(int technologyId, String technologyName, ProgrammingLanguage programmingLanguage) {
		super();
		this.technologyId = technologyId;
		this.technologyName = technologyName;
		this.programmingLanguage = programmingLanguage;
	}

	public int getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public ProgrammingLanguage getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	

	
	
	
	
}
