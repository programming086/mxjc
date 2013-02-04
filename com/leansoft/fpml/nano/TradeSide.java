// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * The parties to the trade form into sides. Each side has defined roles in the lifecyle of the trade fulfilled by parties. Each party role is given in the likely order they would be filled during the lifecycle of a trade.
 */
public class TradeSide implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PartyRole orderer;
	
	@Element
	private PartyRole introducer;
	
	@Element
	private PartyRole executor;
	
	@Element
	private PartyRole confirmer;
	
	@Element
	private PartyRole creditor;
	
	@Element
	private PartyRole calculater;
	
	@Element
	private PartyRole settler;
	
	@Element
	private PartyRole beneficiary;
	
	@Element
	private List<PartyRole> accountant;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The Party placing the order. This could be a fund manager acting on behalf of a client, or a hedge fund acting on it's own behalf. This is the role with the investment discretion.
     *
     * @returns com.leansoft.fpml.nano.PartyRole
	 */
	public PartyRole getOrderer() {
	    return this.orderer;
	}
	
	/**
	 * public setter
	 *
     * The Party placing the order. This could be a fund manager acting on behalf of a client, or a hedge fund acting on it's own behalf. This is the role with the investment discretion.
     *
     * @param com.leansoft.fpml.nano.PartyRole
	 */
	public void setOrderer(PartyRole orderer) {
	    this.orderer = orderer;
	}
	/**
     * public getter
     *
     * Party that can relay an order directly to the trading floor at a firm. This is potentially a different firm, but may be the same as that taking the order. In effect the introducer is the first dealer to take the order. The reason an introducing dealer may forward a trade is sometime because it doesn't have the capacity to execute effectively but does have the relationship with the Orderer. Introducing Party is an industry standard term. This is semantically equivalent to the FIX and ISO20022 Introducing Firm.
     *
     * @returns com.leansoft.fpml.nano.PartyRole
	 */
	public PartyRole getIntroducer() {
	    return this.introducer;
	}
	
	/**
	 * public setter
	 *
     * Party that can relay an order directly to the trading floor at a firm. This is potentially a different firm, but may be the same as that taking the order. In effect the introducer is the first dealer to take the order. The reason an introducing dealer may forward a trade is sometime because it doesn't have the capacity to execute effectively but does have the relationship with the Orderer. Introducing Party is an industry standard term. This is semantically equivalent to the FIX and ISO20022 Introducing Firm.
     *
     * @param com.leansoft.fpml.nano.PartyRole
	 */
	public void setIntroducer(PartyRole introducer) {
	    this.introducer = introducer;
	}
	/**
     * public getter
     *
     * The Party executing or striking the trade. Executing Party is an industry standard term. This is semantically equivalent to the FIX and ISO20022 Executing Firm or Trader.
     *
     * @returns com.leansoft.fpml.nano.PartyRole
	 */
	public PartyRole getExecutor() {
	    return this.executor;
	}
	
	/**
	 * public setter
	 *
     * The Party executing or striking the trade. Executing Party is an industry standard term. This is semantically equivalent to the FIX and ISO20022 Executing Firm or Trader.
     *
     * @param com.leansoft.fpml.nano.PartyRole
	 */
	public void setExecutor(PartyRole executor) {
	    this.executor = executor;
	}
	/**
     * public getter
     *
     * The party that undertakes the confirmation process for this Trade Side. The confirmer essentially manages the matching and affirmation of trades. This is often the creditor or is increasingly outsourced to service providers such as Swapswire.
     *
     * @returns com.leansoft.fpml.nano.PartyRole
	 */
	public PartyRole getConfirmer() {
	    return this.confirmer;
	}
	
	/**
	 * public setter
	 *
     * The party that undertakes the confirmation process for this Trade Side. The confirmer essentially manages the matching and affirmation of trades. This is often the creditor or is increasingly outsourced to service providers such as Swapswire.
     *
     * @param com.leansoft.fpml.nano.PartyRole
	 */
	public void setConfirmer(PartyRole confirmer) {
	    this.confirmer = confirmer;
	}
	/**
     * public getter
     *
     * The party whose name appears on the contract as being responsible for credit of the trade. This is the party in the Trade Side the credit risk is against. For example if a hedge fund was to trade in the name of it's prime broker, then the prime broker would be the creditor.
     *
     * @returns com.leansoft.fpml.nano.PartyRole
	 */
	public PartyRole getCreditor() {
	    return this.creditor;
	}
	
	/**
	 * public setter
	 *
     * The party whose name appears on the contract as being responsible for credit of the trade. This is the party in the Trade Side the credit risk is against. For example if a hedge fund was to trade in the name of it's prime broker, then the prime broker would be the creditor.
     *
     * @param com.leansoft.fpml.nano.PartyRole
	 */
	public void setCreditor(PartyRole creditor) {
	    this.creditor = creditor;
	}
	/**
     * public getter
     *
     * The calculater is the Party that calculates, negotiates, and agrees the values to be paid at each payment date.
     *
     * @returns com.leansoft.fpml.nano.PartyRole
	 */
	public PartyRole getCalculater() {
	    return this.calculater;
	}
	
	/**
	 * public setter
	 *
     * The calculater is the Party that calculates, negotiates, and agrees the values to be paid at each payment date.
     *
     * @param com.leansoft.fpml.nano.PartyRole
	 */
	public void setCalculater(PartyRole calculater) {
	    this.calculater = calculater;
	}
	/**
     * public getter
     *
     * The Settler is the party that makes the payments. Increasingly this is a service that can be externalized from the other roles. An example of a settlement service provide is SwapClear.
     *
     * @returns com.leansoft.fpml.nano.PartyRole
	 */
	public PartyRole getSettler() {
	    return this.settler;
	}
	
	/**
	 * public setter
	 *
     * The Settler is the party that makes the payments. Increasingly this is a service that can be externalized from the other roles. An example of a settlement service provide is SwapClear.
     *
     * @param com.leansoft.fpml.nano.PartyRole
	 */
	public void setSettler(PartyRole settler) {
	    this.settler = settler;
	}
	/**
     * public getter
     *
     * The party that suffers the economic effect of the trade. This is usually referred to as the primary Principal in FIX and ISO20022 - which is slightly confusing in that there are potentially many Princiapal/Agency relationships. The beneficiary may be distinct from the creditor - an example is a Hedge Fund trading in the name of it's Prime Broker.
     *
     * @returns com.leansoft.fpml.nano.PartyRole
	 */
	public PartyRole getBeneficiary() {
	    return this.beneficiary;
	}
	
	/**
	 * public setter
	 *
     * The party that suffers the economic effect of the trade. This is usually referred to as the primary Principal in FIX and ISO20022 - which is slightly confusing in that there are potentially many Princiapal/Agency relationships. The beneficiary may be distinct from the creditor - an example is a Hedge Fund trading in the name of it's Prime Broker.
     *
     * @param com.leansoft.fpml.nano.PartyRole
	 */
	public void setBeneficiary(PartyRole beneficiary) {
	    this.beneficiary = beneficiary;
	}
	/**
     * public getter
     *
     * The Accountants for the trade. There are potentially many accountants. This is known in FIX and ISO20022 for Collective Investment Vehicles as the Third Party Administrator (TPA), however all trades for all parties have at least one party accounting for the trade.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PartyRole>
	 */
	public List<PartyRole> getAccountant() {
	    return this.accountant;
	}
	
	/**
	 * public setter
	 *
     * The Accountants for the trade. There are potentially many accountants. This is known in FIX and ISO20022 for Collective Investment Vehicles as the Third Party Administrator (TPA), however all trades for all parties have at least one party accounting for the trade.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PartyRole>
	 */
	public void setAccountant(List<PartyRole> accountant) {
	    this.accountant = accountant;
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