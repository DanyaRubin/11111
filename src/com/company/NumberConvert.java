package com.company;

import java.util.ArrayList;

public class NumberConvert {


    public static String transform_number_to_roman_numeral(int number) {
        int[] roman_value_list = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char_list = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < roman_value_list.length; i += 1) {
            while (number >= roman_value_list[i]) {
                number -= roman_value_list[i];
                res.append(roman_char_list[i]);
            }
        }
        return res.toString();
    }


    public static int romeToArab(String str) {
        ArrayList<String> rome = new ArrayList<>();
        rome.add("I");
        rome.add("II");
        rome.add("III");
        rome.add("IV");
        rome.add("V");
        rome.add("VI");
        rome.add("VII");
        rome.add("VIII");
        rome.add("IX");
        rome.add("X");
        return rome.indexOf(str);

    }

    public static String checkRome(String str) {
        if (str.contains("V")) {
            return String.valueOf(romeToArab(str) + 1);
        } else if (str.contains("I")) {
            return String.valueOf(romeToArab(str) + 1);
        } else if (str.contains("X")) {
            return String.valueOf(romeToArab(str) + 1);
        }
        return str;
    }
}



