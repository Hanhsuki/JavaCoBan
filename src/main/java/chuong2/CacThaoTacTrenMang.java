package chuong2;

import java.util.Scanner;

public class CacThaoTacTrenMang {
    public static void main(String[] args) {
//        bai1();
//        bai2();
        bai3();

    }

    //Truy cập vào các phần tử trên mảng
    public static void bai1() {
        int[] arr1 = {10,20,30,40,50};
        int lengthArr = arr1.length;
        System.out.println(lengthArr);
        System.out.println(arr1[lengthArr - 1]);

        int leng = lengthArr;
        for (int i = 0; i < leng; i++){
            System.out.printf("Phần tử thứ %d: %d %n",i,arr1[i]);
        }
        //Cách viết mới của vòng for, thông qua 1 biến để truy cập từng phần tử trong mảng
        for (int n:arr1){
            System.out.println(n);
        }
    }
    //Nhập mảng
    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();

        int[] arrNumber = new int[length];
        for (int i = 0;i <length; i++){
            System.out.printf("Phần tử thư %d: %n",i);
            arrNumber[i] = sc.nextInt();
            sc.nextLine();
        }

        sc.close();
        for (int i = 0; i < length; i++) {
            System.out.printf("Phần tử thứ %d: %d %n", i, arrNumber[i]);
        }
    }
    //Sum, Max, Min của mảng
    public static void bai3() {
        int[] arr1 = {10,50,90,30};
        int sum = 0;
        int min = arr1[0];
        int max = arr1[0];

        for (int number : arr1){
            sum = sum + number;
            if (min > number) min = number;
            if (max < number) max = number;
        }
        System.out.println("Tổng mảng:" + sum);
        System.out.println("Min mảng:" + min);
        System.out.println("Max mảng:" + max);

    }

}
