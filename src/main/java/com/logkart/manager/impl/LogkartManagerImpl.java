/**
 * 
 */
package com.logkart.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.logkart.helper.LogkartHelper;
import com.logkart.manager.LogkartManager;
import com.logkart.mongodb.model.Cities;

/**
 * @author Vishal Gupta
 *
 */
public class LogkartManagerImpl implements LogkartManager{

	@Autowired 
	private LogkartHelper logkartHelper;
	
	/* (non-Javadoc)
	 * @see com.logkart.manager.LogkartManager#addCity(java.util.List)
	 */
	@Override
	public String addCity(List<Cities> cities) {
		String status = logkartHelper.addCity(cities);
		return status;
	}

}
