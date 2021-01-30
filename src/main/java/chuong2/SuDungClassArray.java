package chuong2;

import java.util.Arrays;

public class SuDungClassArray {
    public static void main(String[] args) {
//        bai1();
//        bai2();
        bai3();

    }
    //Sao chép mảng
    public static void bai1 () {
        String[] str = {"Bài 1", "Bài 2", "Bài 3"};
        str[3] = "Bài 4";

        String[] strNew = Arrays.copyOf(str,4);
        strNew[4] = str[3];
        System.out.println(strNew[4]);
    }
    //Sao chép mảng có điều kiệm
    public static void bai2() {
        String[] str = {"Bài 1", "Bài 2", "Bài 3"};

        String[] strNew = Arrays.copyOfRange(str,0,2);
        System.out.println(strNew.length);
    }
    //sort mảng
    public static void bai3() {
        int[] arrInt = {2,60,94,4,7,94,15};

    //Sắp xếp tăng dần
        Arrays.sort(arrInt);
        System.out.println(Arrays.toString(arrInt));
        int length = arrInt.length;
    //Sắp xếp giảm dần
        for (int i = 0; i < length/2; i++){
            int elmTmp = arrInt[i];
            arrInt[i] = arrInt[length -1 -i];
            arrInt[length - 1 -i] = elmTmp;
        }
        System.out.println(Arrays.toString(arrInt));

    }
}
