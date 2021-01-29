package chuong1;

public class CauDieuKien {
    public static void main(String[] args) {
        bai1();
        bai1_1();
        bai2();
        bai3();
        bai4();
        bai4_1();
        bai5();

    }

//Bài 1: Kiểm tra một số có phải là số lẻ không với câu lệnh if

    public static void bai1() {
        int number = 15;
        int remainder = number % 2;
        if (remainder == 0) {
            System.out.println("Số chẵn");
        }
        if (remainder == 1) {
            System.out.println("Số lẻ");
        }
    }

//Cách 2:
    public static void bai1_1() {
        int number = 15;
        String result = "Số chẵn";
        if (number % 2 == 1) {
            result = "Số lẻ";
            System.out.println(result);
        }
    }

//Bài 2: Kiểm tra một số có phải là số lẻ không với câu lệnh if else
    public static void bai2 () {
        int number = 15;
        int remainder = number % 2;
        if (remainder == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
    }
//Bài 3: Kiểm tra một số là số chẵn, số lẻ hoặc số không
    public static void bai3 () {
        int number = 15;

        if (number  == 0) {
            System.out.println("Số không");
        } else if (number % 2 == 1){
            System.out.println("Số lẻ");
        } else {
            System.out.println("Số chẵn");
        }
    }
//Bài 4: Kiểm tra 1 số là số không, số nguyên âm chẵn, số nguyên âm lẻ, số dương chẵn hay số dương lẻ
    public static void bai4 () {
        int number = 15;
        String result;
        if (number == 0){
            result = "Số không";
        } else if (number %2 ==0 && number > 0) {
            result= "Số nguyên dương chẵn";
        } else if (number %2 ==0 && number < 0) {
            result = "Số nguyên âm chẵn";
        } else if (number %2 ==1 && number > 0) {
            result = "Số nguyên dương lẻ";
        } else {
            result = "Số nguyên âm lẻ";
        }
        System.out.println(result);
    }
// Cách 2
    public static void bai4_1 () {
        int number = 15;
        String result = "Số không";
        String str1 = "dương";
        String str2 = "chẵn";
        if (number < 0) str1 = "lẻ";
        if (number % 2 == 1) str2 = "lẻ";
        if (number == 0) {
            System.out.println("Số không");
        } else {
            System.out.println("Số nguyên" + " " + str1 + " " + str2);
        }
    }
// Bài 5: In ra các ngày tương ứng trong tuần theo giá trị index bằng câu điều kiện switch
    public static void bai5 () {
        int number = 15;
        String result;
        switch (number) {
            case 2:
                result = "Thứ 2";
                break;
            case 3:
                result = "Thứ 3";
                break;
            case 4:
                result = "Thứ 4";
            break;
            case 5:
                result = "Thứ 5";
                break;
            case 6:
                result = "Thứ 6";
                break;
            default:
                result = "Chủ nhật";
                break;
        }
        System.out.println(result);
    }
}


