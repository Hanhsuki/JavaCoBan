package baiTapOnTap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Sapxep {

    public static void main(String[] args) {
//        bai1();
        bai2();

    }

// Bài 1: Sắp xếp một mảng tăng dần
    public static void bai1() {
        int temp;
        int[] arr = {90, 20, 30, 40};
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

// Kiểm tra số lần xuất hiện của một phần tử trong mảng
    public static void bai2() {
        int[] arr = {10, 50, 60, 10, 20, 10};
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
            } else {
                map.put(arr[i], 1);
            }
        }
        Iterator itr = map.keySet().iterator();
        while (itr.hasNext())
        System.out.println("Giá trị: " + itr.next() + " xuất hiện số lần: " + map.get(itr.next()));
    }
}
