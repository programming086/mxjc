// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The type of averaging used in an Asian option.
 */
public enum AveragingInOutEnum {

    /**
     * The average price is used to derive the strike price. Also known as "Asian strike" style option.
     */
    IN("In"),
  

    /**
     * The average price is used to derive the expiration price. Also known as "Asian price" style option.
     */
    OUT("Out"),
  

    /**
     * The average price is used to derive both the strike and the expiration price.
     */
    BOTH("Both");
  
  
    private final String value;
  
    AveragingInOutEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static AveragingInOutEnum fromValue(String v) {
        if (v != null) {
            for (AveragingInOutEnum c: AveragingInOutEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}