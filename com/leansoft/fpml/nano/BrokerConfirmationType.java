// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * Identifies the market sector in which the trade has been arranged.
 */
public class BrokerConfirmationType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String brokerConfirmationTypeScheme;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getBrokerConfirmationTypeScheme() {
	    return this.brokerConfirmationTypeScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setBrokerConfirmationTypeScheme(String brokerConfirmationTypeScheme) {
	    this.brokerConfirmationTypeScheme = brokerConfirmationTypeScheme;
	}

}