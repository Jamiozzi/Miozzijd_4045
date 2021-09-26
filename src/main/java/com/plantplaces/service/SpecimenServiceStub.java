package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub {

	public SpecimenDTO fetchBY(int id) {
		
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		return specimenDTO;
	}
	
	public void save(SpecimenDTO specimenDTO) {
		
	}
	
}
