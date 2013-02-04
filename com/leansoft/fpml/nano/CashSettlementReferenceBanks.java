// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type defining the list of reference institutions polled for relevant rates or prices when determining the cash settlement amount for a product where cash settlement is applicable.
 */
public class CashSettlementReferenceBanks implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<ReferenceBank> referenceBank;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * An institution (party) identified by means of a coding scheme and an optional name.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.ReferenceBank>
	 */
	public List<ReferenceBank> getReferenceBank() {
	    return this.referenceBank;
	}
	
	/**
	 * public setter
	 *
     * An institution (party) identified by means of a coding scheme and an optional name.
     *
     * @param java.util.List<com.leansoft.fpml.nano.ReferenceBank>
	 */
	public void setReferenceBank(List<ReferenceBank> referenceBank) {
	    this.referenceBank = referenceBank;
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