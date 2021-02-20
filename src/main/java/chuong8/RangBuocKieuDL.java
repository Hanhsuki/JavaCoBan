package chuong8;

public class RangBuocKieuDL {
    public static void main(String[] args) {
        Integer[] arrInt = {10, 20, 30, 40}; // Trong generic chỉ dùng được interger hông dùng được int.
        String[] arrStr = {"Java", "Android", "php"};

        printArrayInt(arrInt);
        printArrayStr(arrStr);

        printArray(arrInt);
        printArray(arrStr);
    }
// để tạo rằng buộc cho kiểu dữ liệu T ta dùng từ khóa extend. cho tất các các kiểu dữ liệu ta dùng Object (cha của tất các các lớp)
    public static <T extends Object> void printArray(T[] arr){
        for (T ele : arr){
            System.out.println(ele);
        }

    }

    public static void printArrayInt(Integer[] arrInt){
        for (Integer ele : arrInt){
            System.out.println(ele);
        }
    }
    public static void printArrayStr(String[] arrStr){
        for (String ele : arrStr){
            System.out.println(ele);
        }
    }
    }
