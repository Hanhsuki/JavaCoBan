package chuong6;

/* Abstract class là class chứa bộ khung cơ bản với các thuộc tính và các phương thức trừu tượng
Abstract method là phương thức chưa hoàn thiện, chỉ có tên, kiểu trả về và tham số nó không có định nghĩa rõ
ràng cho phương thức.
Các lớp extend từ lớp abstract sẽ có nhiệm vụ hoàn thiên các abstract method
Abstract class được xậy dựng bởi các kỹ sư hệ thống có kinh nghiệm.
*/
public class Main {
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4();
//        bai5();
//        bai6();
//        bai7();
//        bai8();
        bai9();
    }
    public static void bai1(){
        SubAbstractClass ac = new SubAbstractClass();
        ac.mainboad();
    }
// Chúng ta không thể tạo đối tượng trực tiếp từ interface, mà phải tạo thông qua subclass
    public static void bai2() {
        SubInterface si = new SubInterface();
        si.eat();
        si.toc();
        si.keyboad();
    }
    public static  void bai3(){
        DefaultVaStatic ds = new DefaultVaStatic();
        ds.eat();
        Interface.staticAbstract();
        ds.defaultAbstract();
    }

    public static void bai4(){
        ToStringVaEqual ts = new ToStringVaEqual(120,"java");
        ToStringVaEqual ts1 = new ToStringVaEqual(20,"php");

//        ts.toString();
        System.out.println(ts);
        System.out.println(ts1.toString());
        if(ts.equals(ts1)){
            System.out.println("Bằng nhau");
        }else {
            System.out.println("không bằng nhau");
        }
    }
    public static void bai5(){
        GiamSuPhuThuocGiuaCacClass gs = new GiamSuPhuThuocGiuaCacClass();
        SuPhuThuoc1 sp1 = new SuPhuThuoc1();
        SuPhuThuoc2 sp2 = new SuPhuThuoc2();
        gs.play(sp1);
        gs.play(sp2);
    }

    public  static void bai6(){
        PhanLoaiInnerClass pl = new PhanLoaiInnerClass();
        PhanLoaiInnerClass.MemberInnerClass  plm = pl.new MemberInnerClass();
        pl.name = "Hạnh";
        pl.setBirthday(1994);
        plm.setCost(9);
        plm.memberShowInfo();
    }
/* Anonymous Inner Class
là 1 class ẩn danh để tạo interface mà không cần implement qua 1 class con
Toàn bộ nội dung này đươc gọi là 1 anonymous inner class và không biết tên của class
 */
    public static void bai7(){
        Interface in = new Interface() {
            @Override
            public void eat() {
                System.out.println("Eat");
            }

            @Override
            public void sleep() {
                System.out.println("Sleep");
            }
        };
// có thể truy cập và các phương thức trong interface bình thường
        in.eat();
        in.sleep();
    }
/* khi gọi showInfo chúng sẽ gọi đến method trong showInfo và khởi tạo class local trong showInfo, sau đó sẽ
run đến các method trong class local.
Class local có thể truy cập được vào các biến trong phạm vi của method mà chúng thuộc nhưng chúng phải là 1
biến final hoặc giá trị của chúng không được thay đổi trong suốt quá trình thưc thi chương trình.
*/
    public static void bai8(){
        PhanLoaiInnerClass pl = new PhanLoaiInnerClass();
        pl.showInfo();
    }
/* Chúng ta có thể truy cập static class trực tiếp thông qua tên class mà không cần khởi tạo đối tượng của nó
*/
    public static void bai9(){
        PhanLoaiInnerClass.StaticNestedClass pls = new PhanLoaiInnerClass.StaticNestedClass();
        pls.staticNestedClassShowInfo();
    }
    public static void bai10(){
//        SubClassNestedInnerInterface sni = new SubClassNestedInnerInterface();
        Interface.NestedInnerInterface sni = new SubClassNestedInnerInterface();
        sni.run();
    }
    }

