// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * The definitions, such as those published by ISDA, that will define the terms of the trade.
 */
@RootElement(name = "contractualDefinitions", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class ContractualDefinitions implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String contractualDefinitionsScheme;
	
    
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
	public String getContractualDefinitionsScheme() {
	    return this.contractualDefinitionsScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setContractualDefinitionsScheme(String contractualDefinitionsScheme) {
	    this.contractualDefinitionsScheme = contractualDefinitionsScheme;
	}

}