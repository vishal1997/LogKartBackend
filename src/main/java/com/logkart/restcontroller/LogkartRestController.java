package com.logkart.restcontroller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
@RequestMapping("/api/v1/")
public class LogkartRestController {
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public Map<String, String> getName() {
		Map<String, String> status = new HashMap<String, String>();
		status.put("User", "LogKart");
		return status;
	}

}
