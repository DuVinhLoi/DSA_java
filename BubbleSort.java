import java.util.Arrays;
import java.util.Scanner;
//Ý tưởng: so sánh từng cặp với nhau
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        for(int i=0; i<n-1; i++){
            for(int j = 0; j<n - i -1; j++){
                if(arr[j] > arr[j+1]){
                    //Phải có biến tạm để lưu i
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("Iteration i " + i + " Iteration j " + j + " Swapped " + arr[j] + " and " + arr[j+1]);
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
