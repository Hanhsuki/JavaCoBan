package Chuong6;

import java.util.Objects;

/* Tất cả các class trong java đều được kế thừa từ class cha là Class Object
Phương thức toString() dùng để in ra thông tin của một đối tượng nào đó
Phương thức equal() dùng để so sánh thông tin của các đối tượng.
*/
public class ToStringVaEqual {
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

    public ToStringVaEqual(int time, String name) {
        this.time = time;
        this.name = name;
    }

    public String name;
    public int time;

    public String toString(){
        String result = "Info: \n - Name: " + name + "\n - Time: " + time;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        ToStringVaEqual toStringVaEqual = (ToStringVaEqual) obj;
        if(this.getTime() == toStringVaEqual.getTime()) return true;
        return false;
    }
}
