package com.logkart.mongodb.dbmodel;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Vishal Gupta
 *
 */
@Getter
@Setter
@Builder
public class DbCities {

	private String cityId;
	private String name;
	private List<String> pinCode;
	private String state; 
}
