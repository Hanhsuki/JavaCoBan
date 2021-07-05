package baiTapOnTap;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Day3Extend {
    /*Kế thừa
    Có 4 loại hình bao hồm: Hình Vuông, Hình Tròn, Hình Chữ nhật, Hình Thang
    Điểm chung:
    Có chu vi và diện tích
    Điểm riêng:
    Hinh chữ nhật có độ dài 2 cạnh
    HÌnh vuông có độ dài 1 cạnh
    Hình tròn có R bán kính
    HÌnh thang có độ dài cạnh lớn, cạnh nhỏ, chiều cao, canh bên
    */
    public static void main(String[] args) {
        List<Hinh> list = new ArrayList<Hinh>();
                list.add(new HinhChuNhat(5,10));
                list.add(new HinhVuong("A002", "Hoang Anh", 35, 9));
                list.add(new HinhTron("A003", "Thuy Trang", 21, 15));
                list.add(new HinhThang("A004", "Tuan Anh", 30, 85));

    }

//Bài 1: Hiển thị danh sách hình từ danh sách hình đã cho
    public static void bai1() {

    }
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

    class HinhVuong extends Hinh {
        public HinhVuong(int canh) {
            this.canh = canh;
            name = "Hinh Vuông";
        }

        int canh;

        @Override
        double ChuVi() {
            return canh * 4;
        }

        @Override
        double DienTich() {
            return canh * canh;
        }
    }

    class HinhChuNhat extends Hinh {
        public HinhChuNhat(int chieudai, int chieurong) {
            this.chieudai = chieudai;
            this.chieurong = chieurong;

        }

        int chieudai;
        int chieurong;

        @Override
        double ChuVi() {
            return 2 * (chieurong + chieudai);
        }

        @Override
        double DienTich() {
            return chieurong * chieudai;
        }
    }

    class HinhTron extends Hinh {
        public HinhTron(int bankinh) {
            this.bankinh = bankinh;
        }

        int bankinh;

        @Override
        double ChuVi() {
            return 2 * PI * bankinh;
        }

        @Override
        double DienTich() {
            return PI * pow(bankinh, 2);
        }
    }

    class HinhThang extends Hinh {
        public HinhThang(int daylon, int daybe, int canhben, int chieucao) {
            this.daybe = daybe;
            this.daylon = daylon;
            this.canhben = canhben;
            this.chieucao = chieucao;
        }

        int daylon;
        int daybe;
        int canhben;
        int chieucao;
        @Override
        double ChuVi() {
            return (daybe + daylon) + canhben *2;
        }

        @Override
        double DienTich() {
            return (daylon + daybe) * chieucao / 2;
        }
    }

}