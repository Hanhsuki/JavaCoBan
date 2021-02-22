package chuong9;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Tác dụng của Random Access File
1. Dùng để truy xuất ngẫu nhiên, Duy chuyển đến 1 vị trí bất kỳ trong 1 tập tin.
2. Đọc và ghi dữ liệu theo kiểu nguyên thủy
3.
*/
public class RandomAccessFile {
    public static void seek() {
        java.io.File file = new java.io.File(".\\file\\text.docx");

    }

    public static void readUTF() {

    }

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

    public static void length() {

    }

    /* Có 2 method RandomAccessFile 1 là truyền vào path của file hai là truyền vào name của file
    Mode nếu truyền vào r là chỉ đọc, rw là cả đọc và ghi.
    */
    public static void writeFile() {
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(".\\file\\text1.txt", "rw");
            randomAccessFile.write(123);

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


//myPrint truyền vào 1 string mà randomAccessFile.readInt() trả về Int, nên chúng ta cần nối thêm 1 chuỗi rống
