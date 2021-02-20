package chuong7;

public class SuDungComparableInterface implements Comparable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public SuDungComparableInterface(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String name;
    public int time;

    public String toString(){
        String result = "Info: \n - Name: " + name + "\n - Time: " + time;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        SuDungComparableInterface sdc = (SuDungComparableInterface) o;
        if(this.getTime() > sdc.getTime()) return 1;  // trả về -1 để sắp xếp giảm dần
        else if(this.getTime() < sdc.getTime())  return -1; // trả về 1 để sắp xếp giảm dần
        return 0;
    }
}
