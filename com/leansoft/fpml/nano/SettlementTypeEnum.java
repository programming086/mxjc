// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * Shows how the transaction is to be settled when it is exercised.
 */
public enum SettlementTypeEnum {

    /**
     * The intrinsic value of the option will be delivered by way of a cash settlement amount determined, (i) by reference to the differential between the strike price and the settlement price; or (ii) in accordance with a bilateral agreement between the parties
     */
    CASH("Cash"),
  

    /**
     * Allow Election of either Cash or Physical settlement
     */
    ELECTION("Election"),
  

    /**
     * The securities underlying the transaction will be delivered by (i) in the case of a call, the seller to the buyer, or (ii) in the case of a put, the buyer to the seller versus a settlement amount equivalent to the strike price per share
     */
    PHYSICAL("Physical");
  
  
    private final String value;
  
    SettlementTypeEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SettlementTypeEnum fromValue(String v) {
        if (v != null) {
            for (SettlementTypeEnum c: SettlementTypeEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}