
import java.util.Arrays;
// Ý tưởng: Ý tưởng chính

// QuickSort là “chia để trị” (Divide and Conquer), nhưng khác MergeSort ở chỗ nó không cần mảng phụ.
// Thay vì chia mảng đều ra, QuickSort chọn pivot rồi “phân hoạch” sao cho:

// Tất cả phần tử bên trái pivot < pivot

// Tất cả phần tử bên phải pivot > pivot

// Sau đó đệ quy sắp xếp từng nửa đó.
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 9, 1, 5, 8};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    // Hàm chính của QuickSort
    public static void quickSort(int[] arr, int left, int right) {
        // Điều kiện dừng: khi mảng còn 1 phần tử thì không cần sắp xếp
        if (left < right) {
            // Chọn pivot là phần tử giữa
            int pivotIndex = partition(arr, left, right);

            // Đệ quy sắp xếp 2 nửa (trái và phải) của pivot
            // Chạy trái trước → chia nhỏ tới khi không còn chia được
            // rồi quay lại xử lý phải
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    // Hàm chia mảng dựa trên pivot
    public static int partition(int[] arr, int left, int right) {
        // Chọn pivot là phần tử giữa cho cân bằng
        int mid = (left + right) / 2;
        int pivot = arr[mid];
        System.out.println("\nPhân hoạch mảng: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1))
                + " | Pivot = " + pivot);

        int i = left;
        int j = right;

        // Thuật toán: 2 con trỏ chạy từ 2 đầu vào giữa
        while (i <= j) {
            // Tăng i đến khi tìm thấy phần tử lớn hơn pivot
            while (arr[i] < pivot) {
                i++;
            }

            // Giảm j đến khi tìm thấy phần tử nhỏ hơn pivot
            while (arr[j] > pivot) {
                j--;
            }

            // Nếu i <= j thì hoán đổi 2 phần tử bị sai vị trí
            if (i <= j) {
                System.out.println("Hoán đổi " + arr[i] + " ↔ " + arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // Sau khi while kết thúc, i là chỉ số đầu tiên của nửa phải
        System.out.println("Sau phân hoạch: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1))
                + " | i=" + i + " j=" + j);

        // Trả về chỉ số để chia mảng ở bước đệ quy kế tiếp
        return i - 1; 
    }
}

// Giả sử ta có mảng:

// [12, 9, 1, 5, 8]

// Bước 1️⃣: Chọn pivot

// Chọn phần tử cuối cùng làm pivot: 8

// Ta tách mảng ra:

// Trái: các phần tử nhỏ hơn 8

// Phải: các phần tử lớn hơn 8

// Sau khi chia, mảng sẽ được sắp xếp như sau:

// [5, 1]  8  [12, 9]


// (8 ở giữa vì mọi thứ nhỏ hơn nó đã về bên trái, lớn hơn thì bên phải)

// Bước 2️⃣: Gọi đệ quy

// Giờ ta sắp xếp hai mảng con [5, 1] và [12, 9] bằng cách làm tương tự.

// Phần trái [5, 1]

// Pivot = 1

// Chia mảng: [ ] 1 [5]
// → Kết quả phần trái: [1, 5]

// Phần phải [12, 9]

// Pivot = 9

// Chia mảng: [ ] 9 [12]
// → Kết quả phần phải: [9, 12]

// Bước 3️⃣: Gộp lại tất cả

// Ghép các phần lại:

// [1, 5] + [8] + [9, 12] = [1, 5, 8, 9, 12]