package com.github.m_sulkouski.java_mentor;

class NumericConverter {


    int arabicToInteger(String arabicNumber) {
        int number;
        try {
            number = Integer.parseInt(arabicNumber);
        }
        catch (NumberFormatException e) {
            if (romanToInteger(arabicNumber) == 0)
                throw e;

            return 0;
        }
        if (number > 0 && number <= 10)
            return number;

        return 0;
    }

    int romanToInteger(String romanNumber) {
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

    String integerToRoman(int number) {
        switch (number) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
                default:
                    return null;
        }
    }
}
