import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n = read.nextDouble();
        double x1 = 0;
        double x2 = 1.0;
        if (n>=x2) {
            System.out.print(n-x2);
        }
        else if (n<=x1) {
            System.out.print(n*-1);
        }
        else {
            if(x2-n >= n) {
                System.out.print(n);
            }
            else {
                x2=x2-n;
                System.out.print((x2-n)*1);
            }
        }
        read.close();
    }
}
