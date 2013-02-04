// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type describing the whole set of possible underlyers: single underlyers or multiple underlyers, each of these having either security or index components.
 */
public class Underlyer implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private SingleUnderlyer singleUnderlyer;
	
	@Element
	private Basket basket;
	
    
	/**
     * public getter
     *
     * Describes the swap's underlyer when it has only one asset component.
     *
     * @returns com.leansoft.fpml.nano.SingleUnderlyer
	 */
	public SingleUnderlyer getSingleUnderlyer() {
	    return this.singleUnderlyer;
	}
	
	/**
	 * public setter
	 *
     * Describes the swap's underlyer when it has only one asset component.
     *
     * @param com.leansoft.fpml.nano.SingleUnderlyer
	 */
	public void setSingleUnderlyer(SingleUnderlyer singleUnderlyer) {
	    this.singleUnderlyer = singleUnderlyer;
	}
	/**
     * public getter
     *
     * Describes the swap's underlyer when it has multiple asset components.
     *
     * @returns com.leansoft.fpml.nano.Basket
	 */
	public Basket getBasket() {
	    return this.basket;
	}
	
	/**
	 * public setter
	 *
     * Describes the swap's underlyer when it has multiple asset components.
     *
     * @param com.leansoft.fpml.nano.Basket
	 */
	public void setBasket(Basket basket) {
	    this.basket = basket;
	}

}