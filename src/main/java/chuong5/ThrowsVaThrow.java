package chuong5;

public class ThrowsVaThrow {

    public static void main(String[] args) throws Exception {
        bai1(10,0);

    }
    public static void bai1(int number1,int number2 ) throws InterruptedException, Exception {
        Thread.sleep(5000);
        if(number2==0) throw new ArithmeticException("lỗi chia cho 0");

        }
    }

