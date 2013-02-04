// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * A set of credit curve values, which can include pricing inputs (which are typically credit spreads), default probabilities, and recovery rates.
 */
@RootElement(name = "creditCurveValuation", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class CreditCurveValuation extends PricingStructureValuation implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private QuotedAssetSet inputs;
	
	@Element
	private DefaultProbabilityCurve defaultProbabilityCurve;
	
	@Element
	private BigDecimal recoveryRate;
	
	@Element
	private TermCurve recoveryRateCurve;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.QuotedAssetSet
	 */
	public QuotedAssetSet getInputs() {
	    return this.inputs;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.QuotedAssetSet
	 */
	public void setInputs(QuotedAssetSet inputs) {
	    this.inputs = inputs;
	}
	/**
     * public getter
     *
     * A curve of default probabilities.
     *
     * @returns com.leansoft.fpml.nano.DefaultProbabilityCurve
	 */
	public DefaultProbabilityCurve getDefaultProbabilityCurve() {
	    return this.defaultProbabilityCurve;
	}
	
	/**
	 * public setter
	 *
     * A curve of default probabilities.
     *
     * @param com.leansoft.fpml.nano.DefaultProbabilityCurve
	 */
	public void setDefaultProbabilityCurve(DefaultProbabilityCurve defaultProbabilityCurve) {
	    this.defaultProbabilityCurve = defaultProbabilityCurve;
	}
	/**
     * public getter
     *
     * A single recovery rate, to be used for all terms.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getRecoveryRate() {
	    return this.recoveryRate;
	}
	
	/**
	 * public setter
	 *
     * A single recovery rate, to be used for all terms.
     *
     * @param java.math.BigDecimal
	 */
	public void setRecoveryRate(BigDecimal recoveryRate) {
	    this.recoveryRate = recoveryRate;
	}
	/**
     * public getter
     *
     * A curve of recovery rates, allowing different terms to have different recovery rates.
     *
     * @returns com.leansoft.fpml.nano.TermCurve
	 */
	public TermCurve getRecoveryRateCurve() {
	    return this.recoveryRateCurve;
	}
	
	/**
	 * public setter
	 *
     * A curve of recovery rates, allowing different terms to have different recovery rates.
     *
     * @param com.leansoft.fpml.nano.TermCurve
	 */
	public void setRecoveryRateCurve(TermCurve recoveryRateCurve) {
	    this.recoveryRateCurve = recoveryRateCurve;
	}

}