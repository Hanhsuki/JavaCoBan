package chuong9;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Tác dụng của Random Access File
1. Dùng để truy xuất ngẫu nhiên, Duy chuyển đến 1 vị trí bất kỳ trong 1 tập tin.
2. Đọc và ghi dữ liệu theo kiểu nguyên thủy
Chú ý: Ghi vào theo kiểu gì thì cần đọc ra theo kiểu dữ liệu đó
*/
public class RandomAccessFile {

    public static void readInt() {
        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(".\\file\\text1.txt", "r");
            randomAccessFile.seek(0);

            myPrint(randomAccessFile.readInt() + "");
            randomAccessFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    /* Có 2 method RandomAccessFile 1 là truyền vào path của file hai là truyền vào name của file
    Mode nếu truyền vào r là chỉ đọc, rw là cả đọc và ghi.
    */
    public static void writeFile() {
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(".\\file\\text1.txt", "rw");
            randomAccessFile.writeInt(123);
            randomAccessFile.writeUTF("Random"); // ghi vào chuỗi dữ liệu

            randomAccessFile.close(); // Khi thao tác xong cần đống file lại

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    private static void myPrint (String text){
        System.out.println(text);
    }
}


