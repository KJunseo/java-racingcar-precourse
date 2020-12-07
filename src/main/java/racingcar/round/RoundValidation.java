package racingcar.round;

import racingcar.Constant;

public class RoundValidation {
    public static void validation(String number) {
        isNumber(number);
        isPositiveInteger(number);
    }

    private static void isNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            char num = number.charAt(i);

            if (!Character.isDigit(num)) {
                throw new IllegalArgumentException(Constant.ERROR_RACE_ROUND);
            }
        }
    }

    private static void isPositiveInteger(String number) {
        int num = Integer.parseInt(number);

        if (num < Constant.MIN_RACE_ROUND) {
            throw new IllegalArgumentException(Constant.ERROR_RACE_ROUND_NON_POSITIVE_INTEGER);
        }
    }
}
