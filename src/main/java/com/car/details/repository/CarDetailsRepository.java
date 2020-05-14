/**
 * 
 */
package com.car.details.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.car.details.model.CarDetailsModel;

/**
 * @author ANGSHUMAN
 *
 */
@Repository
public interface CarDetailsRepository extends MongoRepository<CarDetailsModel,String>{

}
