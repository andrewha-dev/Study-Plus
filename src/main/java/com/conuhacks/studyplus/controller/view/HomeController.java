package com.conuhacks.studyplus.controller.view;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private String message = "Home";
	
	
	@RequestMapping("/")
	public String Index(Map<String, Object> model) {
		model.put("message", this.message);
		return "home";
	}
}
