package chuong7;

import javax.tools.JavaCompiler;
import java.util.*;

/* Nhược điểm của array:
1. Có kích thước cố định
2. Các phần từ trong mảng phải cùng kiểu dữ liệu và năm liền kề nhau trong bộ nhớ
Collection khắc phục các nhược điểm trên của mảng, ngoài ra còn hỗ trợ thêm các method: tìm kiếm, sắp xếp, chèn,
thao tác, xóa phần từ,...
Collection là một công cụ có thể chứa và thao tác với các đối tượng thuộc nhiều loại khác nhau.
*/
public class Collections {
    public static void main(String[] args) {
//        ArrayList();
//        LinkedList();
//        HashSet();
//        LinkHashSet();
//        TreeSet();
//        HashMap();
//        LinkHashMap();
//        TreeMap();
//        StaticMethod();
//        Comparable();
        Comparator();

    }
    public static void ArrayList(){
        ListInterface  lin = new ListInterface("Java", 30);
        List lst = new ArrayList();
        lst.add("java"); //Thêm giá trị cho đối tượng (giá trị đầu tiên sẽ ở vị trí 0)
        lst.add(12); // Chúng ta có thể thêm phần tử thuộc nhiều kiểu dữ liệu khác nhau vào list
        lst.add(lin); // Có thể thêm 1 đối tượng tự đinh nghĩa.

        System.out.println(lst.size());
        System.out.println(lst.get(0));
        lst.set(0,"php");
        System.out.println(lst.get(0));
// In ra tất cả phần tử của list
        for(int i =0; i<lst.size(); i++){
            System.out.println(lst.get(i));
        }
        for (Object ele : lst){
            System.out.println(ele);
        }
// Khi thao tác với collection chúng ta sẽ dùng iterator

        Iterator iterator = lst.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//Xóa phần tủ trong list
        lst.remove(0);
        lst.remove("php");

        Iterator iterator2 = lst.iterator();
        while (iterator2.hasNext()){   // Nếu bằng true sẽ không ghi == true mà bỏ đi luôn
            System.out.println(iterator2.next());
        }
// Xóa all
        lst.clear();
// khi list là giá trị rỗng chúng ta không nên gọi đến iterator, nếu bằng false thì sẽ thay bằng dấu chấm than ở đầu
        if(!lst.isEmpty()){
            Iterator iterator3 = lst.iterator();
            while (iterator3.hasNext() == true) {
                System.out.println(iterator3.next());
            }
        }else{
                System.out.println("List is empty!");
            }
    }
/* sử dụng doubly linklist (danh sách liên kết đôi) để lưu trữ các phần tử, có thể trùng nhau. chúng vừa implement
từ interface list vừa implement từ interface dequeue.
Các phần còn lại cũng như array list
*/
    public static void LinkedList(){
        ListInterface  lin = new ListInterface("Java", 30);
        List llst = new LinkedList();
        llst.add("java"); //Thêm giá trị cho đối tượng (giá trị đầu tiên sẽ ở vị trí 0)
        llst.add(12); // Chúng ta có thể thêm phần tử thuộc nhiều kiểu dữ liệu khác nhau vào list
        llst.add(lin); // Có thể thêm 1 đối tượng tự đinh nghĩa.

        System.out.println(llst.size());
        System.out.println(llst.get(0));
        llst.set(0,"php");
        System.out.println(llst.get(0));
// In ra tất cả phần tử của list
        for(int i =0; i<llst.size(); i++){
            System.out.println(llst.get(i));
        }
        for (Object ele : llst){
            System.out.println(ele);
        }
// Khi thao tác với collection chúng ta sẽ dùng iterator

        Iterator iterator = llst.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//Xóa phần tủ trong list
        llst.remove(0);
        llst.remove("php");

        Iterator iterator2 = llst.iterator();
        while (iterator2.hasNext()){   // Nếu bằng true sẽ không ghi == true mà bỏ đi luôn
            System.out.println(iterator2.next());
        }
// Xóa all
        llst.clear();
// khi list là giá trị rỗng chúng ta không nên gọi đến iterator, nếu bằng false thì sẽ thay bằng dấu chấm than ở đầu
        if(!llst.isEmpty()){
            Iterator iterator3 = llst.iterator();
            while (iterator3.hasNext() == true) {
                System.out.println(iterator3.next());
            }
        }else{
            System.out.println("List is empty!");
        }
    }
/* Array list sẽ tốt hơn khi chúng ta lưu trữ và truy cập vào các phần tử, còn với linklist sẽ tốt hơn
ở các thao tác cập nhật và xóa các phần từ.
*/
    public static void HashSet() {
        Set hs = new HashSet();

        hs.add("java");
        hs.add(12);
        hs.add(9);
        hs.add(50);
// Thứ tự các phần tự trong set sẽ bị thay đổi so với thứ tự add vào set.
        Iterator in = hs.iterator();
        while (in.hasNext()){
            System.out.println(in.next());
        }

    }
// LinkHashSet đảm bảo thứ tự các phần tử được đưa vào set
    public static void LinkHashSet() {
        System.out.println("................................");
        Set hs = new LinkedHashSet();

        hs.add("java");
        hs.add(12);
        hs.add(9);
        hs.add(50);
        Iterator in = hs.iterator();
        while (in.hasNext()){
            System.out.println(in.next());
        }

    }
// TreeSet sẽ sắp xếp giá trị tăng dần của các phần tử trong set
    public static void TreeSet() {
        System.out.println("................................");
        Set hs = new TreeSet();

        hs.add(12);
        hs.add(9);
        hs.add(50);
        Iterator in = hs.iterator();
        while (in.hasNext()) {
            System.out.println(in.next());
        }
    }

    public static void HashMap() {
        System.out.println("................................");
        Map hm = new HashMap();
// Thêm phần tử vào map.
        hm.put("code","Hạnh");
        hm.put("Birthday",1994);
// In ra các phần tử của map
        System.out.println(hm.toString());
/* collection map không hỗ trợ iterator, nên để gọi đến iterator chúng ta sẽ gọi đến mehthod setkey(), phowng thức
này sẽ trả về 1 đối tượng thuộc kiểu Set Interface
*/
// In ra các key của map, hash map sẽ không đảm bảo thứ tự của việc insert vào map
        Iterator itr = hm.keySet().iterator();
        while (itr.hasNext()){
            Object key = itr.next(); // Các key là 1 đối tượng nên ta phải tạo ra 1 object
            Object value = hm.get(key); //In ra value
            System.out.println(key);
            System.out.println(value);
        }

    }
// LinkHashMap đảm bảo thứ tự của các phần tử được thêm vào
    public static void LinkHashMap() {
        System.out.println("................................");
        Map hm = new LinkedHashMap();

        hm.put("code","Hạnh");
        hm.put("Birthday",1994);

        System.out.println(hm.toString());

        Iterator itr = hm.keySet().iterator();
        while (itr.hasNext()){
            Object key = itr.next(); // Các key là 1 đối tượng nên ta phải tạo ra 1 object
            Object value = hm.get(key); //In ra value
            System.out.println(key);
            System.out.println(value);
        }

    }
/* Các phần tử được sắp xếp theo thứ tự tăng dần của key, dẫn đến việc thêm, chỉnh sửa treemap sẽ cho hiệu năng
thấp hơn so với hashmap và linkhashmap */
    public static void TreeMap() {
        System.out.println("................................");
        Map hm = new TreeMap();

        hm.put("code","Hạnh");
        hm.put("Birthday",1994);

        System.out.println(hm.toString());

        Iterator itr = hm.keySet().iterator();
        while (itr.hasNext()){
            Object key = itr.next(); // Các key là 1 đối tượng nên ta phải tạo ra 1 object
            Object value = hm.get(key); //In ra value
            System.out.println(key);
            System.out.println(value);
        }

    }

    public static void StaticMethod(){
        StaticMethodInCollection.staticMethod();

    }

    public static void Comparable() {
        SuDungComparableInterface sd = new SuDungComparableInterface("java", 30);
        SuDungComparableInterface sd1 = new SuDungComparableInterface("php", 50);
        SuDungComparableInterface sd2 = new SuDungComparableInterface("css", 40);

        ArrayList list = new ArrayList();

        list.add(sd);
        list.add(sd1);
        list.add(sd2);
/* Chúng ta không thể sắp sếp 1 list các đối tượng, để khắc phục chúng ta sẽ implement comparable, và định nghĩa
lại phương thức compareTo();

 */
        java.util.Collections.sort(list);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void Comparator(){
        SuDungComparatorInterface sd = new SuDungComparatorInterface("java", 30);
        SuDungComparatorInterface sd1 = new SuDungComparatorInterface("php",50);
        SuDungComparatorInterface sd2 = new SuDungComparatorInterface("css",40);
        ArrayList list = new ArrayList();
        list.add(sd);
        list.add(sd1);
        list.add(sd2);

        java.util.Collections.sort(list,new SuDungComparatorInterface.TimeComparator()); // Truyền vào list cần sắp xếp và class implement comparator

// Nếu không tạo class mới chúng ta có thể implement trực tiếp tại đây
        java.util.Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                SuDungComparatorInterface sdc = (SuDungComparatorInterface) o1;
                SuDungComparatorInterface sdc1 = (SuDungComparatorInterface) o2;
                return sdc.getName().compareTo(sdc1.getName());
            }
        });

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        java.util.Collections.sort(list, new SuDungComparatorInterface.NameComparator());

    }
}


