package chuong9;

import java.io.*;

/* FileReader và fileWriter là 2 class sử dụng để thao tác với from text
Chúng ta không nên dùng inputStream và outputStream khi đọc và ghi văn bản thuần túy.
*/
public class FileReaderAndFileWriter {
    private static final String FILE_NAME = ".\\file\\text1.txt";

    public static void fileWriter(String data){
        try {
            FileWriter fileWriter           = new FileWriter(FILE_NAME, true);
            fileWriter.append("text");
            fileWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String fileReader(){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileReader fileReader           = new FileReader(FILE_NAME);
            int i = 0;
            while ((i = fileReader.read()) != -1){
                stringBuffer.append((char)i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

}
