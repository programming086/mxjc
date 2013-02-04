// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type that is different from AdjustableDate in two regards. First, date adjustments can be specified with either a dateAdjustments element or a reference to an existing dateAdjustments element. Second, it does not require the specification of date adjustments.
 */
public class AdjustableDate2 implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private IdentifiedDate unadjustedDate;
	
	@Element
	private BusinessDayAdjustments dateAdjustments;
	
	@Element
	private BusinessDayAdjustmentsReference dateAdjustmentsReference;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * A date subject to adjustment.
     *
     * @returns com.leansoft.fpml.nano.IdentifiedDate
	 */
	public IdentifiedDate getUnadjustedDate() {
	    return this.unadjustedDate;
	}
	
	/**
	 * public setter
	 *
     * A date subject to adjustment.
     *
     * @param com.leansoft.fpml.nano.IdentifiedDate
	 */
	public void setUnadjustedDate(IdentifiedDate unadjustedDate) {
	    this.unadjustedDate = unadjustedDate;
	}
	/**
     * public getter
     *
     * The business day convention and financial business centers used for adjusting the date if it would otherwise fall on a day that is not a business dat in the specified business centers.
     *
     * @returns com.leansoft.fpml.nano.BusinessDayAdjustments
	 */
	public BusinessDayAdjustments getDateAdjustments() {
	    return this.dateAdjustments;
	}
	
	/**
	 * public setter
	 *
     * The business day convention and financial business centers used for adjusting the date if it would otherwise fall on a day that is not a business dat in the specified business centers.
     *
     * @param com.leansoft.fpml.nano.BusinessDayAdjustments
	 */
	public void setDateAdjustments(BusinessDayAdjustments dateAdjustments) {
	    this.dateAdjustments = dateAdjustments;
	}
	/**
     * public getter
     *
     * A pointer style reference to date adjustments defined elsewhere in the document.
     *
     * @returns com.leansoft.fpml.nano.BusinessDayAdjustmentsReference
	 */
	public BusinessDayAdjustmentsReference getDateAdjustmentsReference() {
	    return this.dateAdjustmentsReference;
	}
	
	/**
	 * public setter
	 *
     * A pointer style reference to date adjustments defined elsewhere in the document.
     *
     * @param com.leansoft.fpml.nano.BusinessDayAdjustmentsReference
	 */
	public void setDateAdjustmentsReference(BusinessDayAdjustmentsReference dateAdjustmentsReference) {
	    this.dateAdjustmentsReference = dateAdjustmentsReference;
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