import java.util.Arrays;
import java.util.Scanner;
/* Ý tưởng Selection Sort:

Chọn phần tử nhỏ nhất trong mảng và đưa nó về đầu dãy.

Sau đó, lặp lại cho phần còn lại của mảng.

Mỗi vòng lặp cố định 1 phần tử đúng vị trí. */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                //Vòng for này liên tục cập nhật vị trí nhỏ nhất đến khi không thấy số nào nhỏ hơn
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // chỉ cập nhật vị trí NHỎ NHẤT
                }
            }
            // Hoán đổi sau khi tìm xong minIndex
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

                System.out.println("Iteration i " + i + ": Swapped " + arr[minIndex] + " and " + arr[i]);
            }

            System.out.println("After iteration " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
