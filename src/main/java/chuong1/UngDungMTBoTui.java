package chuong1;

import java.util.Scanner;

public class UngDungMTBoTui {
    public static void main(String[] args) {
        bai1();
    }

    public static void bai1() {
        int number1;
        int number2;
        int result = 0;
        String caculate;
        Scanner sc = new Scanner(System.in);

        System.out.println("Number First: ");
        number1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Number Second: ");
        number2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Caculate: ");
        caculate = sc.nextLine();
        sc.close();

        switch (caculate){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
            case "*":
                result = number1 * number2;
            case "/":
                result = number1 / number2;
            case "%":
                result = number1 % number2;
            default:
                result = number1 + number2;
                break;
        }
        System.out.printf("%d %s %d = %d", number1,caculate,number2,result);
    }

}
