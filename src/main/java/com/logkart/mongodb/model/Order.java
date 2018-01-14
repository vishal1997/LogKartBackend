/**
 * 
 */
package com.logkart.mongodb.model;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Vishal Gupta
 *
 */

@Getter
@Builder
public class Order {

	private String orderId;
	private String transporterId;
	private String customerId;
	private String packageId;
	private Date orderDate;
	private Date estimateDate;
	private Date deliveryDate;
	private boolean status;
}
