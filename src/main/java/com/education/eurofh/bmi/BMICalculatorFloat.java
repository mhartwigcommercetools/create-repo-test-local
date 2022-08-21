package com.education.eurofh.bmi;

public class BMICalculatorFloat {

    public float calculateBMI(float weightInKG, float heightInCM) {
        return
                (10000 * weightInKG) / (heightInCM * heightInCM);
    }

    public static void main(String[] args) {

        float heightInCM = 177.0f;
        float weightInKG = 80.2f;
        float bmi = new BMICalculatorFloat()
                    .calculateBMI(weightInKG, heightInCM);
        System.out.printf("""
                    Input height in centimeters: %s
                    Input weight in kilogram: %s
                    The Body Mass Index (BMI) is %s kg/m2
                    """, heightInCM, weightInKG, bmi);
    }
}

