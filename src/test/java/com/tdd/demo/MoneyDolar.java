package com.tdd.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyDolar {
        @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
}
