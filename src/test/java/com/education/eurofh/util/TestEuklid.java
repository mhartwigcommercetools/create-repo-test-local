package com.education.eurofh.util;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import com.education.eurofh.util.Euklid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;


@RunWith(JUnitParamsRunner.class)
public class TestEuklid {

    private Euklid myEuklid;

    @Before
    public void before() {
        myEuklid = new Euklid();
    }

    @After
    public void after() {
        myEuklid = null;
    }

    @Test
    @Parameters({
            "12                ,   14                      ,   2",
            "14                ,   14                      ,   14",
            "15                ,   5                       ,   5",
            "9                 ,   10                      ,   1",
            "10                ,   9                       ,   1",
            "10                ,   5                       ,   5"
    })
    public void testCalculateBMI(int numberA, int numberB, int ggT) {
        try {
            assertEquals(
                    ggT,
                    myEuklid.greatestCommonDevisor(numberA, numberB)
            );
        } catch (NoPositiveIntegerException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Parameters({
            "0                 ,   14",
            "14                ,   0",
            "-5                ,   5",
            "9                 ,   -1"
    })
    public void testCalculateBMI_Exceptions(int numberA, int numberB) {
        boolean hasThrownException = false;
        try {
            int ggT = myEuklid.greatestCommonDevisor(numberA, numberB);
        } catch (NoPositiveIntegerException e) {
            hasThrownException = true;
        }
        assertTrue(hasThrownException);
    }

    @Test
    @Parameters({
            "0                 ,   14",
            "14                ,   0",
            "-5                ,   5",
            "9                 ,   -1"
    })
    public void testCalculateBMI_Exceptions_Short(int numberA, int numberB) {
        Assertions.assertEquals(
                "Number not positive.",
                assertThrows(NoPositiveIntegerException.class, () -> {
                    myEuklid.greatestCommonDevisor(numberA, numberB);
                }).getMessage());
    }



}
