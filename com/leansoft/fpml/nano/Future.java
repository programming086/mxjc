// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * An exchange traded future contract.
 */
@RootElement(name = "future", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class Future extends ExchangeTraded implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigInteger multiplier;
	
	@Element
	private String futureContractReference;
	
	@Element
	private Date maturity;
	
    
	/**
     * public getter
     *
     * Specifies the contract multiplier that can be associated with the number of units.
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getMultiplier() {
	    return this.multiplier;
	}
	
	/**
	 * public setter
	 *
     * Specifies the contract multiplier that can be associated with the number of units.
     *
     * @param java.math.BigInteger
	 */
	public void setMultiplier(BigInteger multiplier) {
	    this.multiplier = multiplier;
	}
	/**
     * public getter
     *
     * Specifies the future contract that can be referenced, besides the equity or index reference defined as part of the UnderlyerAsset type.
     *
     * @returns java.lang.String
	 */
	public String getFutureContractReference() {
	    return this.futureContractReference;
	}
	
	/**
	 * public setter
	 *
     * Specifies the future contract that can be referenced, besides the equity or index reference defined as part of the UnderlyerAsset type.
     *
     * @param java.lang.String
	 */
	public void setFutureContractReference(String futureContractReference) {
	    this.futureContractReference = futureContractReference;
	}
	/**
     * public getter
     *
     * The date when the future contract expires.
     *
     * @returns java.util.Date
	 */
	public Date getMaturity() {
	    return this.maturity;
	}
	
	/**
	 * public setter
	 *
     * The date when the future contract expires.
     *
     * @param java.util.Date
	 */
	public void setMaturity(Date maturity) {
	    this.maturity = maturity;
	}

}