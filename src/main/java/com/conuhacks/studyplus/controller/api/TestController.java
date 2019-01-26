package com.conuhacks.studyplus.controller.api;


import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "api/test", method = RequestMethod.GET, produces = "application/json")
	public String test() {
		return JSONObject.quote("Hello World");
	}
	
	@RequestMapping(value = "api/testWithParams", method = RequestMethod.GET, produces = "application/json")
	public String testWithParams(String startDate  , String endDate) {
		return JSONObject.quote("test with params");
	}
	
	
}
