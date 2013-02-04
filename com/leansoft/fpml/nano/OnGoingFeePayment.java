// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * The details of a payment made by the borrower to the agent bank related to a given onGoing facilty fee.
 */
public class OnGoingFeePayment implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private OnGoingFeeTypeEnum feeType;
	
	@Element
	private Date startDate;
	
	@Element
	private Date endDate;
	
	@Element
	private DayCountFraction feeDayBasis;
	
	@Element
	private Date paymentDate;
	
	@Element
	private ParticipationAmount amount;
	
    
	/**
     * public getter
     *
     * Type of the fee
     *
     * @returns com.leansoft.fpml.nano.OnGoingFeeTypeEnum
	 */
	public OnGoingFeeTypeEnum getFeeType() {
	    return this.feeType;
	}
	
	/**
	 * public setter
	 *
     * Type of the fee
     *
     * @param com.leansoft.fpml.nano.OnGoingFeeTypeEnum
	 */
	public void setFeeType(OnGoingFeeTypeEnum feeType) {
	    this.feeType = feeType;
	}
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
     * The day count basis for the fee calculation period.
     *
     * @returns com.leansoft.fpml.nano.DayCountFraction
	 */
	public DayCountFraction getFeeDayBasis() {
	    return this.feeDayBasis;
	}
	
	/**
	 * public setter
	 *
     * The day count basis for the fee calculation period.
     *
     * @param com.leansoft.fpml.nano.DayCountFraction
	 */
	public void setFeeDayBasis(DayCountFraction feeDayBasis) {
	    this.feeDayBasis = feeDayBasis;
	}
	/**
     * public getter
     *
     * The day on which the fee is payed by the borrower to the agent bank.
     *
     * @returns java.util.Date
	 */
	public Date getPaymentDate() {
	    return this.paymentDate;
	}
	
	/**
	 * public setter
	 *
     * The day on which the fee is payed by the borrower to the agent bank.
     *
     * @param java.util.Date
	 */
	public void setPaymentDate(Date paymentDate) {
	    this.paymentDate = paymentDate;
	}
	/**
     * public getter
     *
     * The fee amount payed by the borrower to the agent bank.
     *
     * @returns com.leansoft.fpml.nano.ParticipationAmount
	 */
	public ParticipationAmount getAmount() {
	    return this.amount;
	}
	
	/**
	 * public setter
	 *
     * The fee amount payed by the borrower to the agent bank.
     *
     * @param com.leansoft.fpml.nano.ParticipationAmount
	 */
	public void setAmount(ParticipationAmount amount) {
	    this.amount = amount;
	}

}