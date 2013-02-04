// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * Represent a change in Contract Size
 */
public class ChangeContractSize extends ChangeContract implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Money changeInNotionalAmount;
	
	@Element
	private Money outstandingNotionalAmount;
	
	@Element
	private BigDecimal changeInNumberOfOptions;
	
	@Element
	private BigDecimal outstandingNumberOfOptions;
	
	@Element
	private BigDecimal changeInNumberOfUnits;
	
	@Element
	private BigDecimal outstandingNumberOfUnits;
	
    
	/**
     * public getter
     *
     * Specifies the fixed amount by which the Notional Amount changes
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getChangeInNotionalAmount() {
	    return this.changeInNotionalAmount;
	}
	
	/**
	 * public setter
	 *
     * Specifies the fixed amount by which the Notional Amount changes
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setChangeInNotionalAmount(Money changeInNotionalAmount) {
	    this.changeInNotionalAmount = changeInNotionalAmount;
	}
	/**
     * public getter
     *
     * Specifies the Notional amount after the Change
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getOutstandingNotionalAmount() {
	    return this.outstandingNotionalAmount;
	}
	
	/**
	 * public setter
	 *
     * Specifies the Notional amount after the Change
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setOutstandingNotionalAmount(Money outstandingNotionalAmount) {
	    this.outstandingNotionalAmount = outstandingNotionalAmount;
	}
	/**
     * public getter
     *
     * Specifies the fixed amount by which the Number of Options changes
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getChangeInNumberOfOptions() {
	    return this.changeInNumberOfOptions;
	}
	
	/**
	 * public setter
	 *
     * Specifies the fixed amount by which the Number of Options changes
     *
     * @param java.math.BigDecimal
	 */
	public void setChangeInNumberOfOptions(BigDecimal changeInNumberOfOptions) {
	    this.changeInNumberOfOptions = changeInNumberOfOptions;
	}
	/**
     * public getter
     *
     * Specifies the Number of Options after the Change.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getOutstandingNumberOfOptions() {
	    return this.outstandingNumberOfOptions;
	}
	
	/**
	 * public setter
	 *
     * Specifies the Number of Options after the Change.
     *
     * @param java.math.BigDecimal
	 */
	public void setOutstandingNumberOfOptions(BigDecimal outstandingNumberOfOptions) {
	    this.outstandingNumberOfOptions = outstandingNumberOfOptions;
	}
	/**
     * public getter
     *
     * Specifies the fixed amount by which the Number of Units changes
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getChangeInNumberOfUnits() {
	    return this.changeInNumberOfUnits;
	}
	
	/**
	 * public setter
	 *
     * Specifies the fixed amount by which the Number of Units changes
     *
     * @param java.math.BigDecimal
	 */
	public void setChangeInNumberOfUnits(BigDecimal changeInNumberOfUnits) {
	    this.changeInNumberOfUnits = changeInNumberOfUnits;
	}
	/**
     * public getter
     *
     * Specifies the Number of Units
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getOutstandingNumberOfUnits() {
	    return this.outstandingNumberOfUnits;
	}
	
	/**
	 * public setter
	 *
     * Specifies the Number of Units
     *
     * @param java.math.BigDecimal
	 */
	public void setOutstandingNumberOfUnits(BigDecimal outstandingNumberOfUnits) {
	    this.outstandingNumberOfUnits = outstandingNumberOfUnits;
	}

}