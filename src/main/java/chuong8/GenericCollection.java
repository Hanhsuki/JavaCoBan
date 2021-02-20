package chuong8;

import java.util.*;

public class GenericCollection {
    public static void main(String[] args) {
        collectionList();
        collectionSet();
        collectionMap();

    }
// Muốn thêm các phần tử thuộc nhiều kiểu khác nhau chúng ta sẽ truyền vào Object
    public static void collectionList(){
//        List<Integer> lst = new ArrayList<Integer>();
        List<Object> lst = new ArrayList<Object>();

        lst.add(2);
        lst.add(50);
        lst.add("java");

        Iterator<Object> in = lst.iterator();
        while (in.hasNext()){
            System.out.println(in.next());
        }
    }
    public static void collectionSet(){
//        Set<Integer> lst = new HashSet<Integer>();
        Set<Object> lst = new HashSet<Object>();

        lst.add(2);
        lst.add(50);
        lst.add("java");

        Iterator<Object> in = lst.iterator();
        while (in.hasNext()){
            System.out.println(in.next());
        }
    }
    public static void collectionMap(){
        Map<Integer,String> lst = new HashMap<Integer,String>();

        lst.put(2,"50");
        lst.put(50,"9");
//        lst.put("java",60);

        Iterator<Integer> in = lst.keySet().iterator();
        while (in.hasNext()){
            int key = in.next();
            String value = lst.get(key);
        }

    }
}
