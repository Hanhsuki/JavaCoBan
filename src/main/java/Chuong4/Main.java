package Chuong4;

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

    public static void bai1() {
        //Class là 1 đối tượng chung chúng ta có thể tạo ra nhiều đối tượng
        PropertyVaMethod pm = new PropertyVaMethod();
        PropertyVaMethod pm1 = new PropertyVaMethod();

        pm.name = "Hạnh";
        pm.birthday = 1994;

        pm1.name = "Hoa";
        pm1.birthday = 1995;

        System.out.println("Đối tượng 1");
        System.out.println("Name:" + pm.name);
        System.out.println("Birthday:" + pm.birthday);

        System.out.println(".............................");
        System.out.println("Đối tượng 2");
        System.out.println("Name:" + pm1.name);
        System.out.println("Birthday:" + pm1.birthday);
    }

    public static void bai2() {
        GetterVaSetter gs = new GetterVaSetter();

        gs.setName("Hạnh");
        gs.setBirthday(1994);

        System.out.println("Name:" + gs.getName());
        System.out.println("Birthday:" + gs.getBirthday(1994));
    }
    public static void bai3() {
        ShowInfo st1 = new ShowInfo();

        System.out.println("Đối tượng 1:");
        st1.setName("Hạnh");
        st1.setBirthday(1994);
        st1.showInfo();

        System.out.println("Đối tượng 2:");
        st1.setName("Linh");
        st1.setBirthday(1995);
        st1.showInfo();
    }
    public static void bai4(){
        GetAge ga = new GetAge();
        ga.setBirthday(1994);
        int age = ga.getAge();
        System.out.println(age);

    }

    public static void bai5(){
        Overloading ov = new Overloading();

        ov.setName("Hạnh");
        ov.setName();
        System.out.println(ov.getName());
    }

    public static void bai6(){
        Constructor con = new Constructor("peter",2000);
        con.showInfo();

    }
    public static void bai7(){
        ShowInfo si = new ShowInfo();
        si.showInfo();

        Inheritance in = new Inheritance();
        in.setName("Hạnh");
        in.showInfo();
    }
    public static void bai8(){
        Overriding or = new Overriding();
        or.showInfo();
    }
    public static void bai9(){
        StaticMethodVaStaticProperty smvsp = new StaticMethodVaStaticProperty();
//        StaticMethodVaStaticProperty smvsp1 = new StaticMethodVaStaticProperty();
//        StaticMethodVaStaticProperty smvsp2 = new StaticMethodVaStaticProperty();
//
//        smvsp.showCount();
//        smvsp1.showCount();
//        smvsp2.showCount();
//
/*Khi biến count là biến static ta có thể truy cập trực tiếp vào biến count mà không cần khởi tạo đối tượng
chỉ cần truy cập thông qua class. */
        System.out.println(StaticMethodVaStaticProperty.count);

// truy cập method static không cần khởi tạo đối tượng
        StaticMethodVaStaticProperty.showCount();
    }

}
