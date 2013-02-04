// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * This type is used to identify that a trade id is referring to a bock trade.
 */
public class AllocationTradeIdentifier extends PartyTradeIdentifier implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PartyTradeIdentifier blockTradeId;
	
    
	/**
     * public getter
     *
     * The trade id of the block trade. This is used by each one of the allocated trades to reference the block trade.
     *
     * @returns com.leansoft.fpml.nano.PartyTradeIdentifier
	 */
	public PartyTradeIdentifier getBlockTradeId() {
	    return this.blockTradeId;
	}
	
	/**
	 * public setter
	 *
     * The trade id of the block trade. This is used by each one of the allocated trades to reference the block trade.
     *
     * @param com.leansoft.fpml.nano.PartyTradeIdentifier
	 */
	public void setBlockTradeId(PartyTradeIdentifier blockTradeId) {
	    this.blockTradeId = blockTradeId;
	}

}