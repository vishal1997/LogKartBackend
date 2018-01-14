package com.logkart.mongodb.model;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Vishal Gupta
 *
 */
@Builder
@Getter
public class Package {

	private String packageId;
	private List<String> items;
	private Date date;
	private String weight;
}
