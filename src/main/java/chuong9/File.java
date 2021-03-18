package chuong9;
/* Khái niệm cơ bản về file
File dùng để chứa dữ liệu được biểu diễn bởi các bytes
Có 2 loại file cơ bản là binary file và text file
- Binary file (file nhị phân) chứa các chuỗi bytes dạng (exe, png, jpeg, mp3, mp4,...)
- Text file cũng là file nhị phân nhưng kèm theo hệ thống encoding để các file hiển thị dưới dạng có thể đọc được
Có 2 class cơ bản giúp chúng ta thao tác với file
1. classFile: TRuy xuất các thuộc tính của 1 file (giúp chúng ta kiểm tra xem 1 tập tin hay 1 thư mục có tồn tại
hay chưa, Kiểm tra xem nó có thể được đọc được ghi hay không, tạo ra 1 tập tin từ 1 dường dẫn cho trước, hoặc là
chúng ta có thể xem danh sách các tập tin vào thư mục,....)
2. RandomAccessFile: File đọc và ghi với dữ liệu thuộc kiểu cơ bản (int, double, char, boolean,...)
Những khái niệm cơ bản khi làm việc với file:
1. Stream là dòng chảy dữ liêu giữa chương trình và các thiết bị nhâp xuất (bàn phím, màn hình, ...)
2. Input stream là dòng chảy dữ liệu đi vào chương trình
3. Output stream là dòng chảy dữ liệu đi ra chương trình
4. Byte stream là FileInputStream và FileOutputStream (dùng để làm việc với tập tin nhị phân- mỗi 1 lần đọc chùng
ta sẽ đọc ra 1 byte tương đương với 8 bits)
5. Character stream là FileReader và FileWriter (dùng để làm việc với file text- Mỗi 1 lần đọc sẽ ra 1 ký tự
và tùy thuộc vào loại mã hóa UTF-8 hay UTF-16 sẽ tạo ra 1byte 2byte hay 3byte)
*/
public class File {

    public static void main(String[] args) {
        String pathA = "file\\a";
        String pathB = "file\\b.txt";
//        CacPhuongThucCoBanInFileClass.exits();
//        CacPhuongThucCoBanInFileClass.createNewFile();
//        CacPhuongThucCoBanInFileClass.canRead();
//        CacPhuongThucCoBanInFileClass.canWrite();
//        CacPhuongThucCoBanInFileClass.delete();
//        CacPhuongThucCoBanInFileClass.getParent();
//        CacPhuongThucCoBanInFileClass.isDirectory();
//        CacPhuongThucCoBanInFileClass.isFile();
//        CacPhuongThucCoBanInFileClass.lastModified();
//        CacPhuongThucCoBanInFileClass.length();
//        CacPhuongThucCoBanInFileClass.listFile();
        RandomAccessFile.writeFile();
        RandomAccessFile.readInt();
        FileInputStreamAndFileOutputStream.writeFile("Test");
        FileInputStreamAndFileOutputStream.readFile("Test1");
        FileInputStreamAndFileOutputStream.copyFile(pathA,pathB);
        FileReaderAndFileWriter.fileWriter("Text");
        FileReaderAndFileWriter.fileReader();
        BufferedAndPrintWriter.writerLine("Java");
        BufferedAndPrintWriter.readLine();

    }
}
