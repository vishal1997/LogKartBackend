/**
 * 
 */
package com.logkart.mongodb.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Vishal Gupta
 *
 */
@Getter
@Builder
public class Transporter {
	
	private String username;
	private String name;
	private String emailId;
	private String address;
	private List<String> vehicleId;
	private List<String> phoneNo;
	private List<String> cityId;
	private List<String> orderId;
}
