// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class NotifyingParty implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PartyReference buyerPartyReference;
	
	@Element
	private PartyReference sellerPartyReference;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getBuyerPartyReference() {
	    return this.buyerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setBuyerPartyReference(PartyReference buyerPartyReference) {
	    this.buyerPartyReference = buyerPartyReference;
	}
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getSellerPartyReference() {
	    return this.sellerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setSellerPartyReference(PartyReference sellerPartyReference) {
	    this.sellerPartyReference = sellerPartyReference;
	}

}