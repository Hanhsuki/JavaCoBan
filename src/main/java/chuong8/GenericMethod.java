package chuong8;
/* Generic giúp phát hiện sớm các exception trong lúc biên dịch chương trình
*/
public class GenericMethod {
    public static void main(String[] args) {
        Integer[] arrInt = {10,20,30,40};
        String[] arrStr = {"Java","Android","php"};

        printArrayInt(arrInt);
        printArrayStr(arrStr);

        printArray(arrInt);
        printArray(arrStr);

    }
/* Vì param truyền vào của mỗi method là 1 kiểu dữ liệu khác nhau nên mình cần viết các hàm các nhau, dẫn đến
sẽ có rất nhiều method tạo ra cùng làm 1 nhiệm vụ ==> chúng ta sẽ viết 1 hàm chung cho việc printArray với nhiều
kiểu dữ liệu truyền vào.
Chữ T sẽ đại diện cho kiểu dữ liệu của method. Chúng ta có thể thay chữ T bằng chữ M.
*/
    public static <T> void printArray(T[] arr){
        for (T ele : arr){
            System.out.println(ele);
        }

    }

    public static void printArrayInt(Integer[] arrInt){
        for (Integer ele : arrInt){
            System.out.println(ele);
        }
    }
    public static void printArrayStr(String[] arrStr){
        for (String ele : arrStr){
            System.out.println(ele);
        }
    }
}
