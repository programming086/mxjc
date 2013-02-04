// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * A type that specifies the source for and timing of a fixing of an exchange rate. This is used in the agreement of non-deliverable forward trades as well as various types of FX OTC options that require observations against a particular rate.
 */
public class FxFixing extends FxSpotRateSource implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private QuotedCurrencyPair quotedCurrencyPair;
	
	@Element
	private Date fixingDate;
	
    
	/**
     * public getter
     *
     * Defines the two currencies for an FX trade and the quotation relationship between the two currencies.
     *
     * @returns com.leansoft.fpml.nano.QuotedCurrencyPair
	 */
	public QuotedCurrencyPair getQuotedCurrencyPair() {
	    return this.quotedCurrencyPair;
	}
	
	/**
	 * public setter
	 *
     * Defines the two currencies for an FX trade and the quotation relationship between the two currencies.
     *
     * @param com.leansoft.fpml.nano.QuotedCurrencyPair
	 */
	public void setQuotedCurrencyPair(QuotedCurrencyPair quotedCurrencyPair) {
	    this.quotedCurrencyPair = quotedCurrencyPair;
	}
	/**
     * public getter
     *
     * Describes the specific date when a non-deliverable forward or non-deliverable option will "fix" against a particular rate, which will be used to compute the ultimate cash settlement.
     *
     * @returns java.util.Date
	 */
	public Date getFixingDate() {
	    return this.fixingDate;
	}
	
	/**
	 * public setter
	 *
     * Describes the specific date when a non-deliverable forward or non-deliverable option will "fix" against a particular rate, which will be used to compute the ultimate cash settlement.
     *
     * @param java.util.Date
	 */
	public void setFixingDate(Date fixingDate) {
	    this.fixingDate = fixingDate;
	}

}