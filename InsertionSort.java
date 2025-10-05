import java.util.Arrays;
//Ý tưởng: Duyệt mảng từ trái sang phải, coi phần bên trái là đã sắp xếp, sau đó chèn phần tử hiện tại vào đúng vị trí trong phần đã sắp xếp đó.
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];     // phần tử cần chèn
            int j = i - 1;

            // Dịch các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                System.out.println("Dịch phần tử " + arr[j] + " sang phải");
                arr[j + 1] = arr[j];
                j--;
                System.out.println(Arrays.toString(arr));
            }

            // Chèn key vào vị trí đúng
            arr[j + 1] = key;

            System.out.println("Sau vòng " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 9, 1, 5};
        System.out.println("Trước khi sắp: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sau khi sắp:   " + Arrays.toString(arr));
    }
}
