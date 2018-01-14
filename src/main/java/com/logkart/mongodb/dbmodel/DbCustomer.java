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
public class DbCustomer {
	
	@Id
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	private List<String> phoneNo;
	private String emailId;
	private String address;
	private List<String> orderId;
}
