package com.epam.gradle.task;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    private StringUtils() {}

    public static boolean isPositiveNumber(String str) {
        boolean isNumber = NumberUtils.isParsable(str);
        if (!isNumber) {
            throw new NumberFormatException("The value you entered is not valid");
        }

        return !org.apache.commons.lang3.StringUtils.startsWith(str, "-");
    }
}
