// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * This defines the time interval to the start of the exercise period, i.e. the earliest exercise date, and the frequency of subsequent exercise dates (if any).
 */
@RootElement(name = "optionalEarlyTerminationParameters", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class ExercisePeriod implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Interval earliestExerciseDateTenor;
	
	@Element
	private Interval exerciseFrequency;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The time interval to the first (and possibly only) exercise date in the exercise period.
     *
     * @returns com.leansoft.fpml.nano.Interval
	 */
	public Interval getEarliestExerciseDateTenor() {
	    return this.earliestExerciseDateTenor;
	}
	
	/**
	 * public setter
	 *
     * The time interval to the first (and possibly only) exercise date in the exercise period.
     *
     * @param com.leansoft.fpml.nano.Interval
	 */
	public void setEarliestExerciseDateTenor(Interval earliestExerciseDateTenor) {
	    this.earliestExerciseDateTenor = earliestExerciseDateTenor;
	}
	/**
     * public getter
     *
     * The frequency of subsequent exercise dates in the exercise period following the earliest exercise date. An interval of 1 day should be used to indicate an American style exercise period.
     *
     * @returns com.leansoft.fpml.nano.Interval
	 */
	public Interval getExerciseFrequency() {
	    return this.exerciseFrequency;
	}
	
	/**
	 * public setter
	 *
     * The frequency of subsequent exercise dates in the exercise period following the earliest exercise date. An interval of 1 day should be used to indicate an American style exercise period.
     *
     * @param com.leansoft.fpml.nano.Interval
	 */
	public void setExerciseFrequency(Interval exerciseFrequency) {
	    this.exerciseFrequency = exerciseFrequency;
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