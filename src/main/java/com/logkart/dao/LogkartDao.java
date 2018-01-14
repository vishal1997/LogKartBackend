package com.logkart.dao;

import java.util.List;

import com.logkart.mongodb.dbmodel.DbCities;

/**
 * @author Vishal Gupta
 *
 */
public interface LogkartDao {

	public String addCity(List<DbCities> cities);
}
