// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * The period for accrual fee caculation where fee rate and underlying position amount (commitment, utilization or unutilized) is constant
 */
public class FeeAccrualPeriod implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Date startDate;
	
	@Element
	private Date endDate;
	
	@Element
	private ParticipationAmount accrualAmount;
	
    
	/**
     * public getter
     *
     * Date on which this period begins.
     *
     * @returns java.util.Date
	 */
	public Date getStartDate() {
	    return this.startDate;
	}
	
	/**
	 * public setter
	 *
     * Date on which this period begins.
     *
     * @param java.util.Date
	 */
	public void setStartDate(Date startDate) {
	    this.startDate = startDate;
	}
	/**
     * public getter
     *
     * Date on which this period ends.
     *
     * @returns java.util.Date
	 */
	public Date getEndDate() {
	    return this.endDate;
	}
	
	/**
	 * public setter
	 *
     * Date on which this period ends.
     *
     * @param java.util.Date
	 */
	public void setEndDate(Date endDate) {
	    this.endDate = endDate;
	}
	/**
     * public getter
     *
     * >Global and lender share accrued fee amount.
     *
     * @returns com.leansoft.fpml.nano.ParticipationAmount
	 */
	public ParticipationAmount getAccrualAmount() {
	    return this.accrualAmount;
	}
	
	/**
	 * public setter
	 *
     * >Global and lender share accrued fee amount.
     *
     * @param com.leansoft.fpml.nano.ParticipationAmount
	 */
	public void setAccrualAmount(ParticipationAmount accrualAmount) {
	    this.accrualAmount = accrualAmount;
	}

}