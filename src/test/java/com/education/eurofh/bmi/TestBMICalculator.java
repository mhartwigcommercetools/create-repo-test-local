package com.education.eurofh.bmi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBMICalculator {

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
    public void testCalculateBMI_1() {
        int heightInCM = 177;
        int weightInKG = 85;
        int bmiExpected = 27;
        int bmiCalculated = myBmiCalculator
                .calculateBMI(weightInKG, heightInCM);
        assertEquals(bmiExpected, bmiCalculated);
    }

    @Test
    public void testCalculateBMI_2() {
        int heightInCM = 177;
        int weightInKG = -5;
        int bmiExpected = 0;
        int bmiCalculated = myBmiCalculator
                .calculateBMI(weightInKG, heightInCM);
        assertEquals(bmiExpected, bmiCalculated);
    }

    @Test
    public void testCalculateBMI_3() {
        int heightInCM = 177;
        int weightInKG = 233;
        int bmiExpected = 0;
        int bmiCalculated = myBmiCalculator
                .calculateBMI(weightInKG, heightInCM);
        assertEquals(bmiExpected, bmiCalculated);
    }

    @Test
    public void testCalculateBMI_4() {
        int heightInCM = 78;
        int weightInKG = 85;
        int bmiExpected = 0;
        int bmiCalculated = myBmiCalculator
                .calculateBMI(weightInKG, heightInCM);
        assertEquals(bmiExpected, bmiCalculated);
    }

    @Test
    public void testCalculateBMI_5() {
        int heightInCM = 820;
        int weightInKG = 85;
        int bmiExpected = 0;
        int bmiCalculated = myBmiCalculator
                .calculateBMI(weightInKG, heightInCM);
        assertEquals(bmiExpected, bmiCalculated);
    }

    @Test
    public void testCalculateBMIRecommendation_1() {
        assertEquals("Your BMI is fine.",
                        myBmiCalculator
                            .calculateBMIRecommendation(85, 177)
        );
    }

}
