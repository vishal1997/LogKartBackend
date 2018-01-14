package com.logkart.mongodb.dbmodel;

import java.util.Date;

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
public class DbOrder {

	@Id
	private String orderId;
	private String transporterId;
	private String customerId;
	private String packageId;
	private Date orderDate;
	private Date estimateDate;
	private Date deliveryDate;
	private boolean status;
}
