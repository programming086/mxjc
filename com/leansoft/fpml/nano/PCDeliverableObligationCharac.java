// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class PCDeliverableObligationCharac implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Empty partialCashSettlement;
	
    
	/**
     * public getter
     *
     * Specifies whether either 'Partial Cash Settlement of Assignable Loans', 'Partial Cash Settlement of Consent Required Loans' or 'Partial Cash Settlement of Participations' is applicable. If this element is specified and Assignable Loan is a Deliverable Obligation Chracteristic, any Assignable Loan that is deliverable, but where a non-receipt of Consent by the Physical Settlement Date has occurred, the Loan can be cash settled rather than physically delivered. If this element is specified and Consent Required Loan is a Deliverable Obligation Characterisitc, any Consent Required Loan that is deliverable, but where a non-receipt of Consent by the Physical Settlement Date has occurred, the Loan can be cash settled rather than physically delivered. If this element is specified and Direct Loan Participation is a Deliverable Obligation Characterisitic, any Participation that is deliverable, but where this participation has not been effected (has not come into effect) by the Physical Settlement Date, the participation can be cash settled rather than physically delivered.
     *
     * @returns com.leansoft.fpml.nano.Empty
	 */
	public Empty getPartialCashSettlement() {
	    return this.partialCashSettlement;
	}
	
	/**
	 * public setter
	 *
     * Specifies whether either 'Partial Cash Settlement of Assignable Loans', 'Partial Cash Settlement of Consent Required Loans' or 'Partial Cash Settlement of Participations' is applicable. If this element is specified and Assignable Loan is a Deliverable Obligation Chracteristic, any Assignable Loan that is deliverable, but where a non-receipt of Consent by the Physical Settlement Date has occurred, the Loan can be cash settled rather than physically delivered. If this element is specified and Consent Required Loan is a Deliverable Obligation Characterisitc, any Consent Required Loan that is deliverable, but where a non-receipt of Consent by the Physical Settlement Date has occurred, the Loan can be cash settled rather than physically delivered. If this element is specified and Direct Loan Participation is a Deliverable Obligation Characterisitic, any Participation that is deliverable, but where this participation has not been effected (has not come into effect) by the Physical Settlement Date, the participation can be cash settled rather than physically delivered.
     *
     * @param com.leansoft.fpml.nano.Empty
	 */
	public void setPartialCashSettlement(Empty partialCashSettlement) {
	    this.partialCashSettlement = partialCashSettlement;
	}

}