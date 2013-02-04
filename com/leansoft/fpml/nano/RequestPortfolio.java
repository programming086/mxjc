// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type defining the content model for a message requesting a portfolio (for reconciliation purposes).
 */
@RootElement(name = "requestPortfolio", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class RequestPortfolio extends RequestMessage implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Object asOfDate;
	
	@Element
	private String portfolioName;
	
	@Element
	private RequestedPositions requestedPositions;
	
	@Element
	private List<Party> party;
	
    
	/**
     * public getter
     *
     * The date for which this request desires positions and valuations.
     *
     * @returns java.lang.Object
	 */
	public Object getAsOfDate() {
	    return this.asOfDate;
	}
	
	/**
	 * public setter
	 *
     * The date for which this request desires positions and valuations.
     *
     * @param java.lang.Object
	 */
	public void setAsOfDate(Object asOfDate) {
	    this.asOfDate = asOfDate;
	}
	/**
     * public getter
     *
     * The name of the portfolio that is requested.
     *
     * @returns java.lang.String
	 */
	public String getPortfolioName() {
	    return this.portfolioName;
	}
	
	/**
	 * public setter
	 *
     * The name of the portfolio that is requested.
     *
     * @param java.lang.String
	 */
	public void setPortfolioName(String portfolioName) {
	    this.portfolioName = portfolioName;
	}
	/**
     * public getter
     *
     * The name of the data set (portfolio, product type, etc.) that this request corresponds to. Describes the desired report.
     *
     * @returns com.leansoft.fpml.nano.RequestedPositions
	 */
	public RequestedPositions getRequestedPositions() {
	    return this.requestedPositions;
	}
	
	/**
	 * public setter
	 *
     * The name of the data set (portfolio, product type, etc.) that this request corresponds to. Describes the desired report.
     *
     * @param com.leansoft.fpml.nano.RequestedPositions
	 */
	public void setRequestedPositions(RequestedPositions requestedPositions) {
	    this.requestedPositions = requestedPositions;
	}
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

}