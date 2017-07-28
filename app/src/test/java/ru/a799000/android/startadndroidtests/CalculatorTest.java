package ru.a799000.android.startadndroidtests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 28.07.2017.
 */
public class CalculatorTest {

    Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        System.out.println("\r\nsetUp");
         mCalculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void add() throws Exception {
        System.out.println("add");
        assertEquals(9, mCalculator.add(6,3));
    }

    @Test
    public void multiply() throws Exception {
        System.out.println("multiply");
        assertEquals(18, mCalculator.multiply(6,3));
    }

}