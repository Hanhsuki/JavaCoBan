package chuong4;
//Overloading method là những phương thức nằm trong cùng 1 class có cùng tên nhưng khác tham số truyền vào (Khác kiểu dữ liệu hoặc số lương tham số)

public class Overloading {
    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        this.name = "Linh";
    }

    public void setBirthday(int birthday) {

        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getBirthday(int i) {
        return birthday;
    }

    public String name;
    public int birthday;

}
