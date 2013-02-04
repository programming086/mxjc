// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

@RootElement(name = "positionsAcknowledged", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class PositionsAcknowledged extends ResponseMessage implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PortfolioDefinition portfolio;
	
	@Element
	private List<Party> party;
	
    
	/**
     * public getter
     *
     * Contains the portfolio definition.
     *
     * @returns com.leansoft.fpml.nano.PortfolioDefinition
	 */
	public PortfolioDefinition getPortfolio() {
	    return this.portfolio;
	}
	
	/**
	 * public setter
	 *
     * Contains the portfolio definition.
     *
     * @param com.leansoft.fpml.nano.PortfolioDefinition
	 */
	public void setPortfolio(PortfolioDefinition portfolio) {
	    this.portfolio = portfolio;
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