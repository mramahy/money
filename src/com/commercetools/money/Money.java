package com.commercetools.money;

import java.util.Currency;
import java.util.Locale;

public final class Money {
    private Double value;
    private Currency currency;

    public Money(Double value){
        this.value = value;
        this.currency = Currency.getInstance(Locale.getDefault());
    }

    public Money(Double value, String currencyCode){
        this.value = value;
        this.currency = Currency.getInstance(currencyCode);
    }


    public Money multiplyBy(int factor) {

        this.value = this.value * factor;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return value +" "+ currency.toString() ;
    }
}