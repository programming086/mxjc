// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class InitialPortfolioDefinition extends PortfolioDefinition implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private boolean newPortfolioDefinition;
	
    
	/**
     * public getter
     *
     * Indicates whether it's a definition of a new portfolio (true) or an update to an existing one (false).
     *
     * @returns .boolean
	 */
	public boolean getNewPortfolioDefinition() {
	    return this.newPortfolioDefinition;
	}
	
	/**
	 * public setter
	 *
     * Indicates whether it's a definition of a new portfolio (true) or an update to an existing one (false).
     *
     * @param .boolean
	 */
	public void setNewPortfolioDefinition(boolean newPortfolioDefinition) {
	    this.newPortfolioDefinition = newPortfolioDefinition;
	}

}