// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type defining the content model for a message normally generated in response to a RequestValuationReport request.
 */
@RootElement(name = "valuationReport", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class ValuationReport extends NotificationMessage implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<Party> party;
	
	@Element
	private Market market;
	
	@Element
	private List<PortfolioValuationItem> portfolioValuationItem;
	
	@Element
	private List<TradeValuationItem> tradeValuationItem;
	
    
	/**
	 * public getter
	 *
     * @returns java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public List<Party> getParty() {
	    return this.party;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public void setParty(List<Party> party) {
	    this.party = party;
	}
	/**
     * public getter
     *
     * This is a global element used for creating global types. It holds Market information, e.g. curves, surfaces, quotes, etc.
     *
     * @returns com.leansoft.fpml.nano.Market
	 */
	public Market getMarket() {
	    return this.market;
	}
	
	/**
	 * public setter
	 *
     * This is a global element used for creating global types. It holds Market information, e.g. curves, surfaces, quotes, etc.
     *
     * @param com.leansoft.fpml.nano.Market
	 */
	public void setMarket(Market market) {
	    this.market = market;
	}
	/**
     * public getter
     *
     * An instance of a unique portfolio valuation.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PortfolioValuationItem>
	 */
	public List<PortfolioValuationItem> getPortfolioValuationItem() {
	    return this.portfolioValuationItem;
	}
	
	/**
	 * public setter
	 *
     * An instance of a unique portfolio valuation.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PortfolioValuationItem>
	 */
	public void setPortfolioValuationItem(List<PortfolioValuationItem> portfolioValuationItem) {
	    this.portfolioValuationItem = portfolioValuationItem;
	}
	/**
     * public getter
     *
     * A collection of data values describing the state of the given trade.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.TradeValuationItem>
	 */
	public List<TradeValuationItem> getTradeValuationItem() {
	    return this.tradeValuationItem;
	}
	
	/**
	 * public setter
	 *
     * A collection of data values describing the state of the given trade.
     *
     * @param java.util.List<com.leansoft.fpml.nano.TradeValuationItem>
	 */
	public void setTradeValuationItem(List<TradeValuationItem> tradeValuationItem) {
	    this.tradeValuationItem = tradeValuationItem;
	}

}