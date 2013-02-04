// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * The roles of the parties in reporting information such as positions.
 */
public class ReportingRoles implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PartyReference baseParty;
	
	@Element
	private PartyReference activityProvider;
	
	@Element
	private PartyReference positionProvider;
	
	@Element
	private PartyReference valuationProvider;
	
    
	/**
     * public getter
     *
     * A reference to the party from whose perspective the position is valued, ie. the owner or holder of the position.
     *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getBaseParty() {
	    return this.baseParty;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party from whose perspective the position is valued, ie. the owner or holder of the position.
     *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setBaseParty(PartyReference baseParty) {
	    this.baseParty = baseParty;
	}
	/**
     * public getter
     *
     * A reference to the party responsible for reporting trading activities.
     *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getActivityProvider() {
	    return this.activityProvider;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party responsible for reporting trading activities.
     *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setActivityProvider(PartyReference activityProvider) {
	    this.activityProvider = activityProvider;
	}
	/**
     * public getter
     *
     * A reference to the party responsible for reporting the position itself and its constituents.
     *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getPositionProvider() {
	    return this.positionProvider;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party responsible for reporting the position itself and its constituents.
     *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setPositionProvider(PartyReference positionProvider) {
	    this.positionProvider = positionProvider;
	}
	/**
     * public getter
     *
     * A reference to the party responsible for calculating and reporting the valuations of the positions.
     *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getValuationProvider() {
	    return this.valuationProvider;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party responsible for calculating and reporting the valuations of the positions.
     *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setValuationProvider(PartyReference valuationProvider) {
	    this.valuationProvider = valuationProvider;
	}

}