package chuong9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SuDungClassPatternAndMath {
    public static String input = "abc";

    public static void main(String[] args) {
        viDu();
        patternAndMath();
        case2PatternAndMath();
        chuoiPhucTap();
        replaceAll();
        lookingAt();

    }

    public static void viDu() {

        if (input.matches("[A-z_]+")) {//input là các kí tự từ a-z(cả hoa và thường) chấp nhận cả dấu gạch dưới, đươc xuất hiện nhiều lần
            System.out.println("Biểu thức hợp lệ");
        } else {
            System.out.println("Biểu thước không hợp lệ");
        }

    }
    public static void patternAndMath() {
        Pattern pattern = Pattern.compile("[A-z_]+"); // truyền vào biểu thức chính quy
        Matcher matcher = pattern.matcher(input); // Truyền vào biến cần kiểm tra

        if (matcher.matches()) { //input là các kí tự từ a-z(cả hoa và thường) chấp nhận cả dấu gạch dưới, đươc xuất hiện nhiều lần
            System.out.println("Biểu thức hợp lệ");
        } else {
            System.out.println("Biểu thước không hợp lệ");
        }
    }
    public static void case2PatternAndMath() {
        if (Pattern.matches("[A-z_]+",input)) {
            System.out.println("Biểu thức hợp lệ");
        } else {
            System.out.println("Biểu thước không hợp lệ");
        }

    }
    public static void chuoiPhucTap() {
        String inputOne = "Zend.VN";
        String inputTwo = "Zend.VN";
        Pattern pattern = Pattern.compile("Zend.vn", Pattern.CASE_INSENSITIVE); // So sánh k phân biệt chữ hoa và chữ thường
        Matcher matcher = pattern.matcher(inputOne);
        if (matcher.matches()) {
            System.out.println("Biểu thức hợp lệ");
        } else {
            System.out.println("Biểu thước không hợp lệ");
        }
        matcher.reset(inputTwo); //Khi có 2 chuỗi cần so sánh
        if (matcher.matches()) {
            System.out.println("Biểu thức hợp lệ");
        } else {
            System.out.println("Biểu thước không hợp lệ");
        }
    }
    public static void replaceAll() {
        String inputThree = "Java is very   easy";
        Pattern pattern = Pattern.compile("\\s+"); // tìm các khoảng trắng (1 hoặc nhiều hơn)
        Matcher matcher = pattern.matcher(inputThree);

        System.out.println(matcher.replaceAll("\t"));
    }
    public static void lookingAt() { // So sánh giá trị bắt đầu trùng là đuọc
        String inputFour = "JavaAndroid";

        Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE); // So sánh k phân biệt chữ hoa và chữ thường
        Matcher matcher = pattern.matcher(inputFour);

        if (matcher.lookingAt()) {
            System.out.println("Biểu thức hợp lệ");
        } else {
            System.out.println("Biểu thước không hợp lệ");
        }
    }

}