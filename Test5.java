import java.util.Scanner;
public class Test5 {

public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите число:");
    int n = 0;
    n = in.nextInt();
    System.out.print("Число: " + nthPrime(n));
     in.close();
}
    public static int nthPrime(int n) {
        int candidate, count;
        for(candidate = 2, count = 0; count < n; candidate++) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        return candidate-1;
    }
    private static boolean isPrime(int n) {
        for(int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
