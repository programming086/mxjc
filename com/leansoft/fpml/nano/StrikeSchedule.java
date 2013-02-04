// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type describing a schedule of cap or floor rates.
 */
public class StrikeSchedule extends Schedule implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private IdentifiedPayerReceiver buyer;
	
	@Element
	private IdentifiedPayerReceiver seller;
	
    
	/**
     * public getter
     *
     * The buyer of the option
     *
     * @returns com.leansoft.fpml.nano.IdentifiedPayerReceiver
	 */
	public IdentifiedPayerReceiver getBuyer() {
	    return this.buyer;
	}
	
	/**
	 * public setter
	 *
     * The buyer of the option
     *
     * @param com.leansoft.fpml.nano.IdentifiedPayerReceiver
	 */
	public void setBuyer(IdentifiedPayerReceiver buyer) {
	    this.buyer = buyer;
	}
	/**
     * public getter
     *
     * The party that has sold.
     *
     * @returns com.leansoft.fpml.nano.IdentifiedPayerReceiver
	 */
	public IdentifiedPayerReceiver getSeller() {
	    return this.seller;
	}
	
	/**
	 * public setter
	 *
     * The party that has sold.
     *
     * @param com.leansoft.fpml.nano.IdentifiedPayerReceiver
	 */
	public void setSeller(IdentifiedPayerReceiver seller) {
	    this.seller = seller;
	}

}