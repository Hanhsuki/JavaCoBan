package chuong9;

import javafx.print.Printer;

import java.io.*;

/* BufferedReader And PrintWriter kết hợp với fileReader để đọc dữ liệu theo dòng.
PrintWriter kết hợp với fileWriter để ghi văn bản theo từng dòng.
 */
public class BufferedAndPrintWriter {
    private static final String FILE_NAME = ".\\file\\text1.txt";

    public static void writerLine(String data){
        FileWriter fileWriter;
        PrintWriter printWriter;

        try {
            fileWriter  = new FileWriter(FILE_NAME, true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Java");
            printWriter.println("iOS");
            printWriter.print("Android"); // không xuống dòng

            printWriter.close();
            fileWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String readLine(){
        StringBuffer stringBuffer = new StringBuffer();

        try {
            FileReader fileReader           = new FileReader(FILE_NAME);
            BufferedReader bufferedReader   = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null){
                stringBuffer.append(line).append(System.getProperty("Line.separator")); // có thể dùng append("\n") để xuống dòng sau mỗi lần đọc
            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

}


