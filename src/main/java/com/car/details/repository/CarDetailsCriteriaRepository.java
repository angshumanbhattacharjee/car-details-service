/**
 * 
 */
package com.car.details.repository;

import java.util.List;

import com.car.details.model.CarDetailsCriteriaModel;
import com.car.details.model.CarDetailsModel;

/**
 * @author ANGSHUMAN
 *
 */
@FunctionalInterface
public interface CarDetailsCriteriaRepository {

	List <CarDetailsModel> findByCriteria(CarDetailsCriteriaModel criteria) throws Exception;
}
