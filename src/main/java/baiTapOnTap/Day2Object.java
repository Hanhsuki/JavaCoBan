package baiTapOnTap;

import java.util.*;

public class Day2Object {
    public static void main(String[] args) {
        List<HocSinh> list = new ArrayList<HocSinh>();
        list.add(new HocSinh("A001", "Nam Nguyen", 26, 80));
        list.add(new HocSinh("A002", "Hoang Anh", 35, 9));
        list.add(new HocSinh("A003", "Thuy Trang", 21, 15));
        list.add(new HocSinh("A004", "Tuan Anh", 30, 85));
        list.add(new HocSinh("A005", "Khac Hieu", 39, 85));
//        bai1(list);
//        bai2(list);
//        bai3(list);
//        bai4(list);
//        bai5(list);
//        bai6(list);
//        bai7(list);
        bai8(list);

    }
    public static class HocSinh {
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getPoint() {
            return point;
        }

        public String id;
        public String name;
        public int age;
        public int point;
        public HocSinh(String id,String name, int age, int point){
            this.id = id;
            this.name = name;
            this.age = age;
            this.point = point;
        }
    }

//Bài 1: Hiển thị danh sách tên sinh viên từ mảng sinh viên dã cho. Object Studen gồm các trường sau :name, age, id, point
    public static void bai1(List<HocSinh> list) {
        for (int i =0; i < list.size(); i++){
            System.out.println(list.get(i).name);
        }
    }
//Bài 2: Hiển thì tuồi của danh sách sinh viên từ mảng sinh viên đã cho
    public static void bai2(List<HocSinh> list) {
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            System.out.println(hs.age);
        }
    }
//Bài 3: Hiển thị danh sách sinh viên có tên chứa ký tự đã cho
    public static void bai3(List<HocSinh> list) {
        String ch = "n";
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            if(hs.name.contains(ch)) {
                System.out.println(hs.name);
            }
        }
    }
//Bài 4: Hiển thị danh sách sinh viên có điểm lớn hơn một số cho trước
    public static void bai4(List<HocSinh> list) {
        int num = 5;
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            if(hs.point > num) {
                System.out.println(hs.name);
            }
        }
    }
//Bài 5: Hiển thị danh sách sinh viên có điểm nhỏ hơn số cho trước
    public static void bai5(List<HocSinh> list) {
        int num = 5;
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            if(hs.point < num) {
                System.out.println(hs.name);
            }
        }
    }
//Bài 6: Hiển thị danh sách sinh viên có tuổi lớn hơn 25 và điểm thì nhỏ hơn 10
    public static void bai6(List<HocSinh> list) {
        int point = 10;
        int age = 25;
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            if(hs.point < 10 && hs.age > 25) {
                System.out.println(hs.name);
            }
        }
    }
//Bài 7: Sắp xếp danh sách sinh viên theo độ tăng dần của tuổi
    public static void bai7(List<HocSinh> list) {
        Collections.sort(list, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                if (hs1.getAge() > hs2.getAge())
                    return 1;
                else if (hs1.getAge() == hs2.getAge())
                    return 0;
                else
                    return -1;
            }
        });
        for(HocSinh item : list){
            System.out.println(item.getName() + " - " + item.getAge());
        }
    }
//Bài 8: Tìm sinh viên có tuổi lớn nhất
    public static void bai8(List<HocSinh> list) {
        int max = list.get(0).getAge();
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            if(hs.getAge() > max){
                max = hs.getAge();
            }
        }
        System.out.println(max);
    }
//Bài 9: Tìm sinh viên có tuổi nhỏ nhất
    public static void bai9(List<HocSinh> list) {
        int min = list.get(0).getAge();
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            if(hs.getAge() < min){
                min = hs.getAge();
            }
        }
        System.out.println(min);
    }
//Bài 10: Tìm sinh viên có điểm nhỏ nhất
    public static void bai10(List<HocSinh> list) {
        int min = list.get(0).getPoint();
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            if(hs.getPoint() < min){
                min = hs.getPoint();
            }
        }
        System.out.println(min);
    }
//Bài 11: Tìm sinh viên có điểm lớn nhất
    public static void bai11(List<HocSinh> list) {
        int min = list.get(0).getPoint();
        Iterator<HocSinh> hocSinh = list.iterator();
        while (hocSinh.hasNext()){
            HocSinh hs = hocSinh.next();
            if(hs.getPoint() < min){
                min = hs.getPoint();
            }
        }
        System.out.println(min);
    }
}
