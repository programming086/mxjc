// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A collection of quoted assets.
 */
public class QuotedAssetSet implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private InstrumentSet instrumentSet;
	
	@Element
	private List<BasicAssetValuation> assetQuote;
	
    
	/**
     * public getter
     *
     * A collection of instruments used as a basis for quotation.
     *
     * @returns com.leansoft.fpml.nano.InstrumentSet
	 */
	public InstrumentSet getInstrumentSet() {
	    return this.instrumentSet;
	}
	
	/**
	 * public setter
	 *
     * A collection of instruments used as a basis for quotation.
     *
     * @param com.leansoft.fpml.nano.InstrumentSet
	 */
	public void setInstrumentSet(InstrumentSet instrumentSet) {
	    this.instrumentSet = instrumentSet;
	}
	/**
     * public getter
     *
     * A collection of valuations (quotes) for the assets needed in the set. Normally these quotes will be for the underlying assets listed above, but they don't necesarily have to be.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.BasicAssetValuation>
	 */
	public List<BasicAssetValuation> getAssetQuote() {
	    return this.assetQuote;
	}
	
	/**
	 * public setter
	 *
     * A collection of valuations (quotes) for the assets needed in the set. Normally these quotes will be for the underlying assets listed above, but they don't necesarily have to be.
     *
     * @param java.util.List<com.leansoft.fpml.nano.BasicAssetValuation>
	 */
	public void setAssetQuote(List<BasicAssetValuation> assetQuote) {
	    this.assetQuote = assetQuote;
	}

}