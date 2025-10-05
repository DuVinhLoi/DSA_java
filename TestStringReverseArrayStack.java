
import java.util.Scanner;

public class TestStringReverseArrayStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        
        System.out.println("Nhập chuỗi: ");
        String s = sc.nextLine();
        String reverseString = StringReverseArrayStack.reverseString(s);
        System.out.println("Chuỗi người dung nhập: ");
        System.out.println(s);
        System.out.println("Chuỗi sau khi đảo ngược: ");
        System.out.println(reverseString);
    }
}