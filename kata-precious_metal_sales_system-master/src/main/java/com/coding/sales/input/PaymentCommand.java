package com.coding.sales.input;

import java.math.BigDecimal;

/**
 * @author 
 *	支付方式
 */
public class PaymentCommand {
    String type;
    BigDecimal amount;

    public PaymentCommand(String type, BigDecimal amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
