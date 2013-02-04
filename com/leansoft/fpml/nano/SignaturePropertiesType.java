// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

@RootElement(name = "SignatureProperties", namespace = "http://www.w3.org/2000/09/xmldsig#")
public class SignaturePropertiesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SignatureProperty")
	private List<SignaturePropertyType> signatureProperty;
	
	@Attribute(name = "Id")
	private String id;
	
    
	/**
	 * public getter
	 *
     * @returns java.util.List<com.leansoft.fpml.nano.SignaturePropertyType>
	 */
	public List<SignaturePropertyType> getSignatureProperty() {
	    return this.signatureProperty;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<com.leansoft.fpml.nano.SignaturePropertyType>
	 */
	public void setSignatureProperty(List<SignaturePropertyType> signatureProperty) {
	    this.signatureProperty = signatureProperty;
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