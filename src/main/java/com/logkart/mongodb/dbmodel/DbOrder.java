package com.logkart.mongodb.dbmodel;

import java.util.Date;

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
public class DbOrder {

	private String orderId;
	private String transporterId;
	private String customerId;
	private String packageId;
	private Date orderDate;
	private Date estimateDate;
	private Date deliveryDate;
	private boolean status;
}
