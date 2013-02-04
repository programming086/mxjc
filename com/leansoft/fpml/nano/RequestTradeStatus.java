// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type defining the content model for a message allowing one party to query the status of one or many trades previously sent to another party.
 */
@RootElement(name = "requestTradeStatus", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class RequestTradeStatus extends RequestMessage implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<TradeIdentifier> tradeIdentifier;
	
	@Element
	private List<Party> party;
	
    
	/**
     * public getter
     *
     * An instance of a unique trade identifier.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.TradeIdentifier>
	 */
	public List<TradeIdentifier> getTradeIdentifier() {
	    return this.tradeIdentifier;
	}
	
	/**
	 * public setter
	 *
     * An instance of a unique trade identifier.
     *
     * @param java.util.List<com.leansoft.fpml.nano.TradeIdentifier>
	 */
	public void setTradeIdentifier(List<TradeIdentifier> tradeIdentifier) {
	    this.tradeIdentifier = tradeIdentifier;
	}
	/**
     * public getter
     *
     * Parties can perform multiple roles in a trade lifecycle. For example, the principal parties obligated to make payments from time to time during the term of the trade, but may include other parties involved in, or incidental to, the trade, such as parties acting in the role of novation transferor/transferee, broker, calculation agent, etc. In FpML roles are defined in multiple places within a document.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public List<Party> getParty() {
	    return this.party;
	}
	
	/**
	 * public setter
	 *
     * Parties can perform multiple roles in a trade lifecycle. For example, the principal parties obligated to make payments from time to time during the term of the trade, but may include other parties involved in, or incidental to, the trade, such as parties acting in the role of novation transferor/transferee, broker, calculation agent, etc. In FpML roles are defined in multiple places within a document.
     *
     * @param java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public void setParty(List<Party> party) {
	    this.party = party;
	}

}