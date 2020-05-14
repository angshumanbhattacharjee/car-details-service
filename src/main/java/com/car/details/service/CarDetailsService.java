/**
 * 
 */
package com.car.details.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.car.details.model.CarDetailsCriteriaModel;
import com.car.details.model.CarDetailsModel;

/**
 * @author ANGSHUMAN
 *
 */
public interface CarDetailsService {

	public CarDetailsModel registerCar(CarDetailsModel model) throws Exception;

	public List<CarDetailsModel> getCarsByCriteria(CarDetailsCriteriaModel criteria) throws Exception;

}
