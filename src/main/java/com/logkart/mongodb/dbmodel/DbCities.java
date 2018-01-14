package com.logkart.mongodb.dbmodel;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Getter;

/**
 * 
 * @author Vishal Gupta
 *
 */
@Getter
@Builder
public class DbCities {

	@Id
	private String cityId;
	private String name;
	private List<String> pinCode;
	private String state; 
}
