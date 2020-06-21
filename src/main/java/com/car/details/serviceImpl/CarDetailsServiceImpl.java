/**
 * 
 */
package com.car.details.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.car.details.model.CarDetailsCriteriaModel;
import com.car.details.model.CarDetailsModel;
import com.car.details.repository.CarDetailsRepository;
import com.car.details.service.CarDetailsService;
import com.car.details.utility.CommonUtility;

/**
 * @author ANGSHUMAN
 *
 */
@Service
public class CarDetailsServiceImpl implements CarDetailsService {
	
	@Autowired
	private CarDetailsRepository repository;

	
	/**
	 * Service method used to register or update the Car Model object
	 *  */
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
	
	/**
	 * Service method for filtering logic based on criteria model
	 *  */
	@Override
	public List<CarDetailsModel> getCarsByCriteria(CarDetailsCriteriaModel criteria) throws Exception {
		List<CarDetailsModel> list = null;
		try {
			list = repository.findByCriteria(criteria);
		} catch (Exception e) {
			System.out.println("Error Message: " + e.getMessage());
			System.out.println("StackTrace: " + e.getStackTrace());
			throw e;
		}
		return list ;
	}

	
	/**
	 * Private method used to prepare the incoming Model object for register or update
	 *  */
	private CarDetailsModel prepareObject(CarDetailsModel model) throws Exception {
		//for updating car details
		if(!StringUtils.isEmpty(model.getCarId())) {
			Optional<CarDetailsModel> model1 = repository.findById(model.getCarId());
			model.setCarStatus(2);
			model.setUserId(model1.get().getUserId());
		}
		//for registering car details
		else {
			model.setCarStatus(2);
			model.setCarAddDate(CommonUtility.getCurrentDateInString());
		}
		
		// TODO Auto-generated method stub
		return model;
	}
}
