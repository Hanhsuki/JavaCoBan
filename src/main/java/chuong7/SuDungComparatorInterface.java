package chuong7;

import java.util.Comparator;
// Comparator chỉ thực hiện được khi các đối tượng thuộc class được implement từ comparable
public class SuDungComparatorInterface implements Comparable{
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

    public SuDungComparatorInterface(String name, int time) {
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
        SuDungComparatorInterface sdc = (SuDungComparatorInterface) o;
        if(this.getTime() > sdc.getTime()) return 1;
        else if(this.getTime() < sdc.getTime())  return -1;
        return 0;
    }

    static class TimeComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            SuDungComparatorInterface sdc = (SuDungComparatorInterface) o1;
            SuDungComparatorInterface sdc1 = (SuDungComparatorInterface) o2;
            if (sdc.getTime() > sdc1.getTime()) return 1;
            else if (sdc.getTime() < sdc1.getTime()) return -1;
            return 0;
        }
    }
/* Để so sánh theo anphabetic chúng ta dùng compareTo() là 1 phương thức của class String, giúp so sánh các
kí tự và các chuỗi với nhau.
*/
    static class NameComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            SuDungComparatorInterface sdc = (SuDungComparatorInterface) o1;
            SuDungComparatorInterface sdc1 = (SuDungComparatorInterface) o2;

            return sdc.getName().compareTo(sdc1.getName());
        }
    }
}
