// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * Adds an optional spread type element to the Schedule to identify a long or short spread value.
 */
public class SpreadSchedule extends Schedule implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private SpreadScheduleType type;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.SpreadScheduleType
	 */
	public SpreadScheduleType getType() {
	    return this.type;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.SpreadScheduleType
	 */
	public void setType(SpreadScheduleType type) {
	    this.type = type;
	}

}