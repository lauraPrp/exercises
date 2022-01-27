package com.techreturners.exercises_mix;

import java.util.LinkedHashMap;

public class RomanNumeralsKata {

    private final LinkedHashMap<Integer, String> mapArabicRoman = new LinkedHashMap<>();

    public RomanNumeralsKata() {
        mapArabicRoman.put(1000, "M");
        mapArabicRoman.put(900, "CM");
        mapArabicRoman.put(500, "D");
        mapArabicRoman.put(400, "CD");
        mapArabicRoman.put(100, "C");
        mapArabicRoman.put(90, "XC");
        mapArabicRoman.put(50, "L");
        mapArabicRoman.put(40, "XL");
        mapArabicRoman.put(10, "X");
        mapArabicRoman.put(9, "IX");
        mapArabicRoman.put(5, "V");
        mapArabicRoman.put(4, "IV");
        mapArabicRoman.put(1, "I");
    }

    public String convertToRomanNumber(int number) {
        StringBuilder buildRomanNumber = new StringBuilder();

        while (number > 0) {
            for(int arabicNumber : mapArabicRoman.keySet()) {
                if (number >= arabicNumber) {
                    buildRomanNumber.append(mapArabicRoman.get(arabicNumber));
                    number -= arabicNumber;
                    break;
                }
            }
        }
        return buildRomanNumber.toString();
    }

}

