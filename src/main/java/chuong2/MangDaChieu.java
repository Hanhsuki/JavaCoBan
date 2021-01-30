package chuong2;

import java.util.Arrays;
import java.util.Scanner;

public class MangDaChieu {
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4();
        bai5();
    }
//Khai báo mảng đa chiều
    public static void bai1() {
        int[][] arrMult = new int[2][3];
        //Hàng thứ nhất
        arrMult[0][0] = 1;
        arrMult[0][1] = 18;
        arrMult[0][2] = 9;
        //Hàng thứ 2
        arrMult[1][0] = 8;
        arrMult[1][1] = 14;
        arrMult[1][2] = 13;

    }
//Thao tác với mảng đa chiều
    public static void bai2() {
        int[][] arrMult = {{1,18,9},{8,14,13}};
        int rows = arrMult.length;
        int columns = arrMult[0].length;

        for (int i = 0; i < rows; i++){
            for (int j=0; j <columns; j++){
                System.out.printf("Dòng %d cột %d : %d %n", i + 1, j + 1,arrMult[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(arrMult)); //Lệnh in mảng đa chiều.
    }
//Matrix
    public static void bai3() {
        int rows, columns;
        Scanner sc = new Scanner(System.in);

        System.out.println("Số dòng:");
        rows = sc.nextInt();
        sc.nextLine();

        System.out.println("Số cột:");
        columns = sc.nextInt();
        sc.nextLine();

        int[][] arrMult = new int[rows][columns];
        for(int i =0; i < rows; i++){
            for(int j =0; j < columns; j++){
                System.out.printf("Số dòng %d số cột %d : %n", i+1,j+1);
                arrMult[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        sc.close();
        System.out.println(Arrays.deepToString(arrMult));
    }
//Tính tổng các phần tử trên cùng 1 dòng, cùng 1 cột và đường chéo của ma trận vuông
    public static void bai4() {
        int[][] arrMult = {{1,6,8},{5,9,6},{4,9,8}};
        int sumRows=0;
        int rows=2;
        int sumColumn=0;
        int column=3;
        int length = arrMult.length;
        int sumCheo=0;

        for (int number:arrMult[rows-1]){
            sumRows +=number;
        }

        for (int number:arrMult[column-1]){
            sumColumn +=number;
        }
        for (int i=0; i<length;i++){
            sumCheo = sumCheo + arrMult[i][i];
        }

        System.out.println(sumRows);
        System.out.println(sumColumn);
        System.out.println(sumCheo);
    }

//Tìm phần tử lớn nhất trong ma trận
    public static void bai5() {
        int[][] arrMult = {{1, 6, 8}, {5, 9, 6}, {4, 9, 8}};
        int maxArr1 = arrMult[0][0];
        int row = arrMult.length;
        int column = arrMult[0].length;
        int maxArr2 = arrMult[0][0];
//Cách 1
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (maxArr1 < arrMult[i][j]) maxArr1=arrMult[i][j];
            }
        }
        System.out.println(maxArr1);
//Cách 2
        for (int i=0; i<row; i++){
            Arrays.sort(arrMult[i]);
            int lengthColumn = arrMult[i].length;
            if(maxArr2<arrMult[i][lengthColumn-1]) maxArr2=arrMult[i][lengthColumn-1];
        }
        System.out.println(maxArr2);
    }
}
