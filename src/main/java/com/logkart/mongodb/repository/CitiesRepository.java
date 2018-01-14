/**
 * 
 */
package com.logkart.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.logkart.mongodb.dbmodel.DbCities;

/**
 * @author Vishal Gupta
 *
 */
public interface CitiesRepository extends MongoRepository<DbCities, String>{

}
