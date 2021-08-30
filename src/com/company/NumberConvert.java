package com.company;

import java.util.ArrayList;

public class NumberConvert {
    public static String checkRome (String str) {
        if (str.contains("V")) {
            return String.valueOf(romeToArab(str) + 1);
        } else if (str.contains("I")) {
            return String.valueOf(romeToArab(str) + 1);
        } else if (str.contains("X")) {
            return String.valueOf(romeToArab(str) + 1);
        }
        return str;
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

    }




