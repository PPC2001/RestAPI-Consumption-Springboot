package com.restapi.springboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.springboot.exception.UserAPIException;
import com.restapi.springboot.service.ServiceLayer;
import com.restapi.springboot.vo.UserVO;

@RestController
public class RestConsumerController {

	private static final Logger logger = LogManager.getLogger(RestConsumerController.class);

	@Autowired
	ServiceLayer serviceLayer;

	@GetMapping("/")
	public ResponseEntity<UserVO> getUserData() throws UserAPIException {
		try {
			logger.info("Received request to fetch user data.");
			UserVO userData = serviceLayer.consumeUserAPI();
			return new ResponseEntity<>(userData, HttpStatus.OK);
		} catch (UserAPIException e) {
			logger.error("RestConsumerController :: getUserData :: {}", e.getMessage());
			throw new UserAPIException("Failed to fetch user data " + e.getMessage());
		}
	}

}
