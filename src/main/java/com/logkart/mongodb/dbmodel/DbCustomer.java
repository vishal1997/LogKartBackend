package com.logkart.mongodb.dbmodel;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Vishal Gupta
 *
 */
@Getter
@Setter
public class DbCustomer {
	
	private String username;
	private String firstname;
	private String lastname;
	private List<String> phoneNo;
	private String emailId;
	private String address;
	private List<String> orderId;
}
