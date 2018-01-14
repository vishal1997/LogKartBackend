/**
 * 
 */
package com.logkart.mongodb.model;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Vishal Gupta
 *
 */

@Getter
@Builder
public class Vehicle {

	private String vehicleId;
	private String transporterId;
	private String type;
	private String weight;
	private String vehicleNumber;
}
