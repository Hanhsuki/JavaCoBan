package chuong9;

import jdk.nashorn.internal.ir.debug.ClassHistogramElement;

import java.io.*;

/* 2 class này dùng để đọc và viết data vào file. (Thao tác với tập tin văn bản
Kết hợp với 2 class bufferedInputStream và bufferedOutputStream để tăng hiệu suất đọc/ghi dữ liệu. Nhưng chúng ta không
nên dùng 2 class này để thao tác với văn bản.
*/
public class FileInputStreamAndFileOutputStream {
    private static final String FILE_NAME = ".\\file\\text1.txt";

    public  static void writeFileWithBuffer(String data){
        try {
            FileOutputStream fileOutputStream         = new FileOutputStream(FILE_NAME,true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            bufferedOutputStream.write(data.getBytes());
            bufferedOutputStream.flush(); // với buffer chúng ta cần thêm method này

            bufferedOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
// DÙng buffer tốc độ đọc ghi sẽ nhanh hơn.
    public static String readFileWithBuffer(String data){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStream           = new FileInputStream(FILE_NAME);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int i;
            while ((i=bufferedInputStream.read()) != -1){ // Chưa đến cuối file thì giá trị khác -1
                stringBuffer.append((char)i);
            }
            bufferedInputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public static void writeFile(String data){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME,true); // True sẽ là không ghi đè lên giá trị cũ
            fileOutputStream.write(data.getBytes());//chúng ta truyền vào 1 mảng các byte, chúng ta sẽ gọi đến getByte để write
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String readFile(String data){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            int i;
            while ((i=fileInputStream.read()) != -1){ // Chưa đến cuối file thì giá trị khác -1
                stringBuffer.append((char)i);
            }
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
    public static void copyFile(String pathA, String pathB){
        try {

            FileInputStream fileInputStream = new FileInputStream(pathA);
            FileOutputStream fileOutputStream = new FileOutputStream(pathB);

            int i = 0;
            while ((i = fileInputStream.read())!= -1) {
                fileOutputStream.write((byte) i);
            }
            fileInputStream.close();
            fileOutputStream.close();

            } catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void myPrint (String text){
        System.out.println(text);
    }
}
