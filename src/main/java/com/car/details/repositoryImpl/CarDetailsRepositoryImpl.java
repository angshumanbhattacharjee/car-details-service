/**
 * 
 */
package com.car.details.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.StringUtils;

import com.car.details.model.CarDetailsCriteriaModel;
import com.car.details.model.CarDetailsModel;
import com.car.details.repository.CarDetailsCriteriaRepository;
import com.car.details.repository.CarDetailsRepository;

/**
 * @author ANGSHUMAN
 *
 */

public class CarDetailsRepositoryImpl implements CarDetailsCriteriaRepository {
	
	@Autowired
	private MongoTemplate repository;

	/**
	 * Repository method used for all filtering logic and return the Model response
	 * 
	 */
	@Override
	public List<CarDetailsModel> findByCriteria(CarDetailsCriteriaModel criteria) throws Exception {
		List<CarDetailsModel> list = null;
		try {
			list = repository.find(getWhereClause(criteria), CarDetailsModel.class);
		} catch (Exception e) {
			System.out.println("Error Message: " + e.getMessage());
			System.out.println("StackTrace: " + e.getStackTrace());
			throw e;
		}
		return list ;
	}

	/**
	 * 
	 * @param criteria
	 * @return
	 * 
	 * Method used to prepare the whereClause to return a Query object
	 */
	private Query getWhereClause(CarDetailsCriteriaModel criteria) {
		Query whereClause = new Query();
		
		//getCarsbyUserId
		if(!StringUtils.isEmpty(criteria.getUserId())) {
			whereClause.addCriteria(Criteria.where("userId").is(criteria.getUserId()));
		}
		//getCarsbyStatus
		if(!StringUtils.isEmpty(criteria.getCarStatus())) {
			whereClause.addCriteria(Criteria.where("carStatus").is(criteria.getCarStatus()));
		}
		//getCarsbyCarId
		if(!StringUtils.isEmpty(criteria.getCarId())) {
			whereClause.addCriteria(Criteria.where("carId").is(criteria.getCarId()));
		}
		return whereClause;
	}

}
