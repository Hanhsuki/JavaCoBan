package Chuong6;
/* Inner class là một class được khai báo nằm trong 1 class khác có tác dụng
1. Tạo nhóm quan hệ giữa các class với nhau
2. Các class lồng nhau tính năng dễ đọc và dễ bảo trì
3. Mã nguồn ngắn gọn và đơn giản.
Các loại inner class
1. Member inner class: class nằm trong class và ngoài các method
2. Anonymous Inner class: Class ẩn danh được tạo ra để thực hiện các interface hoặc các class mở rộng khác
3. Local inner class: Class nằm trong method
4. static nested class: static class được tao ra bởi 1 class
5. Nested interface: Interface được tạo ra bởi 1 class hoặc 1 interface
*/
public class PhanLoaiInnerClass {
    public String name;
    public int birthday;
    public static int chapter;
//Các method chỉ có thể truy cập vào các biến static ở ngoài class cha.
    static class StaticNestedClass{
        public void staticNestedClassShowInfo(){
            System.out.println("Chapter\t:" + chapter);

        }

    }

    class MemberInnerClass{
        public double cost;

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
        public void memberShowInfo(){
            System.out.println("Name\t:" + getName());
            System.out.println("Birthday\t:" + getBirthday());
            System.out.println("Cost\t:" + this.getCost());

        }

    }
    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void showInfo(){
        System.out.println("Name\t:" + this.getName());
        System.out.println("Birthday\t:" + this.getBirthday());

        class LocalInnerClass{
            public double cost;

            public double getCost() {
                return cost;
            }

            public void setCost(double cost) {
                this.cost = cost;
            }
            public void localShowInfo(){
                System.out.println("Name\t:" + getName());
                System.out.println("Birthday\t:" + getBirthday());
                System.out.println("Cost\t:" + this.getCost());
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.localShowInfo();
    }
}
