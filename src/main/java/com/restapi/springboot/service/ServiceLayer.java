package com.restapi.springboot.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restapi.springboot.exception.UserAPIException;
import com.restapi.springboot.vo.UserVO;

@Service
public class ServiceLayer {

	private static final Logger logger = LogManager.getLogger(ServiceLayer.class);

	@Autowired
	RestTemplate restTemplate;

	public UserVO consumeUserAPI() throws UserAPIException {
		try {
			String apiURL = "https://jsonplaceholder.typicode.com/todos/1";
			logger.info("Calling API: {}", apiURL);
			UserVO response = restTemplate.getForObject(apiURL, UserVO.class);
			logger.info("API Response: {}", response);
			return response;
		} catch (Exception e) {
			logger.error("An error occurred while consuming the user API: {}", e.getMessage());
			throw new UserAPIException("Failed to consume user API :: " + e.getMessage());
		}
	}
}
