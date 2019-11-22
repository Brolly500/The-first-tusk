import java.util.Scanner;

class Test1{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x1 = read.nextInt();
        int x2 = read.nextInt();
        int x3 = read.nextInt();
        read.close();
        System.out.println(x1==x2|x2==x3|x1==x3 ? "Yes" : "No" );
    }
}
		