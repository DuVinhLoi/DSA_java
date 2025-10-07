import java.util.Arrays;
// Ý tưởng: Chia nhỏ nó ra rồi sắp xếp
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 9, 1, 5, 8};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1); //Bỏ suy nghĩ ko trừ 1 đi vì lỡ đệ quy mergeSort(arr, 3, 4) sẽ báo lỗi index out of bound

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    // Hàm chia mảng
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            System.out.println("\nChia mảng: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
            System.out.println("Trái: " + Arrays.toString(Arrays.copyOfRange(arr, left, mid + 1)) +
                               " | Phải: " + Arrays.toString(Arrays.copyOfRange(arr, mid + 1, right + 1)));

            // Đệ quy chia mảng bên trái và bên phải
            // Được chia nửa đến khi nào mảng còn 1 cái mỗi bên trái phải rồi quăng vào merge
            
            // Lần gọi đầu tiên nó ở main đã tách thành 2 nửa trước rồi mới xử lý tiếp dưới đây
            mergeSort(arr, left, mid); // Gọi mergeSort(arr, 0, 2)  Chạy tách nửa trái hết rồi merge  mới xử lý tiếp xuống nửa phải
            mergeSort(arr, mid + 1, right); // Gọi mergeSort(arr, 3, 4)

            // Gộp hai nửa lại
            merge(arr, left, mid, right);
            System.out.println("Sau khi gộp: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
        }
    }

    // Hàm gộp (merge)
    public static void merge(int[] arr, int left, int mid, int right) {
        //Mạch suy nghĩ 
        // 1. cần lưu vào 2 mảng tạm L[] và R[] nhưng LƯU Ý MẢNG CẦN BIẾT SỐ LƯỢNG NÊN PHẢI TẠO n1,n2
        // 2. gộp hai mảng theo thứ tự tăng dần

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1]; // Khi đã vào L, R thì nó đã phải theo thứ tự mới là mergsort chuẩn
        int[] R = new int[n2];

        // Sao chép dữ liệu vào mảng tạm
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        System.out.println("Gộp " + Arrays.toString(L) + " và " + Arrays.toString(R));

        // Gộp hai mảng theo thứ tự tăng dần
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { //So sánh từng phần tử ở 2 mảng L[] và R[] cái nào bé hơn thì vô trước
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        //TẠI SAO LẠI CÓ VÒNG WHILE CUỐI NÀY?????????????
        // Ví dụ
        // L = [1, 4, 7]
        // R = [2, 3]
        // Lúc này mảng R đã hết, nhưng L còn lại [4, 7] chưa được gộp.
        // Nếu không có while (i < n1) → bạn sẽ mất 4 và 7 trong kết quả!  thì 2 vòng while kia sẽ xử lý phần còn lại

        // Sao chép phần còn lại của L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép phần còn lại của R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        System.out.println("Kết quả gộp: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
    }
}

// 1	Bắt đầu với mảng gốc [12, 9, 1, 5, 8]	main()
// 2	Chia đôi → [12, 9, 1] và [5, 8]	mergeSort(arr, 0, 4)
// 3	Xử lý nửa trái [12, 9, 1] → chia tiếp → [12, 9] và [1]	mergeSort(arr, 0, 2)
// 4	[12, 9] lại chia tiếp thành [12] và [9] rồi merge lại thành [9, 12]	Đệ quy nhỏ
// 5	Giờ merge [9, 12] với [1] → [1, 9, 12]	Merge kết quả nửa trái
// 6	Sau đó mới xử lý nửa phải [5, 8] → chia → [5], [8], merge → [5, 8]	mergeSort(arr, 3, 4)
// 7	Cuối cùng merge [1, 9, 12] với [5, 8] → [1, 5, 8, 9, 12]