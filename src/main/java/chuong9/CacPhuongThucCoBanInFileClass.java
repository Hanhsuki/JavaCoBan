package chuong9;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CacPhuongThucCoBanInFileClass {
// Trả về folder cha chứa tập tin
    public static void getParent(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        if(file.exists()) {
            System.out.println("Get Parent Path: " + file.getParent());
        }
    }
// Kiểm tra tập tin có thể đọc không
    public static void canRead(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        if(file.exists()) {
            System.out.println("Can read: " + file.canRead());
        }
    }
// Kiểm tra tập tin có thể ghi không
    public static void canWrite(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        if(file.exists()) {
            System.out.println("Can write: " + file.canWrite());
        }
    }
// Xóa tập tin
    public static void delete(){
        java.io.File file = new java.io.File(".\\file\\text.docx");

        if(file.delete()) {
            System.out.println("Delete success full");
        }

    }
// Kiểm tra 1 file có tồn tại hay không
    public static void exits(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        if(file.exists()){
            System.out.println("Get Absolute Path: " + file.getAbsolutePath());
        }else {
            System.out.println("not exists");
        }
    }
// Tạo 1 file
    public static void createNewFile(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        if(file.exists()){
            System.out.println("exists");
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
// Trả về các tập tin và thư mục nằm trong file được khởi tạo. Dữ liệu được trả về dưới dạng 1 mảng
    public static void listFile(){
        java.io.File file = new java.io.File(".\\file");
        File[] listFiles = file.listFiles();
        System.out.println("length: " + listFiles.length);
        for(int i = 0; i < listFiles.length; i++){
            File fileTmp = listFiles[i];
            if(fileTmp.isDirectory()){
                System.out.println("Folder:" + fileTmp.getName()); // get tên của tập tin
            } else if(fileTmp.isFile()) {
                System.out.println("Filer:" + fileTmp.getName());
            }
        }
    }
// Kiểm tra giá trị của path truyền vào có phải là 1 thư mục không
    public static void isDirectory(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        if(file.exists()) {
            System.out.println("Is directory : " + file.isDirectory());
        }
    }
// Kiểm tra giá trị của path truyền vào có phải là 1 file không
    public static void isFile(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        if(file.exists()) {
            System.out.println("Is file : " + file.isFile());
        }
    }
// Trả về chiều dài của file (tính cả khoảng trắng)
    public static void length(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        if(file.exists()) {
            System.out.println("Length file: " + file.length());
        }
    }
// Trả về thời gian chỉnh sửa tập tin lần cuối cùng
    public static void lastModified(){
        java.io.File file = new java.io.File(".\\file\\text.docx");
        Date date = new Date(file.lastModified());

        if(file.exists()) {
            System.out.println("Length file: " + date);
        }
    }
}
