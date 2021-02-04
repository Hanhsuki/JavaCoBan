package chuong3;

public class StringBuilderInJava {
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
        bai4();
    }
/*Các tao tác trên String Builder không tạo ra vùng nhớ rác
Các phương thức thông dụng trong stringbuilder
Phương thức append */
    public static void bai1() {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java"); //Nối thêm tham số vào cuối chuỗi.
        System.out.println(sb);
    }
//Phương thức insert.
    public static void bai2() {
        StringBuilder sb = new StringBuilder("Java");
        sb.insert(1,"Hanh");
        System.out.println(sb);
    }
//Phương thức DeleteChartArt.
    public static void bai3() {
        StringBuilder sb = new StringBuilder("Java");
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
//Phương thức Delete.
    public static void bai4() {
        StringBuilder sb = new StringBuilder("Java");
        sb.delete(1,3);
        System.out.println(sb);
    }

}
