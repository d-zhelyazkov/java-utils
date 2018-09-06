package com.xrc.util;

import java.util.Collection;

public class StringUtils {

    public static final java.lang.String EMPTY_STRING = "";

    public static String join(CharSequence delimiter, Object... elements) {
        return join(java.util.Arrays.asList(elements), delimiter);
    }

    public static <T> String join(Collection<T> elements, CharSequence delimiter) {
        CharSequence[] objects = elements.stream()
                .map(StringUtils::toString)
                .filter(str -> !str.equals(EMPTY_STRING))
                .toArray(CharSequence[]::new);

        return String.join(delimiter, objects);
    }

    public static boolean isBlank(String string) {
        if (string == null) {
            return true;
        }

        string = string.trim();
        return (string.length() == 0);
    }

    public static String toString(Object o) {
        if (o == null) {
            return EMPTY_STRING;
        }

        String result = o.toString();
        if (isBlank(result)) {
            return EMPTY_STRING;
        }

        return result;
    }
}
