// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * A type for defining the strike price for an equity option. The strike price is either: (i) in respect of an index option transaction, the level of the relevant index specified or otherwise determined in the transaction; or (ii) in respect of a share option transaction, the price per share specified or otherwise determined in the transaction. This can be expressed either as a percentage of notional amount or as an absolute value.
 */
public class EquityStrike implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigDecimal strikePrice;
	
	@Element
	private BigDecimal strikePercentage;
	
	@Element
	private AdjustableOrRelativeDate strikeDeterminationDate;
	
	@Element
	private Currency currency;
	
    
	/**
     * public getter
     *
     * The price or level at which the option has been struck.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getStrikePrice() {
	    return this.strikePrice;
	}
	
	/**
	 * public setter
	 *
     * The price or level at which the option has been struck.
     *
     * @param java.math.BigDecimal
	 */
	public void setStrikePrice(BigDecimal strikePrice) {
	    this.strikePrice = strikePrice;
	}
	/**
     * public getter
     *
     * The price or level expressed as a percentage of the forward starting spot price.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getStrikePercentage() {
	    return this.strikePercentage;
	}
	
	/**
	 * public setter
	 *
     * The price or level expressed as a percentage of the forward starting spot price.
     *
     * @param java.math.BigDecimal
	 */
	public void setStrikePercentage(BigDecimal strikePercentage) {
	    this.strikePercentage = strikePercentage;
	}
	/**
     * public getter
     *
     * The date on which the strike is determined, where this is not the effective date of a forward starting option.
     *
     * @returns com.leansoft.fpml.nano.AdjustableOrRelativeDate
	 */
	public AdjustableOrRelativeDate getStrikeDeterminationDate() {
	    return this.strikeDeterminationDate;
	}
	
	/**
	 * public setter
	 *
     * The date on which the strike is determined, where this is not the effective date of a forward starting option.
     *
     * @param com.leansoft.fpml.nano.AdjustableOrRelativeDate
	 */
	public void setStrikeDeterminationDate(AdjustableOrRelativeDate strikeDeterminationDate) {
	    this.strikeDeterminationDate = strikeDeterminationDate;
	}
	/**
     * public getter
     *
     * The currency in which an amount is denominated.
     *
     * @returns com.leansoft.fpml.nano.Currency
	 */
	public Currency getCurrency() {
	    return this.currency;
	}
	
	/**
	 * public setter
	 *
     * The currency in which an amount is denominated.
     *
     * @param com.leansoft.fpml.nano.Currency
	 */
	public void setCurrency(Currency currency) {
	    this.currency = currency;
	}

}