import java.util.Scanner;

public class Recursive {

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int mu (int a, int b) {
        if (b == 0) {
            return 1;
        }
        if(b%2==0){
            return mu(a,b/2)*mu(a,b/2);
        } else {
            return mu(a,b/2)*mu(a,b/2)*a;
        }
    }



    public static int countChuSo(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + countChuSo(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        System.out.println(mu(a, b));
    }
    
}
