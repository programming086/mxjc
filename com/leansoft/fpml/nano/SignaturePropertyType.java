// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

@RootElement(name = "SignatureProperty", namespace = "http://www.w3.org/2000/09/xmldsig#")
public class SignaturePropertyType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Attribute(name = "Target")
	private String target;
	
	@Attribute(name = "Id")
	private String id;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getTarget() {
	    return this.target;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setTarget(String target) {
	    this.target = target;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getId() {
	    return this.id;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setId(String id) {
	    this.id = id;
	}

}