package chuong10;
/* Khi một chương trình chạy sẽ có 1 thread chính, đó là các dòng lệnh trong hàm main
- Để tạo ra các thread khác chúng ta có 2 cách:
+ Cách 1: Tạo ra lớp con của Thread (java.lang.Thread)
+ Cách 2: Tạo ra 1 lớp hiện thức interface của runnable.
*/
public class CreateThread extends java.lang.Thread {
    @Override
    public void run(){
        super.run();

    }

}
