// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class ValuationDate implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private SingleValuationDate singleValuationDate;
	
	@Element
	private MultipleValuationDates multipleValuationDates;
	
    
	/**
     * public getter
     *
     * Where single valuation date is specified as being applicable for cash settlement, this element specifies the number of business days after satisfaction of all conditions to settlement when such valuation date occurs. ISDA 2003 Term: Single Valuation Date
     *
     * @returns com.leansoft.fpml.nano.SingleValuationDate
	 */
	public SingleValuationDate getSingleValuationDate() {
	    return this.singleValuationDate;
	}
	
	/**
	 * public setter
	 *
     * Where single valuation date is specified as being applicable for cash settlement, this element specifies the number of business days after satisfaction of all conditions to settlement when such valuation date occurs. ISDA 2003 Term: Single Valuation Date
     *
     * @param com.leansoft.fpml.nano.SingleValuationDate
	 */
	public void setSingleValuationDate(SingleValuationDate singleValuationDate) {
	    this.singleValuationDate = singleValuationDate;
	}
	/**
     * public getter
     *
     * Where multiple valuation dates are specified as being applicable for cash settlement, this element specifies (a) the number of applicable valuation dates, and (b) the number of business days after satisfaction of all conditions to settlement when the first such valuation date occurs, and (c) the number of business days thereafter of each successive valuation date. ISDA 2003 Term: Multiple Valuation Dates
     *
     * @returns com.leansoft.fpml.nano.MultipleValuationDates
	 */
	public MultipleValuationDates getMultipleValuationDates() {
	    return this.multipleValuationDates;
	}
	
	/**
	 * public setter
	 *
     * Where multiple valuation dates are specified as being applicable for cash settlement, this element specifies (a) the number of applicable valuation dates, and (b) the number of business days after satisfaction of all conditions to settlement when the first such valuation date occurs, and (c) the number of business days thereafter of each successive valuation date. ISDA 2003 Term: Multiple Valuation Dates
     *
     * @param com.leansoft.fpml.nano.MultipleValuationDates
	 */
	public void setMultipleValuationDates(MultipleValuationDates multipleValuationDates) {
	    this.multipleValuationDates = multipleValuationDates;
	}

}