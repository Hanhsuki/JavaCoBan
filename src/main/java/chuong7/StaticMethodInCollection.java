package chuong7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StaticMethodInCollection {
    public static void staticMethod() {
        List lst = new ArrayList();
        lst.add(50);
        lst.add(12);
        lst.add(1);
        lst.add(90);
        lst.add(10);
        lst.add(19);

// Sort ASC (tăng dần). sort là static method nên chúng ta gọi trực tiếp thông qua class không cần tạo đối tượng
        Collections.sort(lst);
        System.out.println(lst);
// Sort DESC (chúng ta sắp xếp tăng dần sau đó đảo ngươc lại (reverse)
        Collections.sort(lst);
        Collections.reverse(lst);
        System.out.println(lst);
// Tìm kiếm giá trị trong list (nếu index là 1 giá trị âm thì phần tử không tồn tại trong list)
        int index= Collections.binarySearch(lst,19);
        System.out.println(index);
// Tìm phần tử lớn nhất
        Collections.max(lst);
// Tìm phần tử nhỏ nhất
        Collections.min(lst);
// Đảo lộn vị trí các phần từ của list
        Collections.shuffle(lst);

    }

}
