import java.util.Random;
import java.util.Scanner;
public class BaiTapMang {
    /*Viết chương trình nhập vào số nguyên n:
     * 1. Viết phương thức trả về 1 mảng số thực gồm n phần tử
     * 2. Viết phương thức gán giá trị x cho phần tử cuối cùng
     * 3. Viết phương thức trả về tổng 2 phần tử đầu tiên
     * 4. Viết phương thức sử dụng vòng lặp tính tổng của các phần tử trong mảng 
     * 5. Viết phương thức sử dụng vòng lặp tìm phần tử nhỏ nhất trong mảng
     * 6. Tự động tạo ra số ngẫu nhiên Index < n và hiển thị vị trí của phần tử tại trí index
    */

    float a[];
    public BaiTapMang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        a = taoMangSoThuc(n);
        System.out.println("Mảng ban đầu: ");
        inMang();
        System.out.println("\nNhập x: ");
        float x = sc.nextFloat();
        a = ganGiaTriXVaoViTriCuoi(a, x);
        System.out.println("Mảng sau khi gán x cho phần tử cuối: ");
        inMang();
        System.out.println("Tổng 2 phần tử đầu tiên: " + tong2PhanTuDau(a));
        System.out.println("Tổng các phần tử: " + tinhTong(a));
        System.out.println("Phần tử nhỏ nhất: " + findMin(a));
        printRandom(n);
    }

    public void inMang(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }   
    }

    public float[] taoMangSoThuc(int n){
        float temp[] = new float[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            temp[i] = r.nextFloat();
        }
        return temp;
    }

    public float[] ganGiaTriXVaoViTriCuoi(float a[], float x){
        int o = a.length-1;
        a[o] = x;
        return a;
    }

    public float tong2PhanTuDau(float a[]){
        return a[0] + a[1];
    }

    public float tinhTong(float a[]){
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public float findMin(float a[]) {
        float min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public void printRandom(int n) {
        Random r = new Random();
        int index;
        index = r.nextInt(n);
        System.out.println(" A[" + index + "]: " + a[index]);
    }

    public static void main(String[] args) {
        BaiTapMang mang = new BaiTapMang();
    }
}
