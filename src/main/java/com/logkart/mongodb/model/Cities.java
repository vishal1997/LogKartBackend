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
@Getter
@Builder
public class Cities {

	private String name;
	private List<String> pinCode;
	private String state; 
}
