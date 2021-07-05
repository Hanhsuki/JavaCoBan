package baiTapOnTap;

import java.text.DecimalFormat;

public class Number {
    public static void main(String[] args) {
//        bai1_1();
//        bai1_2();
//        bai2(2,7);
//        bai3_1(56);
//        bai3_2(156);
//        bai4(45654);
//        bai5(6);
//        bai6_1(2.6598);
//        bai6_2(2.6598);
//        bai7(6);
//        bai8(6);
//        bai9(10);
//        bai10(3);
//        bai11(56565);
//        bai12(5);
        bai13(153);

    }
// Bài 1: Hoán đổi 2 số. Cách 1 dùng thuật toán gán
    public static void bai1_1(){
        int num1 = 20;
        int num2 = 10;
        int temp;
        System.out.println("Số 1 trước khi hoán đổi: " + num1);
        System.out.println("Số 2 trước khi hoán đổi: " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Số 1 sau khi hoán đổi: " + num1);
        System.out.println("Số 2 sau khi hoán đổi: " + num2);
    }
// Cách 2 dùng thuật toán phép trừ.
    public static void bai1_2(){
        int num1 = 20;
        int num2 = 10;
        System.out.println("Số 1 trước khi hoán đổi: " + num1);
        System.out.println("Số 2 trước khi hoán đổi: " + num2);
        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;
        System.out.println("Số 1 sau khi hoán đổi: " + num1);
        System.out.println("Số 2 sau khi hoán đổi: " + num2);
    }
// Bài 2: Tìm bội chung nhỏ nhất (ngoài ra ta có thế tìm BCNN bằng UCNN: BCNN = (a*b)/UCNN)
    public static void bai2(int num1, int num2){
        int lcm; //lowest common multiple
        lcm = (num1 > num2) ? num1 : num2;
        while (true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                System.out.println("Bội chung nhỏ nhất là: " + lcm);
                break;
            }
            lcm++;
        }
    }
// Bài 3: Đảo ngược 1 số tự nhiên bằng vòng lặp While
    public static void bai3_1(int number){
        int revert = 0;
        while (number != 0){
            int digit = number % 10;
            revert = revert*10 + digit;
            number = number/10;
        }
        System.out.println("Số đảo ngược là: " + revert);
    }
// Đảo ngược 1 số tự nhiên bằng vòng lặp For
    public static void bai3_2(int number) {
        int revert = 0;
        for(; number != 0; number/=10){
            int digit = number % 10;
            revert = revert*10 + digit;
        }
        System.out.println("Số đảo ngược là: " + revert);
    }
// Bài 4: Kiểm tra số đồi xứng
    public static void bai4(int number){
        int revert = 0;
        int original = number;
        for(; number != 0; number/=10){
            int digit = number % 10;
            revert = revert*10 + digit;
        }
        if(original==revert){
            System.out.println(original + " là số đối xứng");
        }
    }
// Bài 5: Kiểm tra số hoàn hảo (Số hoàn hảo là số có tổng các ước số bằng chính nó: VD: 6,28)
    public static void bai5(int number){
        int sum = 0;
        for (int i = 1; i <= number/2; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        if(sum == number){
            System.out.println(number + " là số hoàn hảo");
        }else {
            System.out.println(number + " không phải là số hoàn hảo");
        }
    }
// Bài 6: Làm tròn số với hàm format và hàm decimalformat
    public static void bai6_1(double number){
        System.out.format("Số %f sau khi được làm tròn 3 chữ số là: %.3f",number,number);
    }
    public static void bai6_2(double number){
        DecimalFormat df = new DecimalFormat("#.##"); // làm tròn 2 số sau dấu phẩy
        System.out.println("Số " + number + " sau khi làm tròn 2 chữ số là: " + df.format(number));
    }
// Bài 7: Tính tổng các số tự nhiên
    public static void bai7(int number){
        int sum = 0;
        for(int i = 1; i < number; i ++){
            sum = sum + i;
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến " + number + " là: " + sum);
    }
// Bài 8: Tìm n số nguyên tố đầu tiên
    public static void bai8(int n){
        int num = 3;
        int status = 1;
        if (n >= 1)
        {
            System.out.println(n+" Số nguyên tố đầu tiên là: ");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
// Bài 9: Tách 1 số nguyên thành nhiều chữ số
    public static void bai9(int n) {
        int num, temp, digit, count = 0;
        num = n;
        temp = num;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        while (temp > 0) {
            digit = temp % 10;
            System.out.println("Vị trí số " + count + " là: " + digit);
            temp = temp / 10;
            count--;
        }
    }
// Bài 10: Kiểm tra 1 số có phải là số nguyên tố
    public static void bai10(int number){
        boolean isPrime = true;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
            if (isPrime){
                System.out.println(number + " Là số nguyên tố");
            }else {
                System.out.println(number + " Không phải là số nguyên tố");
        }
    }
// Bài 11: Kiểm tra một số là số chính phương
    public static void bai11(double number){
        double sq = Math.sqrt(number);
        if((sq - Math.floor(sq)) == 0){  // floor là hàm làm tròn xuống
            System.out.println(number + " Là số chính phương");
        }else {
            System.out.println(number + " Không phải là số chính phương");
        }
    }
// Bài 12: Tìm căn bậc 2 của một số tự nhiên
    public static void bai12(int number){
        double temp;

        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);
        System.out.println("Căn bậc 2 của " + number + " là: " + sr);
    }
// Bài 13: In các số armstrong (Số armstrong là số có 3 chữ số mà tổng các lũy thừa của từng số bằng chính nó)
    public static void bai13(int number){
        int rem, temp;
            temp = number;
            int num = 0;
            while (temp != 0) {
                rem = temp % 10;
                num = num + rem * rem * rem;
                temp = temp / 10;
            }
            if (number==num){
                System.out.println("Số " + number + " là armstrong");
            }else {
                System.out.println("Số " + number + " không phải là armstrong");
            }
    }
}
