package com.commercetools.money;

public class Main {

    public static void main(String[] args) {
        final Money a = new Money(67.89, "EUR"); //pass 67.89 EUR as parameters

        final Money b = new Money(98.76,"USD"); //pass 98.76 USD as parameters

        System.out.println(a);
        System.out.println(b);
    }
}
