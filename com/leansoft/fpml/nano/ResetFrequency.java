// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type defining the reset frequency. In the case of a weekly reset, also specifies the day of the week that the reset occurs. If the reset frequency is greater than the calculation period frequency the this implies that more or more reset dates is established for each calculation period and some form of rate averaginhg is applicable. The specific averaging method of calculation is specified in FloatingRateCalculation.
 */
public class ResetFrequency extends Interval implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private WeeklyRollConventionEnum weeklyRollConvention;
	
    
	/**
     * public getter
     *
     * The day of the week on which a weekly reset date occurs. This element must be included if the reset frequency is defined as weekly and not otherwise.
     *
     * @returns com.leansoft.fpml.nano.WeeklyRollConventionEnum
	 */
	public WeeklyRollConventionEnum getWeeklyRollConvention() {
	    return this.weeklyRollConvention;
	}
	
	/**
	 * public setter
	 *
     * The day of the week on which a weekly reset date occurs. This element must be included if the reset frequency is defined as weekly and not otherwise.
     *
     * @param com.leansoft.fpml.nano.WeeklyRollConventionEnum
	 */
	public void setWeeklyRollConvention(WeeklyRollConventionEnum weeklyRollConvention) {
	    this.weeklyRollConvention = weeklyRollConvention;
	}

}