/**
 * 
 */
package com.car.details.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ANGSHUMAN
 *
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDetailsCriteriaModel implements Serializable {

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
	Integer carStatus;

}
