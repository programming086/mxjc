// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * Reference to a valuation scenario.
 */
public class ValuationScenarioReference extends Reference implements Serializable {

    private static final long serialVersionUID = -1L;

	@Attribute  
	private Object href;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.Object
	 */
	public Object getHref() {
	    return this.href;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.Object
	 */
	public void setHref(Object href) {
	    this.href = href;
	}

}