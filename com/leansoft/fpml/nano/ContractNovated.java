// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * Notification that a Contract has been Novated
 */
@RootElement(name = "contractNovated", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class ContractNovated extends NotificationMessage implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private ContractNovation novation;
	
	@Element
	private List<Party> party;
	
    
	/**
     * public getter
     *
     * Novation Details.
     *
     * @returns com.leansoft.fpml.nano.ContractNovation
	 */
	public ContractNovation getNovation() {
	    return this.novation;
	}
	
	/**
	 * public setter
	 *
     * Novation Details.
     *
     * @param com.leansoft.fpml.nano.ContractNovation
	 */
	public void setNovation(ContractNovation novation) {
	    this.novation = novation;
	}
	/**
     * public getter
     *
     * Identification of the Parties to this Contract.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public List<Party> getParty() {
	    return this.party;
	}
	
	/**
	 * public setter
	 *
     * Identification of the Parties to this Contract.
     *
     * @param java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public void setParty(List<Party> party) {
	    this.party = party;
	}

}