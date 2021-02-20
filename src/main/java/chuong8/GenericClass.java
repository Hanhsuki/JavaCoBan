package chuong8;
//Chúng ta muôn tham số truyền vào là kiểu gì thì chúng ta sẽ truyền vào <> kiểu dữ liệu mong muốn
public class GenericClass {
    public static void main(String[] args) {
        ClassGeneric<String,String> cg1 = new ClassGeneric();

        cg1.setTime("25h");
    }
}
