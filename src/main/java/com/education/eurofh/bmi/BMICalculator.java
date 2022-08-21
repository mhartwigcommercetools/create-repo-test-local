package com.education.eurofh.bmi;

enum Gender {
    FEMALE, MALE, OTHER
}

public class BMICalculator {

    public int calculateBMI(int weightInKG, int heightInCM, Gender gender) {

        // Gender not taken into account
        return
                (10000 * weightInKG) / (heightInCM * heightInCM);
    }

    public int calculateBMI(int weightInKG, int heightInCM) {
        return
                (10000 * weightInKG) / (heightInCM * heightInCM);
    }

    /**
     *
     * @param weightInKG: Ganzahliger Wert für das Gewicht zwischen 31 und 200 kg
     * @param heightInCM: Ganzahliger Wert für die Größe zwischen 101 und 250 cm
     * @return Ganzzahliger Wert für den BMI oder 0 bei falschen Eingaben
     */
    public int calculateBMICorrected(int weightInKG, int heightInCM) {
        if (weightInKG <= 30 || weightInKG >= 201 || heightInCM <= 100 || heightInCM >= 251)
            return 0;
        return
                (10000 * weightInKG) / (heightInCM * heightInCM);
    }

    public int calculateBMICorrectedException(int weightInKG, int heightInCM) throws NotAllowedWeightException{
        if (weightInKG <= 30) throw new NotAllowedWeightException("Your weight is too low.");
        if (weightInKG >= 201) throw new NotAllowedWeightException("Your weight is too high.");

        return
                (10000 * weightInKG) / (heightInCM * heightInCM);
    }



    public String calculateBMIRecommendation(int weightInKG, int heightInCM) {
        int bmi = calculateBMI(weightInKG, heightInCM);
        if (bmi < 19) return "Please eat more calories.";
        if (bmi > 24) return "Please join a sports club.";
        return "Your BMI is fine.";
    }


    public static void main(String[] args) {

        int heightInCM = 200;
        int weightInKG = 99;
        int bmi = new BMICalculator()
                    .calculateBMI(weightInKG, heightInCM);
        System.out.printf("""
                    Input height in centimeters: %s
                    Input weight in kilogram: %s
                    The Body Mass Index (BMI) is %s kg/m2
                    """, heightInCM, weightInKG, bmi);
    }
}

