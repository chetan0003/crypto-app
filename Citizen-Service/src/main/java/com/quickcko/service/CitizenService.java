package com.quickcko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickcko.dao.CitizenDao;
import com.quickcko.model.Citizen;
import com.quickcko.model.CitizenVaccinationCenter;

/**
 * @author chetan d.
 */
@Service
public class CitizenService {
    
	@Autowired
	private CitizenDao citizenDao;
	
	public Citizen  addCitizen(Citizen citizen) {
		return citizenDao.addCitizen(citizen);
	}

	public Citizen getCitizen(Integer id) {
		// TODO Auto-generated method stub
		return citizenDao.getCitizen(id);
	}
	public CitizenVaccinationCenter getCitizenithVaccinationCenter(Integer id) {
		// TODO Auto-generated method stub
		return citizenDao.getCitizenithVaccinationCenter(id);
	}
	
	public List<Citizen> getCitizenList() {
		List<Citizen> citizen = citizenDao.getCitizenList();
		return citizen;
	}
	
	public String getCurrencyList() {
		String citizen = citizenDao.getCurrencyList();
		return citizen;
	}
	

}
