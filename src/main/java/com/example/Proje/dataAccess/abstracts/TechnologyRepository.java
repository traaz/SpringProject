package com.example.Proje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Proje.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

}
