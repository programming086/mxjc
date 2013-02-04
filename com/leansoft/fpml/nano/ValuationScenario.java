// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A set of rules for generating a valuation.
 */
public class ValuationScenario implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private String name;
	
	@Element
	private IdentifiedDate valuationDate;
	
	@Element
	private MarketReference marketReference;
	
	@Element
	private List<PricingParameterShift> shift;
	
	@Element
	private List<PricingInputReplacement> replacement;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The (optional) name for this valuation scenario, used for understandability. For example "EOD Valuations".
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * The (optional) name for this valuation scenario, used for understandability. For example "EOD Valuations".
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * The date for which the assets are valued.
     *
     * @returns com.leansoft.fpml.nano.IdentifiedDate
	 */
	public IdentifiedDate getValuationDate() {
	    return this.valuationDate;
	}
	
	/**
	 * public setter
	 *
     * The date for which the assets are valued.
     *
     * @param com.leansoft.fpml.nano.IdentifiedDate
	 */
	public void setValuationDate(IdentifiedDate valuationDate) {
	    this.valuationDate = valuationDate;
	}
	/**
     * public getter
     *
     * A reference to the market environment used to price the asset.
     *
     * @returns com.leansoft.fpml.nano.MarketReference
	 */
	public MarketReference getMarketReference() {
	    return this.marketReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the market environment used to price the asset.
     *
     * @param com.leansoft.fpml.nano.MarketReference
	 */
	public void setMarketReference(MarketReference marketReference) {
	    this.marketReference = marketReference;
	}
	/**
     * public getter
     *
     * A collection of shifts to be applied to market inputs prior to computation of the derivative.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PricingParameterShift>
	 */
	public List<PricingParameterShift> getShift() {
	    return this.shift;
	}
	
	/**
	 * public setter
	 *
     * A collection of shifts to be applied to market inputs prior to computation of the derivative.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PricingParameterShift>
	 */
	public void setShift(List<PricingParameterShift> shift) {
	    this.shift = shift;
	}
	/**
     * public getter
     *
     * A collection of shifts to be applied to market inputs prior to computation of the derivative.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PricingInputReplacement>
	 */
	public List<PricingInputReplacement> getReplacement() {
	    return this.replacement;
	}
	
	/**
	 * public setter
	 *
     * A collection of shifts to be applied to market inputs prior to computation of the derivative.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PricingInputReplacement>
	 */
	public void setReplacement(List<PricingInputReplacement> replacement) {
	    this.replacement = replacement;
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