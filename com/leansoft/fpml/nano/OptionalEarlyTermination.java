// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type defining an early termination provision where either or both parties have the right to exercise.
 */
@RootElement(name = "optionalEarlyTermination", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class OptionalEarlyTermination implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private SinglePartyOption singlePartyOption;
	
	@Element
	private List<ExerciseNotice> exerciseNotice;
	
	@Element
	private Boolean followUpConfirmation;
	
	@Element
	private CalculationAgent calculationAgent;
	
	@Element
	private CashSettlement cashSettlement;
	
	@Element
	private OptionalEarlyTerminationAdjustedDates optionalEarlyTerminationAdjustedDates;
	
    
	/**
     * public getter
     *
     * If optional early termination is not available to both parties then this component specifies the buyer and seller of the option.
     *
     * @returns com.leansoft.fpml.nano.SinglePartyOption
	 */
	public SinglePartyOption getSinglePartyOption() {
	    return this.singlePartyOption;
	}
	
	/**
	 * public setter
	 *
     * If optional early termination is not available to both parties then this component specifies the buyer and seller of the option.
     *
     * @param com.leansoft.fpml.nano.SinglePartyOption
	 */
	public void setSinglePartyOption(SinglePartyOption singlePartyOption) {
	    this.singlePartyOption = singlePartyOption;
	}
	/**
     * public getter
     *
     * Definition of the party to whom notice of exercise should be given.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.ExerciseNotice>
	 */
	public List<ExerciseNotice> getExerciseNotice() {
	    return this.exerciseNotice;
	}
	
	/**
	 * public setter
	 *
     * Definition of the party to whom notice of exercise should be given.
     *
     * @param java.util.List<com.leansoft.fpml.nano.ExerciseNotice>
	 */
	public void setExerciseNotice(List<ExerciseNotice> exerciseNotice) {
	    this.exerciseNotice = exerciseNotice;
	}
	/**
     * public getter
     *
     * A flag to indicate whether follow-up confirmation of exercise (written or electronic) is required following telephonic notice by the buyer to the seller or seller's agent.
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getFollowUpConfirmation() {
	    return this.followUpConfirmation;
	}
	
	/**
	 * public setter
	 *
     * A flag to indicate whether follow-up confirmation of exercise (written or electronic) is required following telephonic notice by the buyer to the seller or seller's agent.
     *
     * @param java.lang.Boolean
	 */
	public void setFollowUpConfirmation(Boolean followUpConfirmation) {
	    this.followUpConfirmation = followUpConfirmation;
	}
	/**
     * public getter
     *
     * The ISDA Calculation Agent responsible for performing duties associated with an optional early termination.
     *
     * @returns com.leansoft.fpml.nano.CalculationAgent
	 */
	public CalculationAgent getCalculationAgent() {
	    return this.calculationAgent;
	}
	
	/**
	 * public setter
	 *
     * The ISDA Calculation Agent responsible for performing duties associated with an optional early termination.
     *
     * @param com.leansoft.fpml.nano.CalculationAgent
	 */
	public void setCalculationAgent(CalculationAgent calculationAgent) {
	    this.calculationAgent = calculationAgent;
	}
	/**
     * public getter
     *
     * If specified, this means that cash settlement is applicable to the transaction and defines the parameters associated with the cash settlement prodcedure. If not specified, then physical settlement is applicable.
     *
     * @returns com.leansoft.fpml.nano.CashSettlement
	 */
	public CashSettlement getCashSettlement() {
	    return this.cashSettlement;
	}
	
	/**
	 * public setter
	 *
     * If specified, this means that cash settlement is applicable to the transaction and defines the parameters associated with the cash settlement prodcedure. If not specified, then physical settlement is applicable.
     *
     * @param com.leansoft.fpml.nano.CashSettlement
	 */
	public void setCashSettlement(CashSettlement cashSettlement) {
	    this.cashSettlement = cashSettlement;
	}
	/**
     * public getter
     *
     * An early termination provision to terminate the trade at fair value where one or both parties have the right to decide on termination.
     *
     * @returns com.leansoft.fpml.nano.OptionalEarlyTerminationAdjustedDates
	 */
	public OptionalEarlyTerminationAdjustedDates getOptionalEarlyTerminationAdjustedDates() {
	    return this.optionalEarlyTerminationAdjustedDates;
	}
	
	/**
	 * public setter
	 *
     * An early termination provision to terminate the trade at fair value where one or both parties have the right to decide on termination.
     *
     * @param com.leansoft.fpml.nano.OptionalEarlyTerminationAdjustedDates
	 */
	public void setOptionalEarlyTerminationAdjustedDates(OptionalEarlyTerminationAdjustedDates optionalEarlyTerminationAdjustedDates) {
	    this.optionalEarlyTerminationAdjustedDates = optionalEarlyTerminationAdjustedDates;
	}

}