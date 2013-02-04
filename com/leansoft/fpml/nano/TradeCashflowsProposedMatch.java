// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * "Other side's" cashflow that meets the minimimum matching criteria and is proposed as match to the cash flow that is being asserted.
 */
public class TradeCashflowsProposedMatch implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private TradeCashflowsId tradeCashflowsId;
	
	@Element
	private TradeIdentifyingItems tradeIdentifyingItems;
	
	@Element
	private Date adjustedPaymentDate;
	
	@Element
	private List<PaymentMatching> payment;
	
	@Element
	private MatchId matchId;
	
	@Element
	private List<TradeDifference> difference;
	
    
	/**
     * public getter
     *
     * Unique identifier assigned by either party to a set of cashflows.
     *
     * @returns com.leansoft.fpml.nano.TradeCashflowsId
	 */
	public TradeCashflowsId getTradeCashflowsId() {
	    return this.tradeCashflowsId;
	}
	
	/**
	 * public setter
	 *
     * Unique identifier assigned by either party to a set of cashflows.
     *
     * @param com.leansoft.fpml.nano.TradeCashflowsId
	 */
	public void setTradeCashflowsId(TradeCashflowsId tradeCashflowsId) {
	    this.tradeCashflowsId = tradeCashflowsId;
	}
	/**
     * public getter
     *
     * Structure that holds reference to the trade through the tradeId and optionally some trade-specific elements for identifying the trade in the case of trades that have not been negotiated through electronic platforms and for which the counterparty's trade ID has not been captured.
     *
     * @returns com.leansoft.fpml.nano.TradeIdentifyingItems
	 */
	public TradeIdentifyingItems getTradeIdentifyingItems() {
	    return this.tradeIdentifyingItems;
	}
	
	/**
	 * public setter
	 *
     * Structure that holds reference to the trade through the tradeId and optionally some trade-specific elements for identifying the trade in the case of trades that have not been negotiated through electronic platforms and for which the counterparty's trade ID has not been captured.
     *
     * @param com.leansoft.fpml.nano.TradeIdentifyingItems
	 */
	public void setTradeIdentifyingItems(TradeIdentifyingItems tradeIdentifyingItems) {
	    this.tradeIdentifyingItems = tradeIdentifyingItems;
	}
	/**
     * public getter
     *
     * The adjusted date in which the payments are being paid/received.
     *
     * @returns java.util.Date
	 */
	public Date getAdjustedPaymentDate() {
	    return this.adjustedPaymentDate;
	}
	
	/**
	 * public setter
	 *
     * The adjusted date in which the payments are being paid/received.
     *
     * @param java.util.Date
	 */
	public void setAdjustedPaymentDate(Date adjustedPaymentDate) {
	    this.adjustedPaymentDate = adjustedPaymentDate;
	}
	/**
     * public getter
     *
     * Specifies the payment that is exposed to the matching process. Usually there will be a single payment but for cross-currency swaps a different payment per currency shall be provided.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PaymentMatching>
	 */
	public List<PaymentMatching> getPayment() {
	    return this.payment;
	}
	
	/**
	 * public setter
	 *
     * Specifies the payment that is exposed to the matching process. Usually there will be a single payment but for cross-currency swaps a different payment per currency shall be provided.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PaymentMatching>
	 */
	public void setPayment(List<PaymentMatching> payment) {
	    this.payment = payment;
	}
	/**
     * public getter
     *
     * A unique identifier assigned by the matching service to each set of matched cashflows.
     *
     * @returns com.leansoft.fpml.nano.MatchId
	 */
	public MatchId getMatchId() {
	    return this.matchId;
	}
	
	/**
	 * public setter
	 *
     * A unique identifier assigned by the matching service to each set of matched cashflows.
     *
     * @param com.leansoft.fpml.nano.MatchId
	 */
	public void setMatchId(MatchId matchId) {
	    this.matchId = matchId;
	}
	/**
     * public getter
     *
     * A type used to record the details of a difference between two sides of a payment.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.TradeDifference>
	 */
	public List<TradeDifference> getDifference() {
	    return this.difference;
	}
	
	/**
	 * public setter
	 *
     * A type used to record the details of a difference between two sides of a payment.
     *
     * @param java.util.List<com.leansoft.fpml.nano.TradeDifference>
	 */
	public void setDifference(List<TradeDifference> difference) {
	    this.difference = difference;
	}

}