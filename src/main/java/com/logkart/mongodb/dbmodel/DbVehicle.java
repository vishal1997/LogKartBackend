package com.logkart.mongodb.dbmodel;

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
public class DbVehicle {
	
	@Id
	private String vehicleId;
	private String transporterId;
	private String type;
	private String weight;
	private String vehicleNumber;
}
