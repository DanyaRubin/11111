package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
public static void main(String[] args) {
    System.out.println("Давайте посчитаем (для завершения введите : exit)");
    Scanner sc = new Scanner(System.in);

    while (true) {
        String str = sc.nextLine();
        if (str.equals("exit")) {
            System.out.println("Bye...");
            break;
        }
        NumberConvert.stopRome(str);
        String[] result = str.split(" ");


        int a = parseInt(NumberConvert.checkRome(result[0]));
        int b = parseInt(NumberConvert.checkRome(result[2]));
        String operator = result[1];

        if (str.contains("V")) {
            NumberConvert.finalConvertRome(a, b, operator);
        } else if (str.contains("I")) {
            NumberConvert.finalConvertRome(a, b, operator);
        } else if (str.contains("X")) {
            NumberConvert.finalConvertRome(a, b, operator);
        } else {
            NumberConvert.finalConvertArab(a, b, operator);
        }
    }

}

}


