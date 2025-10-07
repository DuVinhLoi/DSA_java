import java.util.Scanner;
public class LinearSearch {

    public static int linearSearch(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; //trả về vị trí
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        System.out.println("Nhập mảng: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập phần tử cần tìm: ");
        int x = sc.nextInt();
        System.out.println(linearSearch(arr, n, x));
    }
}
