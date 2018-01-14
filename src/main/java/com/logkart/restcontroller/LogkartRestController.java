package com.logkart.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.logkart.manager.LogkartManager;
import com.logkart.mongodb.model.Cities;

/**
 * 
 * @author Vishal Gupta
 *
 */
@RestController
@EnableWebMvc
@RequestMapping("/api/v1/")
public class LogkartRestController {
	
	@Autowired
	private LogkartManager logkartManager;
	
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public Map<String, String> getName() {
		Map<String, String> status = new HashMap<String, String>();
		status.put("User", "LogKart");
		return status;
	}
	
	@RequestMapping(value="/addcity", method = RequestMethod.PUT)
	public Map<String, String> addCity(@RequestBody final List<Cities> cities) {
		
		Map<String, String> status = new HashMap<String, String> ();
		status.put("Status", logkartManager.addCity(cities));
		return status;
	}
	
}
