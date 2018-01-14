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
public class DbTransporter {

	private String username;
	private String name;
	private String emailId;
	private String address;
	private List<String> vehicleId;
	private List<String> phoneNo;
	private List<String> cityId;
	private List<String> orderId;
}
