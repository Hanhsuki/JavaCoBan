package chuong7;
/* Interface list có 3 class con là arraylist, vector và linkedList.
1. Array list: Là một mảng động dùng để lưu trữ các phần tử, các phần tử trong list có thể trùng nhau,
thứ tự thêm vào của các phần từ cũng là thứ thự của các phần tử trong list.
2. Tìm hiều về các method để duyệt các phần tử trong list bằng vòng for và iterator
*/
public class ListInterface {
    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public ListInterface(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String name;
    public int time;

    public String toString(){
        String result = "Info: \n - Name: " + name + "\n - Time: " + time;
        return result;
    }

}
