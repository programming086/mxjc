// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * The frequency at which a rate is compounded.
 */
public class CompoundingFrequency implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String compoundingFrequencyScheme;
	
    
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
	public String getCompoundingFrequencyScheme() {
	    return this.compoundingFrequencyScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setCompoundingFrequencyScheme(String compoundingFrequencyScheme) {
	    this.compoundingFrequencyScheme = compoundingFrequencyScheme;
	}

}