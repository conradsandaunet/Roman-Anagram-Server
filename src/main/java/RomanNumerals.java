public class RomanNumerals {

    public static String romanNumerals(int number) {
        StringBuilder result = new StringBuilder();

        number = convertDigit(result, number, "M", 1000);
        number = convertDigit(result, number, "CM", 900);
        number = convertDigit(result, number, "D", 500);
        number = convertDigit(result, number, "CD", 400);
        number = convertDigit(result, number, "C", 100);
        number = convertDigit(result, number, "XC", 90);
        number = convertDigit(result, number, "L", 50);
        number = convertDigit(result, number, "XL", 40);
        number = convertDigit(result, number, "X", 10);
        number = convertDigit(result, number, "IX", 9);
        number = convertDigit(result, number, "V", 5);
        number = convertDigit(result, number, "IV", 4);
        number = convertDigit(result, number, "I", 1);

        return result.toString();
    }

    public static int convertDigit(StringBuilder result, int number, String digit, int digitValue) {
        while (number >= digitValue) {
            result.append(digit);
            number -= digitValue;
        }
        return number;
    }
}

