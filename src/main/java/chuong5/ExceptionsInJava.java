package chuong5;
/* câu lệnh finaly thương đi cùng khối lệnh try mà không cần khối lệnh catch, các khối lệnh nằm
trong finaly luôn luôn được thực hiện cho dù có exception hay không
*/
public class ExceptionsInJava {
    public static void main(String[] args) {
//        bai1();
//        bai2();
        bai3();
    }

    public static void bai1(){
        System.out.println("Nhận thẻ ATM");
        try {
            System.out.println(5/0);
        }
        catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("Trả thẻ ATM");
    }
    public static void bai2(){
        System.out.println("Nhận thẻ ATM");
        try {
            System.out.println(5/0);
        }
        finally {
            System.out.println("Trả thẻ ATM");
        }
    }
//Lỗi runtime (là lỗi xảy ra khi thực thi trương trình) và lỗi check (là lỗi do trình biên dịch phát hiện ra
    public static void bai3(){
        System.out.println("Nhận thẻ ATM");
        try {
            System.out.println(5/0);
        }
        finally {
            System.out.println("Trả thẻ ATM");
        }
//Lỗi check
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
