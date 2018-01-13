package com.logkart.mongodb.dbmodel;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DbCities {

	private String cityId;
	private String name;
	private List<String> pinCode;
	private String state; 
}
