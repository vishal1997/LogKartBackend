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
public class DbTransporter {

	@Id
	private String username;
	private String name;
	private String emailId;
	private String address;
	private List<String> vehicleId;
	private List<String> phoneNo;
	private List<String> cityId;
	private List<String> orderId;
}
