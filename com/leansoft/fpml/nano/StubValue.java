// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.math.BigDecimal;

/**
 * A type defining how a stub calculation period amount is calculated. A single floating rate tenor different to that used for the regular part of the calculation periods schedule may be specified, or two floating rate tenors many be specified. If two floating rate tenors are specified then Linear Interpolation (in accordance with the 2000 ISDA Definitions, Section 8.3 Interpolation) is assumed to apply. Alternatively, an actual known stub rate or stub amount may be specified.
 */
@RootElement(name = "finalStub", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class StubValue implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<FloatingRate> floatingRate;
	
	@Element
	private BigDecimal stubRate;
	
	@Element
	private Money stubAmount;
	
    
	/**
     * public getter
     *
     * The rates to be applied to the initial or final stub may be the linear interpolation of two different rates. While the majority of the time, the rate indices will be the same as that specified in the stream and only the tenor itself will be different, it is possible to specift two different rates. For example, a 2 month stub period may use the linear interpolation of a 1 month and 3 month rate. The different rates would be specified in this component. Note that a maximum of two rates can be specified. If a stub period uses the same floating rate index, including tenor, as the regular calculation periods then this should not be specified again within this component, i.e. the stub calculation period amount component may not need to be specified even if there is an initial or final stub period. If a stub period uses a different floating rate index compared to the regular calculation periods then this should be specified within this component. If specified here, they are likely to have id attributes, allowing them to be referenced from within the cashflows component.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.FloatingRate>
	 */
	public List<FloatingRate> getFloatingRate() {
	    return this.floatingRate;
	}
	
	/**
	 * public setter
	 *
     * The rates to be applied to the initial or final stub may be the linear interpolation of two different rates. While the majority of the time, the rate indices will be the same as that specified in the stream and only the tenor itself will be different, it is possible to specift two different rates. For example, a 2 month stub period may use the linear interpolation of a 1 month and 3 month rate. The different rates would be specified in this component. Note that a maximum of two rates can be specified. If a stub period uses the same floating rate index, including tenor, as the regular calculation periods then this should not be specified again within this component, i.e. the stub calculation period amount component may not need to be specified even if there is an initial or final stub period. If a stub period uses a different floating rate index compared to the regular calculation periods then this should be specified within this component. If specified here, they are likely to have id attributes, allowing them to be referenced from within the cashflows component.
     *
     * @param java.util.List<com.leansoft.fpml.nano.FloatingRate>
	 */
	public void setFloatingRate(List<FloatingRate> floatingRate) {
	    this.floatingRate = floatingRate;
	}
	/**
     * public getter
     *
     * An actual rate to apply for the initial or final stub period may have been agreed between the principal parties (in a similar way to how an initial rate may have been agreed for the first regular period). If an actual stub rate has been agreed then it would be included in this component. It will be a per annum rate, expressed as a decimal. A stub rate of 5% would be represented as 0.05.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getStubRate() {
	    return this.stubRate;
	}
	
	/**
	 * public setter
	 *
     * An actual rate to apply for the initial or final stub period may have been agreed between the principal parties (in a similar way to how an initial rate may have been agreed for the first regular period). If an actual stub rate has been agreed then it would be included in this component. It will be a per annum rate, expressed as a decimal. A stub rate of 5% would be represented as 0.05.
     *
     * @param java.math.BigDecimal
	 */
	public void setStubRate(BigDecimal stubRate) {
	    this.stubRate = stubRate;
	}
	/**
     * public getter
     *
     * An actual amount to apply for the initial or final stub period may have been agreed between th two parties. If an actual stub amount has been agreed then it would be included in this component.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getStubAmount() {
	    return this.stubAmount;
	}
	
	/**
	 * public setter
	 *
     * An actual amount to apply for the initial or final stub period may have been agreed between th two parties. If an actual stub amount has been agreed then it would be included in this component.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setStubAmount(Money stubAmount) {
	    this.stubAmount = stubAmount;
	}

}