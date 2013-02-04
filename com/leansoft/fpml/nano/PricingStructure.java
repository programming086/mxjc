// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * An abstract pricing structure base type. Used as a base for structures such as yield curves and volatility matrices..
 */
@RootElement(name = "pricingStructure", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public abstract class PricingStructure implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private String name;
	
	@Element
	private Currency currency;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The name of the structure, e.g "USDLIBOR-3M EOD Curve".
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * The name of the structure, e.g "USDLIBOR-3M EOD Curve".
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * The currency that the structure is expressed in (this is relevant mostly for the Interes Rates asset class).
     *
     * @returns com.leansoft.fpml.nano.Currency
	 */
	public Currency getCurrency() {
	    return this.currency;
	}
	
	/**
	 * public setter
	 *
     * The currency that the structure is expressed in (this is relevant mostly for the Interes Rates asset class).
     *
     * @param com.leansoft.fpml.nano.Currency
	 */
	public void setCurrency(Currency currency) {
	    this.currency = currency;
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