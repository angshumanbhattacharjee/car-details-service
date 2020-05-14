/**
 * 
 */
package com.car.details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.details.model.CarDetailsModel;
import com.car.details.service.CarDetailsService;

/**
 * @author ANGSHUMAN
 *
 */
@RestController
public class CarDetailsController {

	@Autowired
	private CarDetailsService service;
	
	
	@PostMapping(value = "/car-details-service/registerCar" , produces = "application/json")
	public ResponseEntity registerCar(@RequestBody(required = true) CarDetailsModel model) throws Exception {
		ResponseEntity response = null;
		try {
			response = new ResponseEntity(service.registerCar(model) , HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
			throw e;	
		}
		return response;
	}
}
