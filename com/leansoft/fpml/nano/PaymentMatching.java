// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A global type describing the payment exposed to the matching process, along with its gross component(s) and calculation details.
 */
public class PaymentMatching implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PaymentId identifier;
	
	@Element
	private PartyOrAccountReference payerPartyReference;
	
	@Element
	private PartyOrAccountReference receiverPartyReference;
	
	@Element
	private Money paymentAmount;
	
	@Element
	private List<CalculationDetails> calculationDetails;
	
    
	/**
     * public getter
     *
     * Unique identifier assigned by either party or matching service, as agreed, to a payment.
     *
     * @returns com.leansoft.fpml.nano.PaymentId
	 */
	public PaymentId getIdentifier() {
	    return this.identifier;
	}
	
	/**
	 * public setter
	 *
     * Unique identifier assigned by either party or matching service, as agreed, to a payment.
     *
     * @param com.leansoft.fpml.nano.PaymentId
	 */
	public void setIdentifier(PaymentId identifier) {
	    this.identifier = identifier;
	}
	/**
     * public getter
     *
     * A reference to the party responsible for making the payments defined by this structure.
     *
     * @returns com.leansoft.fpml.nano.PartyOrAccountReference
	 */
	public PartyOrAccountReference getPayerPartyReference() {
	    return this.payerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party responsible for making the payments defined by this structure.
     *
     * @param com.leansoft.fpml.nano.PartyOrAccountReference
	 */
	public void setPayerPartyReference(PartyOrAccountReference payerPartyReference) {
	    this.payerPartyReference = payerPartyReference;
	}
	/**
     * public getter
     *
     * A reference to the party that receives the payments corresponding to this structure.
     *
     * @returns com.leansoft.fpml.nano.PartyOrAccountReference
	 */
	public PartyOrAccountReference getReceiverPartyReference() {
	    return this.receiverPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party that receives the payments corresponding to this structure.
     *
     * @param com.leansoft.fpml.nano.PartyOrAccountReference
	 */
	public void setReceiverPartyReference(PartyOrAccountReference receiverPartyReference) {
	    this.receiverPartyReference = receiverPartyReference;
	}
	/**
     * public getter
     *
     * Payment amount in a given currency to be paid/received.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getPaymentAmount() {
	    return this.paymentAmount;
	}
	
	/**
	 * public setter
	 *
     * Payment amount in a given currency to be paid/received.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setPaymentAmount(Money paymentAmount) {
	    this.paymentAmount = paymentAmount;
	}
	/**
     * public getter
     *
     * The set of cash flow components with calculations that comprise this payment.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.CalculationDetails>
	 */
	public List<CalculationDetails> getCalculationDetails() {
	    return this.calculationDetails;
	}
	
	/**
	 * public setter
	 *
     * The set of cash flow components with calculations that comprise this payment.
     *
     * @param java.util.List<com.leansoft.fpml.nano.CalculationDetails>
	 */
	public void setCalculationDetails(List<CalculationDetails> calculationDetails) {
	    this.calculationDetails = calculationDetails;
	}

}