package com.education.eurofh.bmi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBMICalculatorFloat {

    private BMICalculatorFloat myBmiCalculatorFloat;

    @Before
    public void before() {
        myBmiCalculatorFloat = new BMICalculatorFloat();
    }

    @After
    public void after() {
        myBmiCalculatorFloat = null;
    }

    @Test
    public void testCalculateBMI_1() {
        assertEquals(25.6f,
                    myBmiCalculatorFloat
                            .calculateBMI(80.2f, 177.0f),
                    0.1f);
    }


}
