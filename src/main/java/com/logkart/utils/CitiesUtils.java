/**
 * 
 */
package com.logkart.utils;

import java.util.ArrayList;
import java.util.List;
import com.logkart.mongodb.dbmodel.DbCities;
import com.logkart.mongodb.model.Cities;

/**
 * @author Vishal Gupta
 *
 */
public class CitiesUtils {
	
	public List<DbCities> convertCitiesToDbCities(List<Cities> cities) {
		
		List<DbCities> dbCities = new ArrayList<DbCities>();
		for(Cities city: cities) {
			
			DbCities dbCity = DbCities.builder()
								.cityId(city.getName().substring(0, 2).toLowerCase() + city.getPinCode())
								.name(city.getName())
								.pinCode(city.getPinCode())
								.state(city.getState())
								.build();
			dbCities.add(dbCity);
		}
		return dbCities;
	}

}
