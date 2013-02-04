// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type describing the date on which the dividend will be paid/received. This type is also used to specify the date on which the FX rate will be determined, when applicable.
 */
public class DividendPaymentDate implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private DividendDateReferenceEnum dividendDateReference;
	
	@Element
	private Offset paymentDateOffset;
	
	@Element
	private AdjustableDate adjustableDate;
	
    
	/**
     * public getter
     *
     * Specification of the dividend date using an enumeration, with values such as the pay date, the ex date or the record date.
     *
     * @returns com.leansoft.fpml.nano.DividendDateReferenceEnum
	 */
	public DividendDateReferenceEnum getDividendDateReference() {
	    return this.dividendDateReference;
	}
	
	/**
	 * public setter
	 *
     * Specification of the dividend date using an enumeration, with values such as the pay date, the ex date or the record date.
     *
     * @param com.leansoft.fpml.nano.DividendDateReferenceEnum
	 */
	public void setDividendDateReference(DividendDateReferenceEnum dividendDateReference) {
	    this.dividendDateReference = dividendDateReference;
	}
	/**
     * public getter
     *
     * Only to be used when SharePayment has been specified in the dividendDateReference element. The number of Currency Business Days following the day on which the Issuer of the Shares pays the relevant dividend to holders of record of the Shares.
     *
     * @returns com.leansoft.fpml.nano.Offset
	 */
	public Offset getPaymentDateOffset() {
	    return this.paymentDateOffset;
	}
	
	/**
	 * public setter
	 *
     * Only to be used when SharePayment has been specified in the dividendDateReference element. The number of Currency Business Days following the day on which the Issuer of the Shares pays the relevant dividend to holders of record of the Shares.
     *
     * @param com.leansoft.fpml.nano.Offset
	 */
	public void setPaymentDateOffset(Offset paymentDateOffset) {
	    this.paymentDateOffset = paymentDateOffset;
	}
	/**
     * public getter
     *
     * A date that shall be subject to adjustment if it would otherwise fall on a day that is not a business day in the specified business centers, together with the convention for adjusting the date.
     *
     * @returns com.leansoft.fpml.nano.AdjustableDate
	 */
	public AdjustableDate getAdjustableDate() {
	    return this.adjustableDate;
	}
	
	/**
	 * public setter
	 *
     * A date that shall be subject to adjustment if it would otherwise fall on a day that is not a business day in the specified business centers, together with the convention for adjusting the date.
     *
     * @param com.leansoft.fpml.nano.AdjustableDate
	 */
	public void setAdjustableDate(AdjustableDate adjustableDate) {
	    this.adjustableDate = adjustableDate;
	}

}