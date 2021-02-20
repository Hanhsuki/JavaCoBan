package chuong6;
/*Để kế thừa 1 interface ta phải dùng implement
Các class kế thừa interace phải override lại các phương thức
1 class có thể implement từ nhiều interface
 */
public class SubInterface extends SubAbstractClass implements Interface,Interface1 {
    @Override
    public void eat() {
        System.out.println("Hello");

    }

    @Override
    public void sleep() {

    }

    @Override
    public void toc() {
        System.out.println("Good morning");
    }
}
