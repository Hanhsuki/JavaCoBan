package chuong6;
/* để không phải implement lại các method ở các subclass khi thêm các abstract vào interface chúng ta có 2
cách.
--> Chúng ta sử dụng từ khóa default hoặc static để không cần định nghĩa các class implement từ interface đó
*/

public class DefaultVaStatic implements Interface{



    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
