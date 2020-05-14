/**
 * 
 */
package com.car.details.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.car.details.model.CarDetailsModel;
import com.car.details.repository.CarDetailsRepository;
import com.car.details.service.CarDetailsService;

/**
 * @author ANGSHUMAN
 *
 */
@Service
public class CarDetailsServiceImpl implements CarDetailsService {
	
	@Autowired
	private CarDetailsRepository repository;

	@Override
	public CarDetailsModel registerCar(CarDetailsModel model) throws Exception {
		CarDetailsModel model1 = null;
		try {
			model1 = repository.save(prepareObject(model));
		} catch (Exception e) {
			System.out.println("Error Message: " + e.getMessage());
			System.out.println("StackTrace: " + e.getStackTrace());
			throw e;
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return model1;
	}

	private CarDetailsModel prepareObject(CarDetailsModel model) throws Exception {
		//for updating car details
		if(!StringUtils.isEmpty(model.getCarId())) {
			model.setCarStatus(2);
		}
		//for registering car details
		else {
			model.setCarStatus(2);
		}
		
		// TODO Auto-generated method stub
		return model;
	}
}
