package com.education.eurofh.bmi;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBMICalculatorParametrized {

    private BMICalculator myBmiCalculator;

    @Before
    public void before() {
        myBmiCalculator = new BMICalculator();
    }

    @After
    public void after() {
        myBmiCalculator = null;
    }

    @Test
    @Parameters({
            "177                ,   85                      ,   27",
            "177                ,   -5                      ,   0",
            "177                ,   233                     ,   0",
            "78                 ,   85                      ,   0",
            "820                ,   85                      ,   0"
    })
    public void testCalculateBMI(int heightInCM, int weightInKG, int bmiExpected) {
        int bmiCalculated = myBmiCalculator
                .calculateBMI(weightInKG, heightInCM);
        assertEquals(bmiExpected, bmiCalculated);
    }

}
