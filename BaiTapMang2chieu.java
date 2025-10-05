import java.util.Random;
import java.util.Scanner;

public class BaiTapMang2chieu {
    int dong, cot; //Để ra ngoài để nó là biến toàn cục
    int [][] matrixA, matrixB;

    public BaiTapMang2chieu() {
        System.out.print("Nhập số dòng: ");
        Scanner sc = new Scanner(System.in);
        dong = sc.nextInt(); //Ko int để nó la biến toàn cục không nó sẽ là biến cục bộ
        System.out.print("Nhập số cột: ");
        cot = sc.nextInt();

        matrixA = new int[dong][cot];
        matrixB = new int[dong][cot];
    }

    public void TaoMang() {
        Random r = new Random();
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                matrixA[i][j] = r.nextInt(10);
                matrixB[i][j] = r.nextInt(10);
            }
        }
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMatrixA(){
        printMatrix(matrixA);
    }
    public void printMatrixB(){
        printMatrix(matrixB);
    }

    public int[][] sumMatrix(){
        int[][] matrixSum = new int[dong][cot];
        for(int i = 0; i < dong; i++){
            for(int j = 0; j < cot; j++){
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixSum;
    }

    public int[][] mulMatrix(){
        int[][] matrixMul = new int[dong][cot];
        for(int i = 0; i < dong; i++){
            for(int j = 0; j < cot; j++){
                matrixMul[i][j] = 0;
                for(int k = 0; k < dong; k++){
                    matrixMul[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        return matrixMul;
    }
    
    public static void main(String[] args) {
        BaiTapMang2chieu matrix = new BaiTapMang2chieu();
        matrix.TaoMang();
        System.out.println("Mảng A: ");
        matrix.printMatrixA();
        System.out.println("Mảng B: ");
        matrix.printMatrixB();
        System.out.println("Hai mảng sau khi cộng: ");
        matrix.printMatrix(matrix.sumMatrix());
        System.out.println("Hai mảng sau khi nhân: ");
        matrix.printMatrix(matrix.mulMatrix());
    }
}
