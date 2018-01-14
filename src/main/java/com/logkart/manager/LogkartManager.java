package com.logkart.manager;

import java.util.List;

import com.logkart.mongodb.model.Cities;

/**
 * 
 * @author Vishal Gupta
 *
 */
public interface LogkartManager {
	
	public String addCity(List<Cities> cities);
	
}