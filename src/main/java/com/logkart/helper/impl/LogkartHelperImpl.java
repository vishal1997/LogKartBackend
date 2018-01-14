package com.logkart.helper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.logkart.dao.LogkartDao;
import com.logkart.helper.LogkartHelper;
import com.logkart.mongodb.dbmodel.DbCities;
import com.logkart.mongodb.model.Cities;
import com.logkart.utils.CitiesUtils;

/**
 * @author Vishal Gupta
 *
 */
public class LogkartHelperImpl implements LogkartHelper{

	/* (non-Javadoc)
	 * @see com.logkart.helper.LogkartHelper#addCity(java.util.List)
	 */
	
	@Autowired 
	private CitiesUtils citiesUtils;
	
	@Autowired 
	private LogkartDao logkartDao;
	
	@Override
	public String addCity(List<Cities> cities) {
		
		List<DbCities> dbCities = citiesUtils.convertCitiesToDbCities(cities);
		String status = logkartDao.addCity(dbCities);
		return status;
	}

}
