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

        String[] result = str.split(" ");
            int a = parseInt(NumberConvert.checkRome(result[0]));
            int b = parseInt (NumberConvert.checkRome(result[2]));
        String operator = result[1];
        if (a == 0 || a >= 10 || b == 0 || b >= 10){
            System.out.println("Ошибка, выбран не верный диапазон");
        } else if (operator.contains("-")){
            System.out.println(a - b);
        } else if (operator.contains("*")){
            System.out.println(a * b);
        } else if (operator.contains("/")){
            System.out.println(a / b);
        } else if (operator.contains("+")){
            System.out.println(a + b);
        }
        }

    }

}

