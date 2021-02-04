package chuong3;

public class StringInJava {
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4();
        bai5();
        bai6();
    }
//Khởi tạo 1 đối tượng chuỗi
    public static void bai1() {
//Cách 1
        String str1 = "Java cơ bản";
//Cách 2
        String str2= new String();
        str2 = "Java cơ bản";
//Cách 3
        String str3= new String("Java cơ bản");
        System.out.println(str1);
    }

//Nối chuỗi
    public static void bai2() {
        String str1 = "Java";
        String str2 = "cơ bản";
        String str3 = str1 + " " + str2;
        String str4 = str1.concat(" ").concat(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

//Chuyển đổi chuỗi thành giá trị số
    public static void bai3() {
        String str1 = "987";
        int number = Integer.parseInt(str1);
        System.out.println(number + 4);

    }

//So sánh chuỗi
    public static void bai4() {
        String str1 = "987";
        String str2 = "987";
        String str3 = new String("987");
        if(str1==str3){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
//So sánh chuỗi bằng method equals và equalsIgnoreCase
    public static void bai5() {
        String str1 = "Android.Vn";
        String str2 = "android.vn";
        System.out.println("So sánh phân biệt hoa thường:" + str1.equals(str2));
        System.out.println("So sánh không phân biệt hoa thường:" + str1.equalsIgnoreCase(str2));
    }
//Sự dư thừa vùng nhớ
    public static void bai6() {
        String str1 = "Java cơ bản"; // str1 được cấp vùng nhớ 1
        str1 = "Java nâng cao"; // str1 được cấp vùng nhớ mới sau mỗi lần thay đổi giá trị dẫn đến dư thừa vùng nhớ. Để giảm sự dư thừa vùng nhớ chúng ta dùng class String Builder
    }
}
