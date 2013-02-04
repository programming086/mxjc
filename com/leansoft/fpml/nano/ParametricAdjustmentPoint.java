// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * A value of the adjustment point, consisting of the x value and the corresponding y value.
 */
public class ParametricAdjustmentPoint implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigDecimal parameterValue;
	
	@Element
	private BigDecimal adjustmentValue;
	
    
	/**
     * public getter
     *
     * The value of the independent variable (e.g. strike offset).
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getParameterValue() {
	    return this.parameterValue;
	}
	
	/**
	 * public setter
	 *
     * The value of the independent variable (e.g. strike offset).
     *
     * @param java.math.BigDecimal
	 */
	public void setParameterValue(BigDecimal parameterValue) {
	    this.parameterValue = parameterValue;
	}
	/**
     * public getter
     *
     * The value of the dependent variable, the actual adjustment amount.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getAdjustmentValue() {
	    return this.adjustmentValue;
	}
	
	/**
	 * public setter
	 *
     * The value of the dependent variable, the actual adjustment amount.
     *
     * @param java.math.BigDecimal
	 */
	public void setAdjustmentValue(BigDecimal adjustmentValue) {
	    this.adjustmentValue = adjustmentValue;
	}

}