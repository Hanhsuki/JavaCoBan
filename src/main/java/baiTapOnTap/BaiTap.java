package baiTapOnTap;

// Link bài tập: https://freetuts.net/hoc-java/bai-tap-java
public class BaiTap {
    public static void main(String[] args) {
        bai1(5, 6);
        bai2(5);
    }
// Bài 1: Cộng hai số trong Java
    public static void bai1(int a, int b){
        int sum;
        sum = a +b;
        System.out.println("Tổng hai số: " + sum);
    }
// Bài 2: Kiểm tra 1 số là số chẵn hay số lẻ
    public static void bai2(int a) {
        int result;
        result = a % 2;
        if (result == 0) {
            System.out.println("Số a là số chăn");
        } else {
            System.out.println("Số a là số lẻ");
        }

    }
// Bài 3; Cộng hai số phức
    public static void bai3(){

        }

    }




}
