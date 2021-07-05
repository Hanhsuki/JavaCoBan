package baiTapOnTap;

public class Day3Extend {
    /*Kế thừa
    Có 4 loại hình bao hồm: Hình Vuông, Hình Tròn, Hình Chữ nhật, Hình Thang
    Điểm chung:
    Có chu vi và diện tích
    Điểm riêng:
    Hinh chữ nhật có độ dài 2 cạnh
    HÌnh vuông có độ dài 1 cạnh
    Hình tròng có R bán kính
    HÌnh thang có độ dài cạnh lớn, cạnh nhỏ, chiều cao, canh bên
    */
    public static void main(String[] args) {

    }

    //Bài 1: Hiển thị danh sách hình từ danh sách hình đã cho
//Bài 2: Hiển thị danh sách chu vi của các hình từ danh sách hình đã cho
//Bài 3: Hiển thị danh sách diện tích từ danh sách hình đã cho
//Bài 4: Tìm hình có chu vi lớn nhất
//Bài 5: Tìm hình có chu vi nhỏ nhất
//Bài 6: Tìm hình có diện tích lớn nhất
//Bài 7: Tìm hình có diện tích nhỏ nhất
//Bài 8: Sắp xếp hình theo độ tăng dần của chu vi
//Bài 9: Sắp xếp hình theo độ giảm dần của chu vi
//Bài 10: Sắp xếp hình theo độ tăng dần của diện tích
//Bài 11: Sắp xếp hình theo độ giảm dần của diện tích
//Bài 12: Hiển thị danh sách hình vuông có trong mảng
    abstract class Hinh {
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        String name;
        abstract double ChuVi();
        abstract double DienTich();
    }
    class HinhVuong extends Hinh{
        public HinhVuong(int canh) {
            this.canh = canh;
            name = "Hinh Vuông";
        }
        int canh;
        @Override
        double ChuVi() {
            return canh*4;
        }

        @Override
        double DienTich() {
            return canh*canh;
        }
    }

}