package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Давайте посчитаем");
        String str = sc.nextLine();
        String[] result = str.split(" ");
        int a = Integer.parseInt(result[0]);
        int b = Integer.parseInt(result[2]);
        String oper = result[1];

        if (a <= 0 & b >= 10 || b >= 0 & a >= 10){
            System.out.println("Ошибка, выбран не верный диапазон");
        } else if (oper.contains("-")) {
            System.out.println(a - b);
        } else if (oper.contains("*")){
            System.out.println(a * b);
        } else if (oper.contains("/")) {
            System.out.println(a / b);
        } else if (oper.contains("+"))  {
            System.out.println(a + b);
        }


    }

}

