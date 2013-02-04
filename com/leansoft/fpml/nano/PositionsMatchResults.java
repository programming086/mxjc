// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * Reports the results of the portfolio reconciliation operation. It states the matching results for multiple positions, supporting the match, mismatched, unmatched and alleged position results.
 */
@RootElement(name = "positionsMatchResults", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class PositionsMatchResults extends ResponseMessage implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PortfolioDefinition portfolio;
	
	@Element
	private List<PositionMatchResult> positionMatchResult;
	
	@Element
	private boolean matchCompleted;
	
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
     * @returns java.util.List<com.leansoft.fpml.nano.PositionMatchResult>
	 */
	public List<PositionMatchResult> getPositionMatchResult() {
	    return this.positionMatchResult;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<com.leansoft.fpml.nano.PositionMatchResult>
	 */
	public void setPositionMatchResult(List<PositionMatchResult> positionMatchResult) {
	    this.positionMatchResult = positionMatchResult;
	}
	/**
     * public getter
     *
     * Flag indicating whether the Matching Service has finished sending all matching results.
     *
     * @returns .boolean
	 */
	public boolean getMatchCompleted() {
	    return this.matchCompleted;
	}
	
	/**
	 * public setter
	 *
     * Flag indicating whether the Matching Service has finished sending all matching results.
     *
     * @param .boolean
	 */
	public void setMatchCompleted(boolean matchCompleted) {
	    this.matchCompleted = matchCompleted;
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