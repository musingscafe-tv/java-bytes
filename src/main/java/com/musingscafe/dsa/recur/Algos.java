package com.musingscafe.dsa.recur;

import java.util.Objects;

public class Algos {
    public static char[] reverseString(char[] str) {
        if (Objects.isNull(str) || str.length <= 0) {
            return str;
        }

        int i = 0;
        int j = str.length - 1;
        reverseHelper(i, j, str);

        return str;
    }

    private static void reverseHelper(int i, int j, char[] str) {
        if (i < 0 || j > str.length - 1) {
            throw new RuntimeException("Index out of bounds");
        }

        if (i >= j) {
            return;
        }

        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

        reverseHelper(i + 1, j - 1, str);
    }
}
