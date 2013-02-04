// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type defining a short form unique identifier for a future contract.
 */
public class FutureId implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String futureIdScheme;
	
    
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
	public String getFutureIdScheme() {
	    return this.futureIdScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setFutureIdScheme(String futureIdScheme) {
	    this.futureIdScheme = futureIdScheme;
	}

}