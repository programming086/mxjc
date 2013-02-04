// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * A definition of a shift with respect to a specific pricing parameter.
 */
public class PricingParameterShift implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private AssetOrTermPointOrPricingStructureReference parameterReference;
	
	@Element
	private BigDecimal shift;
	
	@Element
	private PriceQuoteUnits shiftUnits;
	
	@Attribute  
	private String id;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.AssetOrTermPointOrPricingStructureReference
	 */
	public AssetOrTermPointOrPricingStructureReference getParameterReference() {
	    return this.parameterReference;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.AssetOrTermPointOrPricingStructureReference
	 */
	public void setParameterReference(AssetOrTermPointOrPricingStructureReference parameterReference) {
	    this.parameterReference = parameterReference;
	}
	/**
     * public getter
     *
     * The size of the denominator, e.g. 0.0001 = 1 bp.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getShift() {
	    return this.shift;
	}
	
	/**
	 * public setter
	 *
     * The size of the denominator, e.g. 0.0001 = 1 bp.
     *
     * @param java.math.BigDecimal
	 */
	public void setShift(BigDecimal shift) {
	    this.shift = shift;
	}
	/**
     * public getter
     *
     * The units of the denominator, e.g. currency. If not present, use the units of the PricingInputReference.
     *
     * @returns com.leansoft.fpml.nano.PriceQuoteUnits
	 */
	public PriceQuoteUnits getShiftUnits() {
	    return this.shiftUnits;
	}
	
	/**
	 * public setter
	 *
     * The units of the denominator, e.g. currency. If not present, use the units of the PricingInputReference.
     *
     * @param com.leansoft.fpml.nano.PriceQuoteUnits
	 */
	public void setShiftUnits(PriceQuoteUnits shiftUnits) {
	    this.shiftUnits = shiftUnits;
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