package Chuong4;

import java.util.Calendar;

public class GetAge {
    public String name;
    public int birthday;

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
    public int getAge(){
        int age = 0;
        Calendar ca = Calendar.getInstance();
        return age = ca.get(Calendar.YEAR) - getBirthday();
    }
}
