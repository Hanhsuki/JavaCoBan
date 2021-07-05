package baiTapOnTap;

public class VongLap {
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4();
//        bai5();
        bai6();


    }
// Bài 1: Tính số trung bình cộng của các kí tự trong mảng
    public static void bai1(){
        double[] arr = {10,50,6,6.5};
        double total = 0;
        for (int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.println("Trung bình cộng các kí tự của mảng là: " + average);
    }
// Bài 2: Tính tổng các ký tự trong mảng
    public static void bai2() {
        double[] arr = {10, 50, 6, 6.5};
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        System.out.format("Tổng các kí tự của mảng là: %.3f", total);
    }
// Bài 3: Đảo ngươc các phần tử của mảng
    public static void bai3(){
        int[] number = {20,61,3,20,59,48};
        int i = 0, j=number.length - 1, temp;
        while(i<j)
        {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }
        for(i=0; i<number.length; i++)
        {
            System.out.print(number[i]+ "  ");
        }
    }
// Bài 4: Sắp xếp các phần tử trong mảng tăng dần
    public static void bai4(){
        int[] number = {20,61,3,20,59,48};
        for (int i = 0; i < number.length; i++){
            for (int j = i+1; j < number.length; j++){
                if (number[i] > number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < number.length - 1; i++){
            System.out.println(number[i] + ",");
        }
        System.out.println(number[number.length-1]);
    }
// Bài 5: Chuyển đổi mảng thành chuỗi trong java
    public static void bai5(){
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        // cách 1
        String str = new String(ch);
        System.out.println(str);
        // cách 2
        String str2 = String.valueOf(ch);
        System.out.println(str2);
    }
// Bài 6: Cộng 2 ma trận 2 chiều (2 MT chỉ cộng được với nhau khi chúng cùng kích thước)
    public static void  bai6(){
        int rows = 2, columns = 4;
//Khai báo hai ma trận dưới dạng mảng đa chiều
        int[][] MatrixA = {{1, 1, 1, 1}, {2, 3, 5, 2}};
        int[][] MatrixB = {{2, 3, 4, 5}, {2, 2, 4, -4}};
/* Khai báo một tổng ma trận, đó sẽ là tổng của MatrixA và MatrixB,
ma trận tổng sẽ có cùng các hàng và cột như các ma trận đã cho.
*/
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }
//Hiển thị ma trận tổng
        System.out.println("Ma trận tổng của hai ma trận đã cho là: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
