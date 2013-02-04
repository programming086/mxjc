// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type defining a date (referred to as the derived date) as a relative offset from another date (referred to as the anchor date). If the anchor date is itself an adjustable date then the offset is assumed to be calculated from the adjusted anchor date. A number of different scenarios can be supported, namely; 1) the derived date may simply be a number of calendar periods (days, weeks, months or years) preceding or following the anchor date; 2) the unadjusted derived date may be a number of calendar periods (days, weeks, months or years) preceding or following the anchor date with the resulting unadjusted derived date subject to adjustment in accordance with a specified business day convention, i.e. the derived date must fall on a good business day; 3) the derived date may be a number of business days preceding or following the anchor date. Note that the businessDayConvention specifies any required adjustment to the unadjusted derived date. A negative or positive value in the periodMultiplier indicates whether the unadjusted derived precedes or follows the anchor date. The businessDayConvention should contain a value NONE if the day type element contains a value of Business (since specifying a negative or positive business days offset would already guarantee that the derived date would fall on a good business day in the specified business centers).
 */
public class RelativeDateOffset extends Offset implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BusinessDayConventionEnum businessDayConvention;
	
	@Element
	private BusinessCentersReference businessCentersReference;
	
	@Element
	private BusinessCenters businessCenters;
	
	@Element
	private DateReference dateRelativeTo;
	
    
	/**
     * public getter
     *
     * The convention for adjusting a date if it would otherwise fall on a day that is not a business day.
     *
     * @returns com.leansoft.fpml.nano.BusinessDayConventionEnum
	 */
	public BusinessDayConventionEnum getBusinessDayConvention() {
	    return this.businessDayConvention;
	}
	
	/**
	 * public setter
	 *
     * The convention for adjusting a date if it would otherwise fall on a day that is not a business day.
     *
     * @param com.leansoft.fpml.nano.BusinessDayConventionEnum
	 */
	public void setBusinessDayConvention(BusinessDayConventionEnum businessDayConvention) {
	    this.businessDayConvention = businessDayConvention;
	}
	/**
     * public getter
     *
     * A pointer style reference to a set of financial business centers defined elsewhere in the document. This set of business centers is used to determine whether a particular day is a business day or not.
     *
     * @returns com.leansoft.fpml.nano.BusinessCentersReference
	 */
	public BusinessCentersReference getBusinessCentersReference() {
	    return this.businessCentersReference;
	}
	
	/**
	 * public setter
	 *
     * A pointer style reference to a set of financial business centers defined elsewhere in the document. This set of business centers is used to determine whether a particular day is a business day or not.
     *
     * @param com.leansoft.fpml.nano.BusinessCentersReference
	 */
	public void setBusinessCentersReference(BusinessCentersReference businessCentersReference) {
	    this.businessCentersReference = businessCentersReference;
	}
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.BusinessCenters
	 */
	public BusinessCenters getBusinessCenters() {
	    return this.businessCenters;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.BusinessCenters
	 */
	public void setBusinessCenters(BusinessCenters businessCenters) {
	    this.businessCenters = businessCenters;
	}
	/**
     * public getter
     *
     * Specifies the anchor as an href attribute. The href attribute value is a pointer style reference to the element or component elsewhere in the document where the anchor date is defined.
     *
     * @returns com.leansoft.fpml.nano.DateReference
	 */
	public DateReference getDateRelativeTo() {
	    return this.dateRelativeTo;
	}
	
	/**
	 * public setter
	 *
     * Specifies the anchor as an href attribute. The href attribute value is a pointer style reference to the element or component elsewhere in the document where the anchor date is defined.
     *
     * @param com.leansoft.fpml.nano.DateReference
	 */
	public void setDateRelativeTo(DateReference dateRelativeTo) {
	    this.dateRelativeTo = dateRelativeTo;
	}

}