package com.logkart.mongodb.dbmodel;

import java.util.Date;
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
public class DbPackage {
	
	@Id
	private String packageId;
	private List<String> items;
	private Date date;
	private String weight;
}
