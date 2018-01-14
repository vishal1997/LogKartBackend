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

@Builder
@Getter
public class Customer {
	
	private String username;
	private String firstname;
	private String lastname;
	private List<String> phoneNo;
	private String emailId;
	private String address;
	private List<String> orderId;
}
