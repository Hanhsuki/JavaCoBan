package baiTapOnTap;

import java.util.ArrayList;
import java.util.Iterator;
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
        list.add(new HinhChuNhat("Hình chữ nhật", 5, 10));
        list.add(new HinhVuong("Hình vuông", 5));
        list.add(new HinhTron("Hình tròn", 10));
        list.add(new HinhThang("Hình thang", 10, 8, 6, 15));

        bai1(list);
        bai2(list);
    }

//Bài 1: Hiển thị danh sách hình từ danh sách hình đã cho
    public static void bai1(List<Hinh> list) {
        Iterator<Hinh> iterator = list.iterator();
//Cách 1 Dùng while
//        while (iterator.hasNext()) {
//            Hinh Obj = iterator.next();
//            System.out.println(Obj.getName());
//        }
//Cách 2: Dùng for
        for (Iterator<Hinh> it = iterator; it.hasNext(); ) {
            Hinh item = it.next();
            System.out.println(item.getName());
        }
    }
//Bài 2: Hiển thị danh sách chu vi của các hình từ danh sách hình đã cho
    public static void bai2(List<Hinh> list) {
        Iterator<Hinh> iterator = list.iterator();
        while (iterator.hasNext()){
            Hinh Obj = iterator.next();
            System.out.println(Obj.ChuVi());
        }
    }
//Bài 3: Hiển thị danh sách diện tích từ danh sách hình đã cho
    public static void bai3(List<Hinh> list) {
        Iterator<Hinh> iterator = list.iterator();
        while (iterator.hasNext()){
            Hinh Obj = iterator.next();
            System.out.println(Obj.DienTich());
        }
    }
//Bài 4: Tìm hình có chu vi lớn nhất
    public static void bai4(List<Hinh> list){

    }
//Bài 5: Tìm hình có chu vi nhỏ nhất
//Bài 6: Tìm hình có diện tích lớn nhất
//Bài 7: Tìm hình có diện tích nhỏ nhất
//Bài 8: Sắp xếp hình theo độ tăng dần của chu vi
//Bài 9: Sắp xếp hình theo độ giảm dần của chu vi
//Bài 10: Sắp xếp hình theo độ tăng dần của diện tích
//Bài 11: Sắp xếp hình theo độ giảm dần của diện tích
//Bài 12: Hiển thị danh sách hình vuông có trong mảng

}
    abstract class Hinh {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public Hinh(String name) {
        this.name = name;
    }

    private String name;

        abstract double ChuVi();

        abstract double DienTich();
    }
    class HinhVuong extends Hinh {
        public HinhVuong(String name, int canh) {
            super(name);
            this.canh = canh;
        }
        private int canh;
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
        public HinhChuNhat(String name, int chieudai, int chieurong) {
            super(name);
            this.chieudai = chieudai;
            this.chieurong = chieurong;
        }
        private int chieudai;
        private int chieurong;
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
        public HinhTron(String name, int bankinh) {
            super(name);
            this.bankinh = bankinh;
        }
        private int bankinh;
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
        public HinhThang(String name, int daylon, int daybe, int canhben, int chieucao) {
            super(name);
            this.daybe = daybe;
            this.daylon = daylon;
            this.canhben = canhben;
            this.chieucao = chieucao;
        }
        private int daylon;
        private int daybe;
        private int canhben;
        private int chieucao;
        @Override
        double ChuVi() {
            return (daybe + daylon) + canhben *2;
        }
        @Override
        double DienTich() {
            return (daylon + daybe) * chieucao / 2;
        }
    }

