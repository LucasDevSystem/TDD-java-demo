package com.tdd.demo;

import static org.junit.Assert.assertEquals;

class DollarTest {
    
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}