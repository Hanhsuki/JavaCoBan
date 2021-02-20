package chuong6;
/* Đề bài như sau:chúng ta có một đối tượng playstation, trong đối tượng này các dối tượng khác nhau các đối tượng
đó sẽ chứa các trò chơi (run và jump). khi chúng ta thêm 1 đối tượng trò chơi mới, chúng ta sẽ phải viết lại phần
method cho run và jumb. Để hạn chế sự phụ thuộc này chúng ta sẽ tạo ra 1 interface có 2 abstract là run và jumb
khi đó các đối tượng chỉ cần override lại abstract và class playstation chỉ cần tạo method để truyền các đối tượng
vào mà không cần phụ thuộc vào việc thêm các đối tượng trò chơi mới.

*/
public class GiamSuPhuThuocGiuaCacClass {
    public void play(GiamSuPhuThuoc obj){
        obj.jump();
        obj.run();
    }
}
