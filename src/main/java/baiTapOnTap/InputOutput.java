package baiTapOnTap;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws UnknownHostException {
//        bai1();
        bai2();
    }
// Bài 1: Đọc già trị input
    public static void bai1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào một số bất kì: ");
        int num = scan.nextInt();
        scan.close();
        System.out.println("Số bạn vừa nhập là: "+num);
    }
// Bài 2: Lấy địa chỉ ip
    public static void bai2() throws UnknownHostException {
        InetAddress myIP=InetAddress.getLocalHost();
        System.out.println("Địa chỉ IP của tôi là:");
        System.out.println(myIP.getHostAddress());
    }
}
