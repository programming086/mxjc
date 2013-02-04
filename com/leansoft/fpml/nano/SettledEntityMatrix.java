// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

@RootElement(name = "settledEntityMatrix", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class SettledEntityMatrix implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private MatrixSource matrixSource;
	
	@Element
	private Date publicationDate;
	
    
	/**
     * public getter
     *
     * Relevant settled entity matrix source.
     *
     * @returns com.leansoft.fpml.nano.MatrixSource
	 */
	public MatrixSource getMatrixSource() {
	    return this.matrixSource;
	}
	
	/**
	 * public setter
	 *
     * Relevant settled entity matrix source.
     *
     * @param com.leansoft.fpml.nano.MatrixSource
	 */
	public void setMatrixSource(MatrixSource matrixSource) {
	    this.matrixSource = matrixSource;
	}
	/**
     * public getter
     *
     * Specifies the publication date of the applicable version of the matrix. When this element is omitted, the Standard Terms Supplement defines rules for which version of the matrix is applicable.
     *
     * @returns java.util.Date
	 */
	public Date getPublicationDate() {
	    return this.publicationDate;
	}
	
	/**
	 * public setter
	 *
     * Specifies the publication date of the applicable version of the matrix. When this element is omitted, the Standard Terms Supplement defines rules for which version of the matrix is applicable.
     *
     * @param java.util.Date
	 */
	public void setPublicationDate(Date publicationDate) {
	    this.publicationDate = publicationDate;
	}

}