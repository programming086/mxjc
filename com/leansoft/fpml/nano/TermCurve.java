// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A curve consisting only of values over a term. This is a restricted form of One Dimensional Structure.
 */
public class TermCurve implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private InterpolationMethod interpolationMethod;
	
	@Element
	private Boolean extrapolationPermitted;
	
	@Element
	private List<TermPoint> point;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.InterpolationMethod
	 */
	public InterpolationMethod getInterpolationMethod() {
	    return this.interpolationMethod;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.InterpolationMethod
	 */
	public void setInterpolationMethod(InterpolationMethod interpolationMethod) {
	    this.interpolationMethod = interpolationMethod;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.Boolean
	 */
	public Boolean getExtrapolationPermitted() {
	    return this.extrapolationPermitted;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.Boolean
	 */
	public void setExtrapolationPermitted(Boolean extrapolationPermitted) {
	    this.extrapolationPermitted = extrapolationPermitted;
	}
	/**
	 * public getter
	 *
     * @returns java.util.List<com.leansoft.fpml.nano.TermPoint>
	 */
	public List<TermPoint> getPoint() {
	    return this.point;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<com.leansoft.fpml.nano.TermPoint>
	 */
	public void setPoint(List<TermPoint> point) {
	    this.point = point;
	}

}