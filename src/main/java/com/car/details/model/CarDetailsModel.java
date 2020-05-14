/**
 * 
 */
package com.car.details.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ANGSHUMAN
 *
 */
@Document(collection = "car-details")
@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(value = Include.NON_NULL)
public class CarDetailsModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Getter
	@Setter
	String carId;
	
	@Getter
	@Setter
	String userId;
	
	@Getter
	@Setter
	String carManufacturerName;
	
	@Getter
	@Setter
	String carModel;
	
	@Getter
	@Setter
	String carImage;
	
	@Getter
	@Setter
	Integer carStatus;

}
