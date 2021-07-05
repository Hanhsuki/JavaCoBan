package baiTapOnTap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static jdk.nashorn.internal.objects.Global.instance;
import static jdk.nashorn.internal.objects.Global.print;

public class Day1Array {
    static int[] arr = {10,20,30,40,50};
    static String[] arr1 = {"Ngày","Mới","Vui","Vẻ","Nhé"};
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4();
//        bai5();
//        bai6();
//        bai7(3);
//        bai8();
//        bai9();
        bai10();
    }
//Bài 1: Hiển thị danh sách string từ mảng đã cho
    public static void bai1(){
        for (String item : arr1) {
            System.out.println(item);
        }
    }
//Bài 2: Hiện thị danh sách số từ mảng đã cho
    public static void bai2() {
        for (int item : arr) {
            System.out.println(item);
        }
    }
//Bài 3: Hiển thị danh sách string chứa nội dung cho trước
    public static void bai3() {
        String c = "a";
        for (String item : arr1) {
            if (item.contains(c)){
            System.out.println(item);
            }
        }
    }
//Bài 4: Hiển thị danh sách số lớn hơn số cho trước
    public static void bai4() {
        int num = 3;
        for(int item : arr){
            if(item > num)
            System.out.println(item);
        }
    }
//Bài 5: Hiển thị danh sách số nhỏ hơn số cho trước
    public static void bai5() {
        int num = 3;
        for(int item : arr) {
            if (item < num){
                System.out.println(item);
            }
        }
    }
//Bài 6: Hiển thị danh sách số chứa số cho trước
    public static void bai6() {
        int num = 3;
        String str = String.valueOf(num);
        for(int item : arr) {
            String s = String.valueOf(item);
            if (s.contains(str)){
                System.out.println(Integer.parseInt(s));
            }
        }
    }
//Bài 7: Hiển thì danh sách số chia hết cho 3 từ màng cho sẵn
    public static void bai7(int num) {
        for(int item : arr){
            if(item % num == 0){
                System.out.println("Số chia hết cho" + num + "là: " + item);
            }
        }
    }
//Bài 8: Hiển thị danh sách số là số chẵn
    public static void bai8() {
        for(int item : arr){
            if(item % 2 == 0){
                System.out.println("Số" + item + "là số chẵn");
            }
        }
    }
//Bài 9: Hiển thị danh sách số là số lẻ
    public static void bai9() {
        for(int item : arr){
            if(item % 2 != 0){
                System.out.println("Số" + item + "là số lẻ");
            }
        }
    }
//Bài 10: Tìm số lớn thứ 2 từ mảng cho trước
    public static void bai10() {
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        int length = list.size();
        Collections.sort(list);
//        System.out.println(list.get(length - 2));
        Collections.reverse(list);
        System.out.println(list.get(1));
    }

}
