package baiTapOnTap;

import java.sql.SQLOutput;
import java.util.Scanner;

// Link bài tập: https://freetuts.net/hoc-java/bai-tap-java
public class BaiTapCanBan {
    public static void main(String[] args) {
//        bai1(5, 6);
//        bai2(5);
//        ComplexNumber.bai3();
//        bai4(3,5);
//        bai5();
//        bai6(2000, 5, 0.08, 12);
//        bai7(2000,6,3);
        bai8(50,20);
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
// Bài 3: Cộng hai số phức
    public static class ComplexNumber {
        double real, img;

        public ComplexNumber(double real, double img) {
            this.real = real;
            this.img = img;
        }
        public static ComplexNumber sum(ComplexNumber a, ComplexNumber b){
            ComplexNumber temp = new ComplexNumber(0, 0);

            temp.real = a.real + b.real;// cộng các phần thực
            temp.img = a.img + b.img;// cộng các phần ảo

            return temp;
        }
        public static void bai3(){
            ComplexNumber c1 = new ComplexNumber(5.2, 4.4);
            ComplexNumber c2 = new ComplexNumber(2.0, 7.3);
            ComplexNumber temp = sum(c1,c2);
            System.out.println("Tổng 2 số phức là: " + temp.real + " + " + temp.img + "i");
        }
    }
// Bài 4: Nhân 2 số nguyên trong java
    public static void bai4(int a, int b){
        int multiplication;
        multiplication = a*b;
        System.out.println("Tích hai số nguyên: " + multiplication);
    }
// Bài 5: Kiểm tra nguyên âm và phụ âm
    public static void bai5(){
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ký tự cần kiểm tra: ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch (ch){
            case 'a' :
            case 'i' :
            case 'u' :
            case 'e' :
            case 'o' :
            case 'A' :
            case 'I' :
            case 'U' :
            case 'E' :
            case 'O' :  isVowel = true;
        }
        if (isVowel==true){
            System.out.println("ch là nguyên âm");
        }else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("ch là phụ âm");
        }else {
            System.out.println("ch không thuộc bảng chữ cái");
        }
    }
/* Bài 6: Tính lãi xuất kép trong java
Công thức tính lãi kép: P (1 + R/n)^(nt) - P
Trong đó:
P là số tiền gốc.
R là lãi xuất hàng năm.
t là thời gian tiền được đầu tư hoặc vay.
n là số lần lãi được gộp trên mỗi đơn vị t, nếu lãi được gộp hàng tháng và t tính bằng năm thì n bằng 12.
Nếu lãi được gộp hành quý và t tính bằng năm thì n bằng 4.
*/
    public static void bai6(int p, int t, double r, int n) {
        double amount = p*Math.pow((1+r/n),(n*t));
        double cinterest = amount - p;
        System.out.println("Lãi xuất sau " + t + "năm là: " + cinterest);
        System.out.println("Tổng tiền có được sau " + t + "năm là: " + amount);
    }
/* Tính lãi xuất trong java.
Lãi xuất = (P × R × T)/100
Trong đó:
P là số tiền gốc
R là lãi xuất mỗi năm
T là thời gian (tính bằng năm)
 */
    public static void bai7(int p, int r, int t){
        double crinterest = (p*r*t)/100;
        System.out.println("Lãi xuất của " + t + "năm là: " + crinterest);
    }
//Tìm phần nguyên và phần dư khi chia 2 sổ
    public static void bai8(int num1, int num2){
        int phanNguyen = num1/num2;
        int phanDu = num1%num2;
        System.out.println("Phần nguyên là: " + phanNguyen);
        System.out.println("Phần dư là: " + phanDu);
    }
}





