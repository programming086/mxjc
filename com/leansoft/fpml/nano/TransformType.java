// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

@RootElement(name = "Transform", namespace = "http://www.w3.org/2000/09/xmldsig#")
public class TransformType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Attribute(name = "Algorithm")
	private String algorithm;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getAlgorithm() {
	    return this.algorithm;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setAlgorithm(String algorithm) {
	    this.algorithm = algorithm;
	}

}