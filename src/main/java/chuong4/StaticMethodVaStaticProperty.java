package chuong4;
/* Static là từ khóa được sử dụng trong việc quản lý bộ nhớ
Khi các thuộc tính hoặc các phương thức có sử dụng từ khóa static thì chúng ta có thể truy cập đến các thuộc
tính hoặc method này mà không cần khởi tạo các đói tượng.
Static có thể áp dụng cho các thành phần sau:
1. method
2. Property
3. Block
4. Nested class
*/
public class StaticMethodVaStaticProperty {
    public StaticMethodVaStaticProperty(){
        count++;
    }
//muốn truy cạp method ở trong method static thì method cũng phải là method static
    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
/* Biến count khi không có static thì khi chúng ta khời tạo nhiều đối tượng khác nhau, chúng sẽ tạo ra các
vùng nhớ khác nhau cho từng đối tượng.
Khi thêm static cho biến count thì các đối tượng được khởi tạo đều thao tác trên cùng 1 biến count
*/
    public static int count = 0;
    public static String college = "CTU";
//muốn truy cập biến ở trong method static thì biến truy cập cũng phải là biến static
    public static void showCount(){
        System.out.println("Count:" + count );
        System.out.println("College:" + college);
        System.out.println("GetCount:" + getCount());
    }

}
