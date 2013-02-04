// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;
import java.util.List;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The period calculation details for a calculation/accrual period. This will include information about the dates and duration of the accrual period, the rate fixing(s), the notional in effect, and the amount of the accrual.
 */
public class CashflowCalculationPeriod implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<CashflowFixingReference> calculatedRateReference;
	
	@Element
	private Date adjustedStartDate;
	
	@Element
	private Date adjustedEndDate;
	
	@Element
	private BigInteger numberOfDays;
	
	@Element
	private StepReference fixedRateStepReference;
	
	@Element
	private DayCountFraction dayCountFraction;
	
	@Element
	private BigDecimal dayCountYearFraction;
	
	@Element
	private CompoundingMethodEnum compoundingMethod;
	
	@Element
	private BigDecimal accruedAmount;
	
    
	/**
     * public getter
     *
     * Reference to the fixing details defined somewhere in the document.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.CashflowFixingReference>
	 */
	public List<CashflowFixingReference> getCalculatedRateReference() {
	    return this.calculatedRateReference;
	}
	
	/**
	 * public setter
	 *
     * Reference to the fixing details defined somewhere in the document.
     *
     * @param java.util.List<com.leansoft.fpml.nano.CashflowFixingReference>
	 */
	public void setCalculatedRateReference(List<CashflowFixingReference> calculatedRateReference) {
	    this.calculatedRateReference = calculatedRateReference;
	}
	/**
     * public getter
     *
     * Date that defines the beginning of the calculation period.
     *
     * @returns java.util.Date
	 */
	public Date getAdjustedStartDate() {
	    return this.adjustedStartDate;
	}
	
	/**
	 * public setter
	 *
     * Date that defines the beginning of the calculation period.
     *
     * @param java.util.Date
	 */
	public void setAdjustedStartDate(Date adjustedStartDate) {
	    this.adjustedStartDate = adjustedStartDate;
	}
	/**
     * public getter
     *
     * Date that defines the end of the calculation period.
     *
     * @returns java.util.Date
	 */
	public Date getAdjustedEndDate() {
	    return this.adjustedEndDate;
	}
	
	/**
	 * public setter
	 *
     * Date that defines the end of the calculation period.
     *
     * @param java.util.Date
	 */
	public void setAdjustedEndDate(Date adjustedEndDate) {
	    this.adjustedEndDate = adjustedEndDate;
	}
	/**
     * public getter
     *
     * The number of days from the adjusted effective / start date to the adjusted termination / end date calculated in accordance with the applicable day count fraction.
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getNumberOfDays() {
	    return this.numberOfDays;
	}
	
	/**
	 * public setter
	 *
     * The number of days from the adjusted effective / start date to the adjusted termination / end date calculated in accordance with the applicable day count fraction.
     *
     * @param java.math.BigInteger
	 */
	public void setNumberOfDays(BigInteger numberOfDays) {
	    this.numberOfDays = numberOfDays;
	}
	/**
     * public getter
     *
     * Reference to the fixed rate schedule's step in order to identify the calculation period fixed rate.
     *
     * @returns com.leansoft.fpml.nano.StepReference
	 */
	public StepReference getFixedRateStepReference() {
	    return this.fixedRateStepReference;
	}
	
	/**
	 * public setter
	 *
     * Reference to the fixed rate schedule's step in order to identify the calculation period fixed rate.
     *
     * @param com.leansoft.fpml.nano.StepReference
	 */
	public void setFixedRateStepReference(StepReference fixedRateStepReference) {
	    this.fixedRateStepReference = fixedRateStepReference;
	}
	/**
     * public getter
     *
     * The specification for how the number of days between two dates is calculated for purposes of calculation of a fixed or floating payment amount and the basis for how many days are assumed to be in a year. Day Count Fraction is an ISDA term. The equivalent AFB (Association Francaise de Banques) term is Calculation Basis.
     *
     * @returns com.leansoft.fpml.nano.DayCountFraction
	 */
	public DayCountFraction getDayCountFraction() {
	    return this.dayCountFraction;
	}
	
	/**
	 * public setter
	 *
     * The specification for how the number of days between two dates is calculated for purposes of calculation of a fixed or floating payment amount and the basis for how many days are assumed to be in a year. Day Count Fraction is an ISDA term. The equivalent AFB (Association Francaise de Banques) term is Calculation Basis.
     *
     * @param com.leansoft.fpml.nano.DayCountFraction
	 */
	public void setDayCountFraction(DayCountFraction dayCountFraction) {
	    this.dayCountFraction = dayCountFraction;
	}
	/**
     * public getter
     *
     * The year fraction value of the calculation period, result of applying the ISDA rules for day count fraction defined in the ISDA Annex.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getDayCountYearFraction() {
	    return this.dayCountYearFraction;
	}
	
	/**
	 * public setter
	 *
     * The year fraction value of the calculation period, result of applying the ISDA rules for day count fraction defined in the ISDA Annex.
     *
     * @param java.math.BigDecimal
	 */
	public void setDayCountYearFraction(BigDecimal dayCountYearFraction) {
	    this.dayCountYearFraction = dayCountYearFraction;
	}
	/**
     * public getter
     *
     * If more that one calculation period contributes to a single payment amount this element specifies whether compounding is applicable, and if so, what compounding method is to be used. This element must only be included when more that one calculation period contributes to a single payment amount.
     *
     * @returns com.leansoft.fpml.nano.CompoundingMethodEnum
	 */
	public CompoundingMethodEnum getCompoundingMethod() {
	    return this.compoundingMethod;
	}
	
	/**
	 * public setter
	 *
     * If more that one calculation period contributes to a single payment amount this element specifies whether compounding is applicable, and if so, what compounding method is to be used. This element must only be included when more that one calculation period contributes to a single payment amount.
     *
     * @param com.leansoft.fpml.nano.CompoundingMethodEnum
	 */
	public void setCompoundingMethod(CompoundingMethodEnum compoundingMethod) {
	    this.compoundingMethod = compoundingMethod;
	}
	/**
     * public getter
     *
     * The amount of payment accrued during this accrual period. This is required only when there are multiple calculation periods within the same cashflow component, for example when the calculation period is shorter than the payment period.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getAccruedAmount() {
	    return this.accruedAmount;
	}
	
	/**
	 * public setter
	 *
     * The amount of payment accrued during this accrual period. This is required only when there are multiple calculation periods within the same cashflow component, for example when the calculation period is shorter than the payment period.
     *
     * @param java.math.BigDecimal
	 */
	public void setAccruedAmount(BigDecimal accruedAmount) {
	    this.accruedAmount = accruedAmount;
	}

}