// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class InterestShortFall implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private InterestShortfallCapEnum interestShortfallCap;
	
	@Element
	private boolean compounding;
	
	@Element
	private FloatingRateIndex rateSource;
	
    
	/**
     * public getter
     *
     * Specifies the nature of the interest Shortfall cap (i.e. Fixed Cap or Variable Cap) in the case where it is applicable. ISDA 2003 Term: Interest Shortfall Cap.
     *
     * @returns com.leansoft.fpml.nano.InterestShortfallCapEnum
	 */
	public InterestShortfallCapEnum getInterestShortfallCap() {
	    return this.interestShortfallCap;
	}
	
	/**
	 * public setter
	 *
     * Specifies the nature of the interest Shortfall cap (i.e. Fixed Cap or Variable Cap) in the case where it is applicable. ISDA 2003 Term: Interest Shortfall Cap.
     *
     * @param com.leansoft.fpml.nano.InterestShortfallCapEnum
	 */
	public void setInterestShortfallCap(InterestShortfallCapEnum interestShortfallCap) {
	    this.interestShortfallCap = interestShortfallCap;
	}
	/**
	 * public getter
	 *
     * @returns .boolean
	 */
	public boolean getCompounding() {
	    return this.compounding;
	}
	
	/**
	 * public setter
	 *
     * @param .boolean
	 */
	public void setCompounding(boolean compounding) {
	    this.compounding = compounding;
	}
	/**
     * public getter
     *
     * The rate source in the case of a variable cap.
     *
     * @returns com.leansoft.fpml.nano.FloatingRateIndex
	 */
	public FloatingRateIndex getRateSource() {
	    return this.rateSource;
	}
	
	/**
	 * public setter
	 *
     * The rate source in the case of a variable cap.
     *
     * @param com.leansoft.fpml.nano.FloatingRateIndex
	 */
	public void setRateSource(FloatingRateIndex rateSource) {
	    this.rateSource = rateSource;
	}

}