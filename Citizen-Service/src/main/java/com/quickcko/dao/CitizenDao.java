package com.quickcko.dao;

import java.util.List;
import java.util.stream.Stream;

import javax.sql.DataSource;

import org.assertj.core.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.quickcko.custom.exception.EmptyInputException;
import com.quickcko.model.Citizen;
import com.quickcko.model.CitizenVaccinationCenter;
import com.quickcko.model.VaccinationCenter;

/**
 * @author chetan d.
 */
@Repository
public class CitizenDao {
	
	Logger log = LoggerFactory.getLogger(CitizenDao.class);
    
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Citizen addCitizen(Citizen citizen) {
		String sql="insert into citizen (id,name,vaccination_center_id) values(?,?,?)";
		Object[] args={citizen.getId(),citizen.getName(),citizen.getVaccination_center_id()};
		jdbcTemplate.update(sql,args);
		return citizen;
	}
    
	//Get CITIZEN
	public Citizen getCitizen(Integer id) {
		System.out.println(jdbcTemplate.getDataSource().getClass());
		//here we created CitizenDaoMapper which is implement Row Mapper Interface for mapping data base coloumn to domain class property or to pojo class propert.
		//thre is one method in Row Mapper Interface and that is Row map which we need to implment in our custom row mapper class.
         Citizen citizen = jdbcTemplate.queryForObject("select * from citizen where id = ?", new CitizenDaoMapper(),
                new Object[] { id });
         return citizen;
	}
	
	//Get CITIZEN And VACCINATION CENTER DETAIL
	public CitizenVaccinationCenter getCitizenithVaccinationCenter(Integer id) {
		VaccinationCenter vaccinationCenter = null;
		CitizenVaccinationCenter citizenVaccinationCenter = new CitizenVaccinationCenter();
		Citizen citizen = jdbcTemplate.queryForObject("select * from citizen where id = ?", new CitizenDaoMapper(),new Object[] { id });
        try {
		 vaccinationCenter = restTemplate.getForObject("http://localhost:8000/vaccin-center/id/"+citizen.getId(), VaccinationCenter.class);
        }catch(ResourceAccessException  e) {
        	log.error("Vaccination Service is Down");
        }catch (Exception e) {
			e.printStackTrace();
		}
        
     
        citizenVaccinationCenter.setCitizen(citizen);
        citizenVaccinationCenter.setVaccinationCenter(vaccinationCenter);
        return citizenVaccinationCenter;
	}
	
	//get currency list
	/*public String getCurrencyList() {
		final HttpHeaders headers = new HttpHeaders();
        headers.add("X-RapidAPI-Key", "f18c1c8b13msh2bdb03c83b1c61fp1b5211jsn2468bc7479b8");
        headers.add("X-RapidAPI-Host", "currency-exchange.p.rapidapi.com");
        final HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> res=restTemplate.exchange("https://currency-exchange.p.rapidapi.com/listquotes", HttpMethod.GET, entity, String.class);
        String arr1=null;
        if (res != null && res.getStatusCodeValue()==200) {
		String arr=res.getBody();
		arr1 = res.getBody().toString();
		
		}
        return arr1;
	}*/
	
	public String getCurrencyList() {
		final HttpHeaders headers = new HttpHeaders();
        headers.add("X-RapidAPI-Key", "f18c1c8b13msh2bdb03c83b1c61fp1b5211jsn2468bc7479b8");
        headers.add("X-RapidAPI-Host", "currency-exchange.p.rapidapi.com");
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> res=restTemplate.exchange("https://currency-exchange.p.rapidapi.com/listquotes", HttpMethod.GET, entity, String.class);
        String arr1=null;
        if (res != null && res.getStatusCodeValue()==200) {
		String arr=res.getBody();
		arr1 = res.getBody().toString();
		
		}
        return arr1;
	}
	
	

	public List<Citizen> getCitizenList() {
		//we can use bean property row mapper when we don't want custom row mapper but here we need eep our pojo class proerty should sam as data base coloum name
		//otherwise we need to specify coloum alias accordin to data base coloumn name
		List<Citizen> citizen = jdbcTemplate.query("select * from citizen",new BeanPropertyRowMapper<Citizen>(Citizen.class));
		return citizen;
	}
	}
