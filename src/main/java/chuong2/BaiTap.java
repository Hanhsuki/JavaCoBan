package chuong2;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
//        bai1();
//        bai2();
        bai3();
    }

    //Nhập từ bàn phím 1 ma trận vuông và in ra các phần từ phía trên và phía dưới đường chéo của ma trận
    public static void bai1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số dòng:");
        int row = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập số cột:");
        int column = sc.nextInt();
        sc.nextLine();

        while (row != column) {
            System.out.println("Nhập lại số côt:");
            column = sc.nextInt();
            sc.nextLine();
        }
        int[][] arrNumber = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Nhập phần tử hàng %d cột %d:", i, j);
                arrNumber[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        sc.close();
        System.out.println(Arrays.deepToString(arrNumber));

        for (int indexRow = 0; indexRow < row - 1; indexRow++) {
            for (int indexColumn = indexRow; indexColumn < column - 1; indexColumn++){
                System.out.println(arrNumber[indexRow][indexColumn + 1]);
                System.out.println(arrNumber[indexColumn + 1][indexRow]);
        }
    }

    }

//Tìm các phần tử lớn nhất trên mỗi dòng và tính tổng các phần tử đó
    public static void bai2() {
        int[][] arrInt = {{2,3,5},{3,9,7}};
        int sum=0;
        int length = arrInt.length;
        int lengthColumn = arrInt[0].length;
        for (int i=0; i<length; i++){
            Arrays.sort(arrInt[i]);
            System.out.printf("Phần từ lớn nhất dòng %d: %d %n",i+1,arrInt[i][lengthColumn-1]);
            sum=sum +arrInt[i][lengthColumn-1];
        }
        System.out.println(sum);
    }
//Sắp xếp ma trận tăng dần
    public static void bai3() {
        int[][] arrInt = {{2,3,5},{3,9,7}};
        int length = arrInt.length;
        for (int i=0; i<length; i++){
            Arrays.sort(arrInt[i]);
        }
        System.out.println(Arrays.deepToString(arrInt));
    }
}
