package ru.moshik.tm.algorithm;

import java.util.regex.Pattern;

public class StringValidator {

    /**
     *
     * @param input - строка для валидации
     * @return - результат валидации
     */
    public boolean validate(String input) {
        return checkString(input);
    }

    private boolean checkString(String input) {
        int count_open = 0;

        if (!Pattern.matches("\\(*\\)*", input)) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            if (')' == input.charAt(i) && i == 0) {
                return false;
            }

            if ('(' == input.charAt(i)) {
                count_open++;
            } else break;
        }

        int border = 2*count_open;

        for (int i = count_open; i < 2*count_open; i++) {
            if (')' == input.charAt(i)) {
                count_open--;
            }
        }

        if (count_open == 0) {
            return checkString(input.substring(border));
        }

        return false;


    }

}
