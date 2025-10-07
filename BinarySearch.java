// Ý tưởng: Chỉ dùng được với mảng đã sắp xếp.

// Chọn phần tử ở giữa mảng → so sánh với giá trị cần tìm.

// Nếu bằng → tìm thấy.

// Nếu nhỏ hơn → tìm bên phải.

// Nếu lớn hơn → tìm bên trái.

// Lặp lại quá trình (hoặc dùng đệ quy).
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int left, int right, int key) {
        if(left <= right){
        int mid = left + (right - left) / 2;

        if(arr[mid] == key) return mid;

        if(arr[mid] > key){ //mid lớn hơn key thì tìm bên trái
            return binarySearch(arr, left, mid - 1, key);
        } else {
            return binarySearch(arr, mid + 1, right, key);
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
        int key = sc.nextInt();
        System.out.println("Vị trí của phần tử: " + binarySearch(arr, 0, n - 1, key));
    }
}
