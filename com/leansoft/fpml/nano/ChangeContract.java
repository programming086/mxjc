// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * Abstract base class for changes to a Contract.
 */
public abstract class ChangeContract implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private ContractReference contractReference;
	
	@Element
	private Date date;
	
	@Element
	private Date effectiveDate;
	
	@Element
	private Payment payment;
	
    
	/**
     * public getter
     *
     * Identification of the Contract which is subject to change.
     *
     * @returns com.leansoft.fpml.nano.ContractReference
	 */
	public ContractReference getContractReference() {
	    return this.contractReference;
	}
	
	/**
	 * public setter
	 *
     * Identification of the Contract which is subject to change.
     *
     * @param com.leansoft.fpml.nano.ContractReference
	 */
	public void setContractReference(ContractReference contractReference) {
	    this.contractReference = contractReference;
	}
	/**
     * public getter
     *
     * The date on which the the parties enter into the change.
     *
     * @returns java.util.Date
	 */
	public Date getDate() {
	    return this.date;
	}
	
	/**
	 * public setter
	 *
     * The date on which the the parties enter into the change.
     *
     * @param java.util.Date
	 */
	public void setDate(Date date) {
	    this.date = date;
	}
	/**
     * public getter
     *
     * The date on which the change becomes effective.
     *
     * @returns java.util.Date
	 */
	public Date getEffectiveDate() {
	    return this.effectiveDate;
	}
	
	/**
	 * public setter
	 *
     * The date on which the change becomes effective.
     *
     * @param java.util.Date
	 */
	public void setEffectiveDate(Date effectiveDate) {
	    this.effectiveDate = effectiveDate;
	}
	/**
     * public getter
     *
     * Payment for the right to change the Contract.
     *
     * @returns com.leansoft.fpml.nano.Payment
	 */
	public Payment getPayment() {
	    return this.payment;
	}
	
	/**
	 * public setter
	 *
     * Payment for the right to change the Contract.
     *
     * @param com.leansoft.fpml.nano.Payment
	 */
	public void setPayment(Payment payment) {
	    this.payment = payment;
	}

}