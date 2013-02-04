// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type to define business date convention adjustment to final payment period per leg.
 */
public class FinalCalculationPeriodDateAdjustment implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private RelevantUnderlyingDateReference relevantUnderlyingDateReference;
	
	@Element
	private InterestRateStreamReference swapStreamReference;
	
	@Element
	private BusinessDayConventionEnum businessDayConvention;
	
    
	/**
     * public getter
     *
     * Reference to the unadjusted cancellation effective dates.
     *
     * @returns com.leansoft.fpml.nano.RelevantUnderlyingDateReference
	 */
	public RelevantUnderlyingDateReference getRelevantUnderlyingDateReference() {
	    return this.relevantUnderlyingDateReference;
	}
	
	/**
	 * public setter
	 *
     * Reference to the unadjusted cancellation effective dates.
     *
     * @param com.leansoft.fpml.nano.RelevantUnderlyingDateReference
	 */
	public void setRelevantUnderlyingDateReference(RelevantUnderlyingDateReference relevantUnderlyingDateReference) {
	    this.relevantUnderlyingDateReference = relevantUnderlyingDateReference;
	}
	/**
     * public getter
     *
     * Reference to the leg, where date adjustments may apply.
     *
     * @returns com.leansoft.fpml.nano.InterestRateStreamReference
	 */
	public InterestRateStreamReference getSwapStreamReference() {
	    return this.swapStreamReference;
	}
	
	/**
	 * public setter
	 *
     * Reference to the leg, where date adjustments may apply.
     *
     * @param com.leansoft.fpml.nano.InterestRateStreamReference
	 */
	public void setSwapStreamReference(InterestRateStreamReference swapStreamReference) {
	    this.swapStreamReference = swapStreamReference;
	}
	/**
     * public getter
     *
     * Override business date convention. This takes precedence over leg level information.
     *
     * @returns com.leansoft.fpml.nano.BusinessDayConventionEnum
	 */
	public BusinessDayConventionEnum getBusinessDayConvention() {
	    return this.businessDayConvention;
	}
	
	/**
	 * public setter
	 *
     * Override business date convention. This takes precedence over leg level information.
     *
     * @param com.leansoft.fpml.nano.BusinessDayConventionEnum
	 */
	public void setBusinessDayConvention(BusinessDayConventionEnum businessDayConvention) {
	    this.businessDayConvention = businessDayConvention;
	}

}