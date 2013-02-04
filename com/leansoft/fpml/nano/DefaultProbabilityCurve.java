// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A set of default probabilities.
 */
public class DefaultProbabilityCurve extends PricingStructureValuation implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PricingStructureReference baseYieldCurve;
	
	@Element
	private TermCurve defaultProbabilities;
	
    
	/**
     * public getter
     *
     * A reference to the yield curve values used as a basis for this credit curve valuation.
     *
     * @returns com.leansoft.fpml.nano.PricingStructureReference
	 */
	public PricingStructureReference getBaseYieldCurve() {
	    return this.baseYieldCurve;
	}
	
	/**
	 * public setter
	 *
     * A reference to the yield curve values used as a basis for this credit curve valuation.
     *
     * @param com.leansoft.fpml.nano.PricingStructureReference
	 */
	public void setBaseYieldCurve(PricingStructureReference baseYieldCurve) {
	    this.baseYieldCurve = baseYieldCurve;
	}
	/**
     * public getter
     *
     * A collection of default probabilities.
     *
     * @returns com.leansoft.fpml.nano.TermCurve
	 */
	public TermCurve getDefaultProbabilities() {
	    return this.defaultProbabilities;
	}
	
	/**
	 * public setter
	 *
     * A collection of default probabilities.
     *
     * @param com.leansoft.fpml.nano.TermCurve
	 */
	public void setDefaultProbabilities(TermCurve defaultProbabilities) {
	    this.defaultProbabilities = defaultProbabilities;
	}

}