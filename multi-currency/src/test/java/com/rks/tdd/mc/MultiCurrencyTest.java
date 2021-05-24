package com.rks.tdd.mc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

import javax.management.Query;

import org.junit.jupiter.api.Test;

class MultiCurrencyTest {
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
    }

    @Test
    void testHashCode() {
        Set<Dollar> amountSet = new HashSet<>();
        amountSet.add(new Dollar(5));
        amountSet.add(new Dollar(5));
        assertEquals(1, amountSet.size());

        amountSet.add(new Dollar(6));
        assertEquals(2, amountSet.size());
    }
}
