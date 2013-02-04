// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type definining the parameters used in the calculation of fixed or floating calculation period amounts.
 */
public class Calculation implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Notional notionalSchedule;
	
	@Element
	private FxLinkedNotionalSchedule fxLinkedNotionalSchedule;
	
	@Element
	private Schedule fixedRateSchedule;
	
	@Element
	private DayCountFraction dayCountFraction;
	
	@Element
	private Discounting discounting;
	
	@Element
	private CompoundingMethodEnum compoundingMethod;
	
    
	/**
     * public getter
     *
     * The notional amount or notional amount schedule.
     *
     * @returns com.leansoft.fpml.nano.Notional
	 */
	public Notional getNotionalSchedule() {
	    return this.notionalSchedule;
	}
	
	/**
	 * public setter
	 *
     * The notional amount or notional amount schedule.
     *
     * @param com.leansoft.fpml.nano.Notional
	 */
	public void setNotionalSchedule(Notional notionalSchedule) {
	    this.notionalSchedule = notionalSchedule;
	}
	/**
     * public getter
     *
     * A notional amount schedule where each notional that applied to a calculation period is calculated with reference to a notional amount or notional amount schedule in a different currency by means of a spot currency exchange rate which is normally observed at the beginning of each period.
     *
     * @returns com.leansoft.fpml.nano.FxLinkedNotionalSchedule
	 */
	public FxLinkedNotionalSchedule getFxLinkedNotionalSchedule() {
	    return this.fxLinkedNotionalSchedule;
	}
	
	/**
	 * public setter
	 *
     * A notional amount schedule where each notional that applied to a calculation period is calculated with reference to a notional amount or notional amount schedule in a different currency by means of a spot currency exchange rate which is normally observed at the beginning of each period.
     *
     * @param com.leansoft.fpml.nano.FxLinkedNotionalSchedule
	 */
	public void setFxLinkedNotionalSchedule(FxLinkedNotionalSchedule fxLinkedNotionalSchedule) {
	    this.fxLinkedNotionalSchedule = fxLinkedNotionalSchedule;
	}
	/**
     * public getter
     *
     * The fixed rate or fixed rate schedule expressed as explicit fixed rates and dates. In the case of a schedule, the step dates may be subject to adjustment in accordance with any adjustments specified in calculationPeriodDatesAdjustments.
     *
     * @returns com.leansoft.fpml.nano.Schedule
	 */
	public Schedule getFixedRateSchedule() {
	    return this.fixedRateSchedule;
	}
	
	/**
	 * public setter
	 *
     * The fixed rate or fixed rate schedule expressed as explicit fixed rates and dates. In the case of a schedule, the step dates may be subject to adjustment in accordance with any adjustments specified in calculationPeriodDatesAdjustments.
     *
     * @param com.leansoft.fpml.nano.Schedule
	 */
	public void setFixedRateSchedule(Schedule fixedRateSchedule) {
	    this.fixedRateSchedule = fixedRateSchedule;
	}
	/**
     * public getter
     *
     * The day count fraction.
     *
     * @returns com.leansoft.fpml.nano.DayCountFraction
	 */
	public DayCountFraction getDayCountFraction() {
	    return this.dayCountFraction;
	}
	
	/**
	 * public setter
	 *
     * The day count fraction.
     *
     * @param com.leansoft.fpml.nano.DayCountFraction
	 */
	public void setDayCountFraction(DayCountFraction dayCountFraction) {
	    this.dayCountFraction = dayCountFraction;
	}
	/**
     * public getter
     *
     * The parameters specifying any discounting conventions that may apply. This element must only be included if discounting applies.
     *
     * @returns com.leansoft.fpml.nano.Discounting
	 */
	public Discounting getDiscounting() {
	    return this.discounting;
	}
	
	/**
	 * public setter
	 *
     * The parameters specifying any discounting conventions that may apply. This element must only be included if discounting applies.
     *
     * @param com.leansoft.fpml.nano.Discounting
	 */
	public void setDiscounting(Discounting discounting) {
	    this.discounting = discounting;
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

}