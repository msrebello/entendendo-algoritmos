package com.github.msrebello._05.checkout;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

public class CheckoutHashTableDemo {

    public static void main(String[] args) {
        Map<String, BigDecimal> itemsPrices = new Hashtable<>();

        itemsPrices.put("Apple", new BigDecimal("4.50"));
        itemsPrices.put("Avocado", new BigDecimal("6.00"));
        itemsPrices.put("Lemon", new BigDecimal("1.20"));
        itemsPrices.put("Orange", new BigDecimal("5.00"));

        printItemsAndTheirPrices(itemsPrices);
    }

    private static void printItemsAndTheirPrices(Map<String, BigDecimal> itemsPrices) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        itemsPrices.forEach((item, price) -> {
            String dollarPrice = format.format(price);
            System.out.printf("Item: %s - Price: %s\n", item, dollarPrice);
        });
    }

}
