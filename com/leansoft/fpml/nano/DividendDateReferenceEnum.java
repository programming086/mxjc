// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The reference to a dividend date.
 */
public enum DividendDateReferenceEnum {

    /**
     * Date on which a holder of the security is entitled to the dividend.
     */
    EX_DATE("ExDate"),
  

    /**
     * Date on which the dividend will be paid by the issuer.
     */
    DIVIDEND_PAYMENT_DATE("DividendPaymentDate"),
  

    /**
     * Date on which the dividend will be recorded in the books of the paying agent.
     */
    RECORD_DATE("RecordDate"),
  

    /**
     * Termination date of the swap.
     */
    TERMINATION_DATE("TerminationDate"),
  

    /**
     * Equity payment date of the swap.
     */
    EQUITY_PAYMENT_DATE("EquityPaymentDate"),
  

    /**
     * The next payment date of the swap.
     */
    FOLLOWING_PAYMENT_DATE("FollowingPaymentDate"),
  

    /**
     * The dividend date will be specified ad hoc by the parties, typically on the dividend ex-date
     */
    AD_HOC_DATE("AdHocDate"),
  

    /**
     * Total of paid dividends, paid on next following Cash Settlement Payment Date, which is immediately following the Dividend Period during which the dividend is paid by the Issuer to the holders of record of a Share.
     */
    CUMULATIVE_EQUITY_PAID("CumulativeEquityPaid"),
  

    /**
     * Total of paid dividends, paid on next following Payment Date, which is immediately following the Dividend Period during which the dividend is paid by the Issuer to the holders of record of a Share.
     */
    CUMULATIVE_LIBOR_PAID("CumulativeLiborPaid"),
  

    /**
     * Total of dividends which go ex, paid on next following Cash Settlement Payment Date, which is immediately following the Dividend Period during which the Shares commence trading ex-dividend on the Exchange
     */
    CUMULATIVE_EQUITY_EX_DIV("CumulativeEquityExDiv"),
  

    /**
     * Total of dividends which go ex, paid on next following Payment Date, which is immediately following the Dividend Period during which the Shares commence trading ex-dividend on the Exchange, or where the date on which the Shares commence trading ex-dividend is a Payment Date, such Payment Date.
     */
    CUMULATIVE_LIBOR_EX_DIV("CumulativeLiborExDiv"),
  

    /**
     * If "Dividend Payment Date(s)" is specified in the Transaction Supplement as "Share Payment", then the Dividend Payment Date in respect of a Dividend Amount shall fall on a date on or before the date that is two (or any other number that is specified in the Transaction Supplement) Currency Business Days following the day on which the Issuer of the Shares pays the relevant dividend to holders of record of the Shares
     */
    SHARE_PAYMENT("SharePayment"),
  

    /**
     * If "Dividend Payment Date(s)" is specified in the Transaction Supplement as "Cash Settlement Payment Date", then the Dividend Payment Date in respect of a Dividend Amount shall be the Cash Settlement Payment Date relating to the end of the Dividend Period during which the Shares commenced trading "ex" the relevant dividend on the Exchange
     */
    CASH_SETTLEMENT_PAYMENT_DATE("CashSettlementPaymentDate"),
  

    /**
     * If "Dividend Payment Date(s)" is specified in the Transaction Supplement as "Floating Amount Payment Date", then the Dividend Payment Date in respect of a Dividend Amount shall be the first Payment Date falling at least one Settlement Cycle after the date that the Shares have commenced trading "ex" the relevant dividend on the Exchange.
     */
    FLOATING_AMOUNT_PAYMENT_DATE("FloatingAmountPaymentDate");
  
  
    private final String value;
  
    DividendDateReferenceEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DividendDateReferenceEnum fromValue(String v) {
        if (v != null) {
            for (DividendDateReferenceEnum c: DividendDateReferenceEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}