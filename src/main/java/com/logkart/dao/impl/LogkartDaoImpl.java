/**
 * 
 */
package com.logkart.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.logkart.common.Constants.StatusCode;
import com.logkart.dao.LogkartDao;
import com.logkart.mongodb.dbmodel.DbCities;
import com.logkart.mongodb.repository.CitiesRepository;


/**
 * @author Vishal Gupta
 *
 */
public class LogkartDaoImpl implements LogkartDao{

	/* (non-Javadoc)
	 * @see com.logkart.dao.LogkartDao#addCity(java.util.List)
	 */
	
	@Autowired 
	private CitiesRepository citiesRepo;
	
	@Override
	public String addCity(List<DbCities> cities) {
		
		try {
			citiesRepo.save(cities);
		} catch(Exception ex) {
			throw new RuntimeException("Error while storing cities.");
		}
		return StatusCode.SUCCESS;
	}

}
