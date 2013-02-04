// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;

public class SingleValuationDate implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigInteger businessDays;
	
    
	/**
     * public getter
     *
     * A number of business days. Its precise meaning is dependant on the context in which this element is used. ISDA 2003 Term: Business Day
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getBusinessDays() {
	    return this.businessDays;
	}
	
	/**
	 * public setter
	 *
     * A number of business days. Its precise meaning is dependant on the context in which this element is used. ISDA 2003 Term: Business Day
     *
     * @param java.math.BigInteger
	 */
	public void setBusinessDays(BigInteger businessDays) {
	    this.businessDays = businessDays;
	}

}