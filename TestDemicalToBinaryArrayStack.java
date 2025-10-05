
import java.util.Scanner;

public class TestDemicalToBinaryArrayStack {
    public static void main(String[] args) {
        System.out.print("Nhập số thập phân: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Chuỗi thập phân: " + DemicalToBinaryArrayStack.DemicaltoBinary(n));
    }
}
