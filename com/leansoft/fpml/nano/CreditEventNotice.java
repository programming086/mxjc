// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class CreditEventNotice implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private NotifyingParty notifyingParty;
	
	@Element
	private BusinessCenter businessCenter;
	
	@Element
	private PubliclyAvailableInformation publiclyAvailableInformation;
	
    
	/**
     * public getter
     *
     * Pointer style references to a party identifier defined elsewhere in the document. The notifying party is the party that notifies the other party when a credit event has occurred by means of a credit event notice. If more than one party is referenced as being the notifying party then either party may notify the other of a credit event occurring. ISDA 2003 Term: Notifying Party
     *
     * @returns com.leansoft.fpml.nano.NotifyingParty
	 */
	public NotifyingParty getNotifyingParty() {
	    return this.notifyingParty;
	}
	
	/**
	 * public setter
	 *
     * Pointer style references to a party identifier defined elsewhere in the document. The notifying party is the party that notifies the other party when a credit event has occurred by means of a credit event notice. If more than one party is referenced as being the notifying party then either party may notify the other of a credit event occurring. ISDA 2003 Term: Notifying Party
     *
     * @param com.leansoft.fpml.nano.NotifyingParty
	 */
	public void setNotifyingParty(NotifyingParty notifyingParty) {
	    this.notifyingParty = notifyingParty;
	}
	/**
     * public getter
     *
     * Inclusion of this business center element implies that Greenwich Mean Time in Section 3.3 of the 2003 ISDA Credit Derivatives Definitions is replaced by the local time of the city indicated by the businessCenter element value.
     *
     * @returns com.leansoft.fpml.nano.BusinessCenter
	 */
	public BusinessCenter getBusinessCenter() {
	    return this.businessCenter;
	}
	
	/**
	 * public setter
	 *
     * Inclusion of this business center element implies that Greenwich Mean Time in Section 3.3 of the 2003 ISDA Credit Derivatives Definitions is replaced by the local time of the city indicated by the businessCenter element value.
     *
     * @param com.leansoft.fpml.nano.BusinessCenter
	 */
	public void setBusinessCenter(BusinessCenter businessCenter) {
	    this.businessCenter = businessCenter;
	}
	/**
     * public getter
     *
     * A specified condition to settlement. Publicly available information means information that reasonably confirms any of the facts relevant to determining that a credit event or potential repudiation/moratorium, as applicable, has occurred. The ISDA defined list (2003) is the market standard and is considered comprehensive, and a minimum of two differing public sources must have published the relevant information, to declare a Credit Event. ISDA 2003 Term: Notice of Publicly Available Information Applicable
     *
     * @returns com.leansoft.fpml.nano.PubliclyAvailableInformation
	 */
	public PubliclyAvailableInformation getPubliclyAvailableInformation() {
	    return this.publiclyAvailableInformation;
	}
	
	/**
	 * public setter
	 *
     * A specified condition to settlement. Publicly available information means information that reasonably confirms any of the facts relevant to determining that a credit event or potential repudiation/moratorium, as applicable, has occurred. The ISDA defined list (2003) is the market standard and is considered comprehensive, and a minimum of two differing public sources must have published the relevant information, to declare a Credit Event. ISDA 2003 Term: Notice of Publicly Available Information Applicable
     *
     * @param com.leansoft.fpml.nano.PubliclyAvailableInformation
	 */
	public void setPubliclyAvailableInformation(PubliclyAvailableInformation publiclyAvailableInformation) {
	    this.publiclyAvailableInformation = publiclyAvailableInformation;
	}

}