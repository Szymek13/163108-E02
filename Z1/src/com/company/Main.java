package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Integer[] sortInteger = {1, 2, 3, 2, 1};
        Integer[] niesortInteger = {3, 5, 7, 3, 1};
        LocalTime[] sortLocalTime = {LocalTime.of(12,30), LocalTime.of(23,34), LocalTime.of(23,45)};
        LocalTime[] niesortLocalTime = {LocalTime.of(12,30), LocalTime.of(23,34), LocalTime.of(12,30)};
        ArrayUtil.jestPalindromem(sortInteger);
        ArrayUtil.jestPalindromem(niesortInteger);
        ArrayUtil.jestPalindromem(sortLocalTime);
        ArrayUtil.jestPalindromem(niesortLocalTime);
    }
}
