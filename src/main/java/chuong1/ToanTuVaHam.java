package chuong1;

public class ToanTuVaHam {
    public static void main (String[] args) {
        bai1();
        bai2();

    }
//Bài 1: Tìm số lớn nhất trong 3 số tự nhiên cho trước
    public static void bai1 (){
        int numberOne = 5;
        int numberTwo = 15;
        int numberThree = 152;

        int result = Math.max(numberOne, numberTwo);
        int maxNumber = Math.max(result, numberThree);
        System.out.println(maxNumber);

    }
//Bài 2: Phát sinh số tự nhiên ngẫu nhiên nằm trong khoảng từ 14 đến 19
    public static void bai2 () {
        int max = 19;
        int min = 20;
        int range = (max - min) +1;
        int randomNumber = (int)Math.random()*range + min;
        System.out.println(randomNumber);


}

}
