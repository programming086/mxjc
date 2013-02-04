// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * A type for defining the common features of equity derivatives.
 */
public abstract class EquityDerivativeBase extends Product implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PartyOrTradeSideReference buyerPartyReference;
	
	@Element
	private PartyOrTradeSideReference sellerPartyReference;
	
	@Element
	private OptionTypeEnum optionType;
	
	@Element
	private Date equityEffectiveDate;
	
	@Element
	private Underlyer underlyer;
	
	@Element
	private Money notional;
	
	@Element
	private EquityExerciseValuationSettlement equityExercise;
	
	@Element
	private OptionFeatures feature;
	
	@Element
	private FxFeature fxFeature;
	
	@Element
	private StrategyFeature strategyFeature;
	
    
	/**
     * public getter
     *
     * A reference to the party that buys this instrument, ie. pays for this instrument and receives the rights defined by it. See 2000 ISDA definitions Article 11.1 (b). In the case of FRAs this the fixed rate payer.
     *
     * @returns com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public PartyOrTradeSideReference getBuyerPartyReference() {
	    return this.buyerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party that buys this instrument, ie. pays for this instrument and receives the rights defined by it. See 2000 ISDA definitions Article 11.1 (b). In the case of FRAs this the fixed rate payer.
     *
     * @param com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public void setBuyerPartyReference(PartyOrTradeSideReference buyerPartyReference) {
	    this.buyerPartyReference = buyerPartyReference;
	}
	/**
     * public getter
     *
     * A reference to the party that sells ("writes") this instrument, i.e. that grants the rights defined by this instrument and in return receives a payment for it. See 2000 ISDA definitions Article 11.1 (a). In the case of FRAs this is the floating rate payer.
     *
     * @returns com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public PartyOrTradeSideReference getSellerPartyReference() {
	    return this.sellerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party that sells ("writes") this instrument, i.e. that grants the rights defined by this instrument and in return receives a payment for it. See 2000 ISDA definitions Article 11.1 (a). In the case of FRAs this is the floating rate payer.
     *
     * @param com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public void setSellerPartyReference(PartyOrTradeSideReference sellerPartyReference) {
	    this.sellerPartyReference = sellerPartyReference;
	}
	/**
     * public getter
     *
     * The type of option transaction.
     *
     * @returns com.leansoft.fpml.nano.OptionTypeEnum
	 */
	public OptionTypeEnum getOptionType() {
	    return this.optionType;
	}
	
	/**
	 * public setter
	 *
     * The type of option transaction.
     *
     * @param com.leansoft.fpml.nano.OptionTypeEnum
	 */
	public void setOptionType(OptionTypeEnum optionType) {
	    this.optionType = optionType;
	}
	/**
     * public getter
     *
     * Effective date for a forward starting option
     *
     * @returns java.util.Date
	 */
	public Date getEquityEffectiveDate() {
	    return this.equityEffectiveDate;
	}
	
	/**
	 * public setter
	 *
     * Effective date for a forward starting option
     *
     * @param java.util.Date
	 */
	public void setEquityEffectiveDate(Date equityEffectiveDate) {
	    this.equityEffectiveDate = equityEffectiveDate;
	}
	/**
     * public getter
     *
     * Specifies the underlying component, which can be either one or many and consists in either equity, index or convertible bond component, or a combination of these.
     *
     * @returns com.leansoft.fpml.nano.Underlyer
	 */
	public Underlyer getUnderlyer() {
	    return this.underlyer;
	}
	
	/**
	 * public setter
	 *
     * Specifies the underlying component, which can be either one or many and consists in either equity, index or convertible bond component, or a combination of these.
     *
     * @param com.leansoft.fpml.nano.Underlyer
	 */
	public void setUnderlyer(Underlyer underlyer) {
	    this.underlyer = underlyer;
	}
	/**
     * public getter
     *
     * The notional amount.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getNotional() {
	    return this.notional;
	}
	
	/**
	 * public setter
	 *
     * The notional amount.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setNotional(Money notional) {
	    this.notional = notional;
	}
	/**
     * public getter
     *
     * The parameters for defining how the equity option can be exercised, how it is valued and how it is settled.
     *
     * @returns com.leansoft.fpml.nano.EquityExerciseValuationSettlement
	 */
	public EquityExerciseValuationSettlement getEquityExercise() {
	    return this.equityExercise;
	}
	
	/**
	 * public setter
	 *
     * The parameters for defining how the equity option can be exercised, how it is valued and how it is settled.
     *
     * @param com.leansoft.fpml.nano.EquityExerciseValuationSettlement
	 */
	public void setEquityExercise(EquityExerciseValuationSettlement equityExercise) {
	    this.equityExercise = equityExercise;
	}
	/**
     * public getter
     *
     * Asian, Barrier, Knock and Pass Through features
     *
     * @returns com.leansoft.fpml.nano.OptionFeatures
	 */
	public OptionFeatures getFeature() {
	    return this.feature;
	}
	
	/**
	 * public setter
	 *
     * Asian, Barrier, Knock and Pass Through features
     *
     * @param com.leansoft.fpml.nano.OptionFeatures
	 */
	public void setFeature(OptionFeatures feature) {
	    this.feature = feature;
	}
	/**
     * public getter
     *
     * Quanto, Composite, or Cross Currency FX features
     *
     * @returns com.leansoft.fpml.nano.FxFeature
	 */
	public FxFeature getFxFeature() {
	    return this.fxFeature;
	}
	
	/**
	 * public setter
	 *
     * Quanto, Composite, or Cross Currency FX features
     *
     * @param com.leansoft.fpml.nano.FxFeature
	 */
	public void setFxFeature(FxFeature fxFeature) {
	    this.fxFeature = fxFeature;
	}
	/**
     * public getter
     *
     * A equity option simple strategy feature
     *
     * @returns com.leansoft.fpml.nano.StrategyFeature
	 */
	public StrategyFeature getStrategyFeature() {
	    return this.strategyFeature;
	}
	
	/**
	 * public setter
	 *
     * A equity option simple strategy feature
     *
     * @param com.leansoft.fpml.nano.StrategyFeature
	 */
	public void setStrategyFeature(StrategyFeature strategyFeature) {
	    this.strategyFeature = strategyFeature;
	}

}