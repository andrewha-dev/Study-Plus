package com.conuhacks.studyplus.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.conuhacks.studyplus.model.CU_SR_OPEN_DATA_SCHED;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RestController
public class test {
	public static final String URL = "jdbc:mysql://localhost:3306/testdb";
	public static final String USER = "testuser";
	public static final String PASS = "testpass";
	private EntityManager entityManager;
	@RequestMapping(value = "api/test", method= RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getAll(@RequestParam("campus") String campus, 
			@RequestParam("building")String building, 
			@RequestParam("startTime")String startTime, 
			@RequestParam("endTime")String endTime) {
		
//		Session session = sessionFactory.getCurrentSession();
//        Criteria criteria = session.createCriteria(ContactModel.class);
//        criteria.addOrder(Order.asc("contactName"));
//        return criteria.list();
	
//		session.createSQLQuery("select name from country").list();
		
		System.out.println("Reached this emthod");
		return "{\"dwad + " + building + "INSIDE\": \"LIFE\"}";
	}
	
	

}
