package com.quickcko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickcko.custom.exception.EmptyInputException;
import com.quickcko.model.Citizen;
import com.quickcko.model.CitizenVaccinationCenter;
import com.quickcko.service.CitizenService;
/**
 * @author chetan d.
 */
@RestController
@RequestMapping("/citizen")
public class CitizenController {

@Autowired
private CitizenService citizenService;

@PostMapping(path = "/add")
public ResponseEntity<Citizen> postCitizen(@RequestBody Citizen citizen){
	 
	 if(citizen.getName() == null || citizen.getId() == null) {
		 throw new EmptyInputException();
	 }
	 citizen =  citizenService.addCitizen(citizen);
	return new ResponseEntity<>(citizen, HttpStatus.OK);
	
}

@GetMapping(path = "/id/{id}")	
public ResponseEntity<Citizen>getCitizen(@PathVariable Integer id){
	Citizen citizen=citizenService.getCitizen(id);
	return new ResponseEntity<Citizen>(citizen, HttpStatus.OK);
	
}

//@GetMapping(path = "/id/{id}")	
public ResponseEntity<CitizenVaccinationCenter>getCitizenithVaccinationCenter(@PathVariable Integer id){
	if(id == 0) {
		throw new EmptyInputException();
	}
	CitizenVaccinationCenter citizenVaccinationCenter=citizenService.getCitizenithVaccinationCenter(id);
	return new ResponseEntity<CitizenVaccinationCenter>(citizenVaccinationCenter, HttpStatus.OK);
	
}

@GetMapping(path = "/getList")	
public List<Citizen> getCitizenList() {
	List<Citizen> citizen = citizenService.getCitizenList();
	return citizen;
}

@GetMapping(path = "/getCurrencyList")	
public ResponseEntity<String> getCurrencyList() {
	String citizen = citizenService.getCurrencyList();
	return new ResponseEntity<>(citizen, HttpStatus.OK);
}
}
