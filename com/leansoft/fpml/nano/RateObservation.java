// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;

/**
 * A type defining parameters associated with an individual observation or fixing. This type forms part of the cashflow representation of a stream.
 */
public class RateObservation implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Date resetDate;
	
	@Element
	private Date adjustedFixingDate;
	
	@Element
	private BigDecimal observedRate;
	
	@Element
	private BigDecimal treatedRate;
	
	@Element
	private BigInteger observationWeight;
	
	@Element
	private RateReference rateReference;
	
	@Element
	private BigDecimal forecastRate;
	
	@Element
	private BigDecimal treatedForecastRate;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The reset date.
     *
     * @returns java.util.Date
	 */
	public Date getResetDate() {
	    return this.resetDate;
	}
	
	/**
	 * public setter
	 *
     * The reset date.
     *
     * @param java.util.Date
	 */
	public void setResetDate(Date resetDate) {
	    this.resetDate = resetDate;
	}
	/**
     * public getter
     *
     * The adjusted fixing date, i.e. the actual date the rate is observed. The date should already be adjusted for any applicable business day convention.
     *
     * @returns java.util.Date
	 */
	public Date getAdjustedFixingDate() {
	    return this.adjustedFixingDate;
	}
	
	/**
	 * public setter
	 *
     * The adjusted fixing date, i.e. the actual date the rate is observed. The date should already be adjusted for any applicable business day convention.
     *
     * @param java.util.Date
	 */
	public void setAdjustedFixingDate(Date adjustedFixingDate) {
	    this.adjustedFixingDate = adjustedFixingDate;
	}
	/**
     * public getter
     *
     * The actual observed rate before any required rate treatment is applied, e.g. before converting a rate quoted on a discount basis to an equivalent yield. An observed rate of 5% would be represented as 0.05.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getObservedRate() {
	    return this.observedRate;
	}
	
	/**
	 * public setter
	 *
     * The actual observed rate before any required rate treatment is applied, e.g. before converting a rate quoted on a discount basis to an equivalent yield. An observed rate of 5% would be represented as 0.05.
     *
     * @param java.math.BigDecimal
	 */
	public void setObservedRate(BigDecimal observedRate) {
	    this.observedRate = observedRate;
	}
	/**
     * public getter
     *
     * The observed rate after any required rate treatment is applied. A treated rate of 5% would be represented as 0.05.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getTreatedRate() {
	    return this.treatedRate;
	}
	
	/**
	 * public setter
	 *
     * The observed rate after any required rate treatment is applied. A treated rate of 5% would be represented as 0.05.
     *
     * @param java.math.BigDecimal
	 */
	public void setTreatedRate(BigDecimal treatedRate) {
	    this.treatedRate = treatedRate;
	}
	/**
     * public getter
     *
     * The number of days weighting to be associated with the rate observation, i.e. the number of days such rate is in effect. This is applicable in the case of a weighted average method of calculation where more than one reset date is established for a single calculation period.
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getObservationWeight() {
	    return this.observationWeight;
	}
	
	/**
	 * public setter
	 *
     * The number of days weighting to be associated with the rate observation, i.e. the number of days such rate is in effect. This is applicable in the case of a weighted average method of calculation where more than one reset date is established for a single calculation period.
     *
     * @param java.math.BigInteger
	 */
	public void setObservationWeight(BigInteger observationWeight) {
	    this.observationWeight = observationWeight;
	}
	/**
     * public getter
     *
     * A pointer style reference to a floating rate component defined as part of a stub calculation period amount component. It is only required when it is necessary to distinguish two rate observations for the same fixing date which could occur when linear interpolation of two different rates occurs for a stub calculation period.
     *
     * @returns com.leansoft.fpml.nano.RateReference
	 */
	public RateReference getRateReference() {
	    return this.rateReference;
	}
	
	/**
	 * public setter
	 *
     * A pointer style reference to a floating rate component defined as part of a stub calculation period amount component. It is only required when it is necessary to distinguish two rate observations for the same fixing date which could occur when linear interpolation of two different rates occurs for a stub calculation period.
     *
     * @param com.leansoft.fpml.nano.RateReference
	 */
	public void setRateReference(RateReference rateReference) {
	    this.rateReference = rateReference;
	}
	/**
     * public getter
     *
     * The value representing the forecast rate used to calculate the forecast future value of the accrual period.A value of 1% should be represented as 0.01
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getForecastRate() {
	    return this.forecastRate;
	}
	
	/**
	 * public setter
	 *
     * The value representing the forecast rate used to calculate the forecast future value of the accrual period.A value of 1% should be represented as 0.01
     *
     * @param java.math.BigDecimal
	 */
	public void setForecastRate(BigDecimal forecastRate) {
	    this.forecastRate = forecastRate;
	}
	/**
     * public getter
     *
     * The value representing the forecast rate after applying rate treatment rules. A value of 1% should be represented as 0.01
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getTreatedForecastRate() {
	    return this.treatedForecastRate;
	}
	
	/**
	 * public setter
	 *
     * The value representing the forecast rate after applying rate treatment rules. A value of 1% should be represented as 0.01
     *
     * @param java.math.BigDecimal
	 */
	public void setTreatedForecastRate(BigDecimal treatedForecastRate) {
	    this.treatedForecastRate = treatedForecastRate;
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