package com.logkart.mongodb.dbmodel;

import java.util.Date;
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
public class DbPackage {
	
	private String packageId;
	private List<String> items;
	private Date date;
	private String weight;
}
