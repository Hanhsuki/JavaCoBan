package chuong1;

public class VongLap {
    public static void main(String[] args) {
        bai1();
        bai1_1();
        bai1_2();
        bai2();
        bai2_1();
        bai2_2();
        bai3();
        bai3_1();

    }
//Bài 1: In ra màn hình 10 dòng "Java is not difficult!" dùng vòng lặp for
    public static void bai1 (){
        for (int i=1; i<=10; i++){
            System.out.println(i + "-" + "Java is not difficult!");
        }
    }

//Sử dùng vòng lặp While
    public static void bai1_1 (){
        int j = 1;
        while (j<= 10){
            System.out.println(j + "-" + "Java is not difficult!");
            j++;
        }
    }

//Sử dùng vòng lặp Do - While
    public static void bai1_2 (){
        int k = 1;
        do {
            System.out.println(k + "-" + "Java is not difficult!");
            k++;
        } while (k < 10);
    }
// Bài 2: sử dụng vòng lặp để in ra bảng cửu chương 1 bảng cửu chương theo index
    public static void bai2 (){
    int number = 1;
    for (int i = 1; i <= 10; i++){
        System.out.println(number + "*" + i + "=" + number*i);
        // in theo format, các giá trị %d, %s,%n là format number (example %d là truyền và 1 biến interger)
        System.out.printf("%d * %d = %d %n", number,i,number*i);
        }
    }
// Sử dụng vòng lặp while
    public static void bai2_1 (){
        int number = 1;
        int i = 1;
        while (i <= 10){
            System.out.printf("%d * %d = %d %n", number,i,number*i);
            i++;
        }
    }
// Sử dụng vòng lặp Do - while
    public static void bai2_2 (){
        int number = 1;
        int i = 1;
        do {
            System.out.printf("%d * %d = %d %n", number,i,number*i);
            i ++;
        }   while (i<10);
    }

// Bài 3: sử dụng vòng lặp để in ra tất cả bảng cửu chương theo index
    public static void bai3 (){
        int number = 1;
        for (int i = 1; i <=9; i++) {
            System.out.println("Bảng cửu chương" + " " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d %n", number, j, number * j);
            }
        }
    }
// sử dụng vòng lặp while lồng for
    public static void bai3_1 (){
        int number = 1;
        while ( number <= 9) {
            System.out.println("Bảng cửu chương" + " " + number);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d %n", number, j, number * j);
            }
            number++;
        }
    }
}

