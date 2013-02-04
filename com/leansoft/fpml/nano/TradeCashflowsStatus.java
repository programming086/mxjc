// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * An coding scheme used to describe the matching status of a TradeCashFlows element.
 */
public class TradeCashflowsStatus implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String tradeCashflowsStatusScheme;
	
    
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
	public String getTradeCashflowsStatusScheme() {
	    return this.tradeCashflowsStatusScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setTradeCashflowsStatusScheme(String tradeCashflowsStatusScheme) {
	    this.tradeCashflowsStatusScheme = tradeCashflowsStatusScheme;
	}

}