import java.util.Scanner;


public class scanerNew {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Давайте посчитаем");
    String str = sc.nextLine();
    String[] result = str.split(" ");
    int a = Integer.parseInt(result[0]);
    int b = Integer.parseInt(result[2]);
    String c = result[1];
}
}
