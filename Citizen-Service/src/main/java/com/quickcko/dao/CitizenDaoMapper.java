package com.quickcko.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.quickcko.model.Citizen;

public class CitizenDaoMapper implements  RowMapper<Citizen> {

	@Override
	public Citizen mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Citizen citizen = new Citizen();
        citizen.setId(rs.getInt("id"));
		citizen.setName(rs.getString("name"));
		citizen.setVaccination_center_id(rs.getInt("vaccination_center_id"));
		return citizen;
	}

}
