package chuong4;

/* Constructor cũng là 1 method, nó được gọi tự động và gọi đầu tiên khi 1 object được khởi tạo
Constructor không có giá trị trả về, có thể có tham số hoặc không
Constructor phải có cùng tên với tên của class
Constructor có thể bị nạp chống (overloading)
Nếu 1 class không khai báo constructor thì sẽ được java cung cấp 1 constructor mặc định
Chúng ta dùng constructor khi cần khởi tạo các giá trị mặc định cho các thuộc tính*/
public class Constructor {
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(int birthday) {

        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    //Constructor không tham số chúng ta khởi tạo giá trị cho thuộc tính
    public Constructor() {
        this.name     = "Hạnh";
        this.birthday = 2000;
    }
    public Constructor(String name, int birthday) {
        this.name     = name;
        this.birthday = birthday;
    }

    public String name;
    public int birthday;

    public void showInfo(){
        System.out.println("Name\t:" + this.getName());
        System.out.println("Birthday\t:" + this.getBirthday());
    }
}
