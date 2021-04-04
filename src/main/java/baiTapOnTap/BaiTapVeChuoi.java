package baiTapOnTap;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;

public class BaiTapVeChuoi {
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4_1();
//        bai4_2();
//        bai5();
//        bai6_1();
//        bai6_2();
//        bai6_3();
//        bai7();
//        bai8("hanh suki");
//        bai9();
        bai10();

    }
// Bài 1: Xóa khoảng trắng trong chuỗi
    public static void bai1(){
        String chuoi = "ci ti   go. c   o m";
        System.out.println("Chuỗi trước khi xóa khoảng trắng: " + chuoi);
        chuoi = chuoi.replaceAll(" ","");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + chuoi);
    }
// Bài 2: Viết hoa ký tự đầu tiên trong chuỗi
    public static void bai2(){
        String chuoi = "hanhsuki";
        System.out.println("Chuỗi trước khi viết hoa ký tự đầu tiên: " + chuoi);
        String firtLetter = chuoi.substring(0,1);
        firtLetter = firtLetter.toUpperCase();
        String remainLetter = chuoi.substring(2);
        String  chuoiModify = firtLetter + remainLetter;
        System.out.println("Chuỗi viết hoa ký tự đâu tiên: " + chuoiModify);
    }
// Bài 3: In hoa các chữ đầu tiên của chuỗi
    public static void bai3(){
        String chuoi = "Nguyễn thị hạnh";
        System.out.println("Chuỗi trước khi chuyển đổi: " + chuoi);
        // Chuyển đổi chuỗi thành kiểu ký tự
        char[] charArray = chuoi.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length ; i++){
            if (Character.isLetter(charArray[i])){
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        // chuyển đổi ký tự thành string
        chuoi = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi sửa đổi: " + chuoi);
    }
// Bài 4: Chuyển đổi chữ thường thành chữ hoa (Dùng mã ASCII or Method toUpperCase
    public static void bai4_1(){
        String chuoi = "Vi du chuyen doi chu thuong thanh chu in hoa";
        System.out.println("Chuỗi trước khi chuyển đổi: " + chuoi);
        char[] charArrays = chuoi.toCharArray();
        for (int i =0; i < charArrays.length; i++){
            if(charArrays[i] >= 97 && charArrays[i] <= 122){
                charArrays[i] -= 32;
            }
        }
        chuoi = String.valueOf(charArrays);
        System.out.println("Chuỗi sau khi chuyển đổi: " + chuoi);
    }
    public static void bai4_2(){
        String chuoi = "Ví dụ chuyển đổi chữ thường thành chữ in hoa";
        System.out.println("Chuỗi trước khi chuyển đổi: " + chuoi);
        chuoi = chuoi.toUpperCase();
        System.out.println("Chuỗi sau chuyển đổi: " + chuoi);
        }
// Bài 5: Tìm các ký tự trùng lặp trong chuỗi
    public static void bai5(){
        String chuoi = " San truong em rat rong va dep";
//Tạo một HashMap
        Map<Character, Integer> map = new HashMap<Character, Integer>();
//Chuyển đổi chuỗi thành mảng char
        char[] chars = chuoi.toCharArray();
        for (char ch:chars){
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch,1);
            }
        }
//Lấy ra key của chuỗi
        Set<Character> keys = map.keySet();
        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println("Char " + ch + " " + map.get(ch));
            }
        }
    }
// Bài 6: Kiểm tra 1 chuỗi là chuỗi đối xứng (là chuỗi đọc xuôi hoăc đọc ngược đều cho kết quả như nhau)
/* Cách 1 sử dụng lớp Stack:
Cách 2: Sử dụng interface Queue.
Cách 3: Dùng vòn lặp For, while và method charAt()
 */
    public static void bai6_1(){
        String chuoi = "abcddcba";
        Stack stack = new Stack();
        for(int i = 0; i < chuoi.length(); i++){
            stack.push(chuoi.charAt(i)); //push thêm 1 char vào đầu chuỗi, charat trả về giá trị của chuỗi theo index
        }
        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop(); // pop() lấy ra ký tự đầu của chuỗi
        }
        if(chuoi.equals(reverseString)){
            System.out.println("Đây là chuỗi đối xứng");
        }else {
            System.out.println("Đây không phải là chuỗi không đối xứng");
        }
    }
    public static void bai6_2() {
        String chuoi = "abcddcba";
        Queue queue = new LinkedList(); // Queue là 1 interface nên ta cần truy xuất thông qua các class kế thừa nó.
        for (int i = chuoi.length()-1; i >=0; i--) {
            queue.add(chuoi.charAt(i)); // add phần tử vào chuỗi (thêm vào sau)
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove(); // Xóa phần tử trong chuỗi (xóa tư trước)
        }
        if (chuoi.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
    public static void bai6_3(){
        String chuoi = "abcddcba";
        String reverseString="";
        int length = chuoi.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverseString = reverseString + chuoi.charAt(i);
        if (chuoi.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng!");
        else
            System.out.println("Đây không phải là chuỗi đối xứng!");
    }
// Bài 7: Sắp xếp chuỗi theo bảng chữ cái.
    public static void bai7(){
        String[] chuoi = {"ngay","mai","bang","tuoi"};
        int count = chuoi.length;
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (chuoi[i].compareTo(chuoi[j])>0)
                {
                    String temp = chuoi[i];
                    chuoi[i] = chuoi[j];
                    chuoi[j] = temp;
                }
            }
        }
        System.out.print("Các chuỗi sau khi sắp xếp là: ");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.print(chuoi[i] + ", ");
        }
    }
// Bài 8: Đảo ngược các ký tư trong chuỗi
    public static void bai8(String str){
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
// Bài 9: Đến số lần xuất hiện của 1 ký tự trong chuỗi
    public static void bai9(){
        String chuoi = "Hanh nguyen";
        int counter[] = new int[256];
        int len = chuoi.length();
        for (int i = 0; i < len; i++)
            counter[chuoi.charAt(i)]++; //Đếm giá trị của ký tự xuất hiện trong chuỗi, nếu có sẽ tăng count lên
        char array[] = new char[chuoi.length()];
        for (int i = 0; i < len; i++) {
            array[i] = chuoi.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (chuoi.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + chuoi.charAt(i)
                        + " trong chuỗi:" + counter[chuoi.charAt(i)]);
        }
    }
// Bài 10: Đến số nguyên âm và phụ âm của 1 chuỗi.
    public static void bai10(){
        String chuoi = "Xin chao ngay moi";
        chuoi = chuoi.toLowerCase();
        int ncount=0;
        int pcount=0;
        for(int i = 0; i < chuoi.length(); i++) {
            char ch = chuoi.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ncount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                pcount++;
            }
        }
        System.out.println("Số nguyên âm là: " + ncount);
        System.out.println("Số phụ âm là: " + pcount);
    }
}
