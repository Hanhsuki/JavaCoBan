package Chuong6;
/*Không thể tạo ra đối tượng của abstract class, chúng ta chỉ có thể tạo ra đối tượng của các lớp thuộc về
con của lớp abstract
Chúng ta có thể override các method trong class abstract như 1 class bình thường
 */
abstract public class AbstractClass {
    public void mainboad(){
        System.out.println("main boad");
    }
// 1 abstract method chỉ có tên, kiểu trả về và tham số không có định nghĩa rõ ràng và khối lệnh bên trong/
    abstract public void keyboad();

}
