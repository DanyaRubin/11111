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
        String c = result[1];
        if (c.contains("+"))  {
            System.out.println(a + b);
        } else if (c.contains("-")) {
            System.out.println(a - b);
        } else if (c.contains("*")){
            System.out.println(a * b);
        } else if (c.contains("/")){
            System.out.println(a / b);
        }
    }
}
