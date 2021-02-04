package chuong3;

public class CacKyThuatXuLyChuoi {
    public static void main(String[] args) {
        bai1();
        bai2();
        bai3();
        bai4();
        bai5();
        bai6();

    }
//Length trả về độ dài của chuỗi
    public static void bai1() {
        String str1= new String("Hanh Suki");
        int length = str1.length();
        System.out.println(length);
    }
//CharAt trả về giá trị của vị trí index trong chuỗi
    public static void bai2() {
        String str1= new String("Hanh Suki");
        char str2 = str1.charAt(3);
        System.out.println(str2);
    }
//toLowerCase Chuyển chuỗi sang chữ thường
    public static void bai3() {
        String str1= new String("Hanh Suki");
        str1 = str1.toLowerCase();
        System.out.println(str1);
    }
//toUpperCase Chuyển chuỗi sang chữ hoa
    public static void bai4() {
        String str1= new String("Hanh Suki");
        str1 = str1.toUpperCase();
        System.out.println(str1);
    }
//trim loại bỏ ký tự trắng đầu và cuối chuỗi
    public static void bai5() {
        String str1= new String(" Hanh Suki  ");
        str1 = str1.trim();
        System.out.println(str1);
    }
//subString trích xuất chuỗi con
    public static void bai6() {
        String str1= new String(" Hanh Suki  ");
        str1 = str1.substring(3,7);
        System.out.println(str1);
    }
}
