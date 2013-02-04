// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class PhysicalSettlementTerms extends SettlementTerms implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PhysicalSettlementPeriod physicalSettlementPeriod;
	
	@Element
	private DeliverableObligations deliverableObligations;
	
	@Element
	private Boolean escrow;
	
	@Element
	private Boolean sixtyBusinessDaySettlementCap;
	
    
	/**
     * public getter
     *
     * The number of business days used in the determination of the physical settlement date. The physical settlement date is this number of business days after all applicable conditions to settlement are satisfied. If a number of business days is not specified fallback provisions apply for determining the number of business days. If Section 8.5/8.6 of the 1999/2003 ISDA Definitions are to apply the businessDaysNotSpecified element should be included. If a specified number of business days are to apply these should be specified in the businessDays element. If Section 8.5/8.6 of the 1999/2003 ISDA Definitions are to apply but capped at a maximum number of business days then the maximum number should be specified in the maximumBusinessDays element. ISDA 2003 Term: Physical Settlement Period
     *
     * @returns com.leansoft.fpml.nano.PhysicalSettlementPeriod
	 */
	public PhysicalSettlementPeriod getPhysicalSettlementPeriod() {
	    return this.physicalSettlementPeriod;
	}
	
	/**
	 * public setter
	 *
     * The number of business days used in the determination of the physical settlement date. The physical settlement date is this number of business days after all applicable conditions to settlement are satisfied. If a number of business days is not specified fallback provisions apply for determining the number of business days. If Section 8.5/8.6 of the 1999/2003 ISDA Definitions are to apply the businessDaysNotSpecified element should be included. If a specified number of business days are to apply these should be specified in the businessDays element. If Section 8.5/8.6 of the 1999/2003 ISDA Definitions are to apply but capped at a maximum number of business days then the maximum number should be specified in the maximumBusinessDays element. ISDA 2003 Term: Physical Settlement Period
     *
     * @param com.leansoft.fpml.nano.PhysicalSettlementPeriod
	 */
	public void setPhysicalSettlementPeriod(PhysicalSettlementPeriod physicalSettlementPeriod) {
	    this.physicalSettlementPeriod = physicalSettlementPeriod;
	}
	/**
     * public getter
     *
     * This element contains all the ISDA terms relevant to defining the deliverable obligations.
     *
     * @returns com.leansoft.fpml.nano.DeliverableObligations
	 */
	public DeliverableObligations getDeliverableObligations() {
	    return this.deliverableObligations;
	}
	
	/**
	 * public setter
	 *
     * This element contains all the ISDA terms relevant to defining the deliverable obligations.
     *
     * @param com.leansoft.fpml.nano.DeliverableObligations
	 */
	public void setDeliverableObligations(DeliverableObligations deliverableObligations) {
	    this.deliverableObligations = deliverableObligations;
	}
	/**
     * public getter
     *
     * If this element is specified, indicates that physical settlement must take place through the use of an escrow agent. (For Canadian counterparties this is always "Not Applicable". ISDA 2003 Term: Escrow
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getEscrow() {
	    return this.escrow;
	}
	
	/**
	 * public setter
	 *
     * If this element is specified, indicates that physical settlement must take place through the use of an escrow agent. (For Canadian counterparties this is always "Not Applicable". ISDA 2003 Term: Escrow
     *
     * @param java.lang.Boolean
	 */
	public void setEscrow(Boolean escrow) {
	    this.escrow = escrow;
	}
	/**
     * public getter
     *
     * If this element is specified, for a transaction documented under the 2003 ISDA Credit Derivatives Definitions, has the effect of incorporating the language set forth below into the confirmation. The section references are to the 2003 ISDA Credit Derivatives Definitions. Notwithstanding Section 1.7 or any provisions of Sections 9.9 or 9.10 to the contrary, but without prejudice to Section 9.3 and (where applicable) Sections 9.4, 9.5 and 9.6, if the Termination Date has not occurred on or prior to the date that is 60 Business Days following the Physical Settlement Date, such 60th Business Day shall be deemed to be the Termination Date with respect to this Transaction except in relation to any portion of the Transaction (an "Affected Portion") in respect of which: (1) a valid notice of Buy-in Price has been delivered that is effective fewer than three Business Days prior to such 60th Business Day, in which case the Termination Date for that Affected Portion shall be the third Business Day following the date on which such notice is effective; or (2) Buyer has purchased but not Delivered Deliverable Obligations validly specified by Seller pursuant to Section 9.10(b), in which case the Termination Date for that Affected Portion shall be the tenth Business Day following the date on which Seller validly specified such Deliverable Obligations to Buyer.
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSixtyBusinessDaySettlementCap() {
	    return this.sixtyBusinessDaySettlementCap;
	}
	
	/**
	 * public setter
	 *
     * If this element is specified, for a transaction documented under the 2003 ISDA Credit Derivatives Definitions, has the effect of incorporating the language set forth below into the confirmation. The section references are to the 2003 ISDA Credit Derivatives Definitions. Notwithstanding Section 1.7 or any provisions of Sections 9.9 or 9.10 to the contrary, but without prejudice to Section 9.3 and (where applicable) Sections 9.4, 9.5 and 9.6, if the Termination Date has not occurred on or prior to the date that is 60 Business Days following the Physical Settlement Date, such 60th Business Day shall be deemed to be the Termination Date with respect to this Transaction except in relation to any portion of the Transaction (an "Affected Portion") in respect of which: (1) a valid notice of Buy-in Price has been delivered that is effective fewer than three Business Days prior to such 60th Business Day, in which case the Termination Date for that Affected Portion shall be the third Business Day following the date on which such notice is effective; or (2) Buyer has purchased but not Delivered Deliverable Obligations validly specified by Seller pursuant to Section 9.10(b), in which case the Termination Date for that Affected Portion shall be the tenth Business Day following the date on which Seller validly specified such Deliverable Obligations to Buyer.
     *
     * @param java.lang.Boolean
	 */
	public void setSixtyBusinessDaySettlementCap(Boolean sixtyBusinessDaySettlementCap) {
	    this.sixtyBusinessDaySettlementCap = sixtyBusinessDaySettlementCap;
	}

}