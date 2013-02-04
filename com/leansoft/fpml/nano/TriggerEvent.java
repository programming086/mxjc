// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * Observation point for trigger
 */
public class TriggerEvent implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<AveragingSchedule> schedule;
	
	@Element
	private DateList triggerDates;
	
	@Element
	private Trigger trigger;
	
	@Element
	private FeaturePayment featurePayment;
	
    
	/**
     * public getter
     *
     * A Equity Derivative schedule.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.AveragingSchedule>
	 */
	public List<AveragingSchedule> getSchedule() {
	    return this.schedule;
	}
	
	/**
	 * public setter
	 *
     * A Equity Derivative schedule.
     *
     * @param java.util.List<com.leansoft.fpml.nano.AveragingSchedule>
	 */
	public void setSchedule(List<AveragingSchedule> schedule) {
	    this.schedule = schedule;
	}
	/**
     * public getter
     *
     * The trigger Dates
     *
     * @returns com.leansoft.fpml.nano.DateList
	 */
	public DateList getTriggerDates() {
	    return this.triggerDates;
	}
	
	/**
	 * public setter
	 *
     * The trigger Dates
     *
     * @param com.leansoft.fpml.nano.DateList
	 */
	public void setTriggerDates(DateList triggerDates) {
	    this.triggerDates = triggerDates;
	}
	/**
     * public getter
     *
     * The trigger level.
     *
     * @returns com.leansoft.fpml.nano.Trigger
	 */
	public Trigger getTrigger() {
	    return this.trigger;
	}
	
	/**
	 * public setter
	 *
     * The trigger level.
     *
     * @param com.leansoft.fpml.nano.Trigger
	 */
	public void setTrigger(Trigger trigger) {
	    this.trigger = trigger;
	}
	/**
     * public getter
     *
     * The feature payment.
     *
     * @returns com.leansoft.fpml.nano.FeaturePayment
	 */
	public FeaturePayment getFeaturePayment() {
	    return this.featurePayment;
	}
	
	/**
	 * public setter
	 *
     * The feature payment.
     *
     * @param com.leansoft.fpml.nano.FeaturePayment
	 */
	public void setFeaturePayment(FeaturePayment featurePayment) {
	    this.featurePayment = featurePayment;
	}

}