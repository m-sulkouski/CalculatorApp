package com.github.m_sulkouski.java_mentor;

interface NumberConverter {


    default int convertToArabic(String arabicNumber) {
        int number;
        try {
            number = Integer.parseInt(arabicNumber);
        }
        catch (NumberFormatException e) {
            if (romanToArabic(arabicNumber) == 0)
                throw e;

            return 0;
        }
        if (number > 0 && number <= 10)
            return number;

        return 0;
    }

    default int romanToArabic(String romanNumber) {
        switch (romanNumber.toUpperCase()) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        return 0;
    }
}
