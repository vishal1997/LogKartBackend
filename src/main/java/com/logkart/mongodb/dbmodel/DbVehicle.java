package com.logkart.mongodb.dbmodel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DbVehicle {
	
	private String vehicleId;
	private String transporterId;
	private String type;
	private String weight;
	private String vehicleNumber;
}
