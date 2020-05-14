/**
 * 
 */
package com.car.details.service;

import org.springframework.util.MultiValueMap;

import com.car.details.model.CarDetailsModel;

/**
 * @author ANGSHUMAN
 *
 */
public interface CarDetailsService {

	public CarDetailsModel registerCar(CarDetailsModel model) throws Exception;

}
