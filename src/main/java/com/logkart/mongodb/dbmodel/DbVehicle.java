package com.logkart.mongodb.dbmodel;

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
public class DbVehicle {
	
	private String vehicleId;
	private String transporterId;
	private String type;
	private String weight;
	private String vehicleNumber;
}
