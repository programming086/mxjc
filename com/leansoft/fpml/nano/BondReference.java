// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type including a reference to a bond to support the representation of an asset swap or Condition Precedent Bond.
 */
public class BondReference implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Bond bond;
	
	@Element
	private boolean conditionPrecedentBond;
	
	@Element
	private Boolean discrepancyClause;
	
    
	/**
     * public getter
     *
     * Defines the underlying asset when it is a bond.
     *
     * @returns com.leansoft.fpml.nano.Bond
	 */
	public Bond getBond() {
	    return this.bond;
	}
	
	/**
	 * public setter
	 *
     * Defines the underlying asset when it is a bond.
     *
     * @param com.leansoft.fpml.nano.Bond
	 */
	public void setBond(Bond bond) {
	    this.bond = bond;
	}
	/**
     * public getter
     *
     * To indicate whether the Condition Precedent Bond is applicable. The swap contract is only valid if the bond is issued and if there is any dispute over the terms of fixed stream then the bond terms would be used.
     *
     * @returns .boolean
	 */
	public boolean getConditionPrecedentBond() {
	    return this.conditionPrecedentBond;
	}
	
	/**
	 * public setter
	 *
     * To indicate whether the Condition Precedent Bond is applicable. The swap contract is only valid if the bond is issued and if there is any dispute over the terms of fixed stream then the bond terms would be used.
     *
     * @param .boolean
	 */
	public void setConditionPrecedentBond(boolean conditionPrecedentBond) {
	    this.conditionPrecedentBond = conditionPrecedentBond;
	}
	/**
     * public getter
     *
     * To indicate whether the Discrepancy Clause is applicable.
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDiscrepancyClause() {
	    return this.discrepancyClause;
	}
	
	/**
	 * public setter
	 *
     * To indicate whether the Discrepancy Clause is applicable.
     *
     * @param java.lang.Boolean
	 */
	public void setDiscrepancyClause(Boolean discrepancyClause) {
	    this.discrepancyClause = discrepancyClause;
	}

}