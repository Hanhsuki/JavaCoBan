package chuong6;
/* Interface không phải là một class, đây là một kiểu giao diện quy định 1 số phương thức bắt buộc cho một
class nào đó.
Interface không cho phép định nghĩa rõ các hoạt động của các phương thức, chỉ dừng lại ở việc khai báo các phương
thức, việc định nghĩa các phương thức được thực hiện ở class con.
*/
// Các phương thưc trong interface là các abstract method nên nó sẽ không có phần định nghĩa

public interface Interface {
    public void eat();
    public void sleep();

/*Dùng default hoặc static để không phải implement ở tất cả các sub class implement của interface. Khi thêm
default và static thì cần định nghĩa cách hoạt động của method. sử dụng static thì không cần khởi tạo
đối tượng mà gọi thông qua tên class */
    public default void defaultAbstract(){
        System.out.println("DefaultAbstract");
    }
    public static void staticAbstract(){
        System.out.println("DefaultAbstract");
    }
    interface NestedInnerInterface{
        public void run();
    }
}
