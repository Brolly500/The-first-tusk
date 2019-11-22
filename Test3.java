import java.util.Scanner;


class Test3{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x1 = read.nextInt();
        int x2 = read.nextInt();
        int x3 = read.nextInt();
        read.close();
        if ((x1>x2 && x1>x3) || (x2>x1 && x2>x3) || (x3 >x1 && x3 >x2)) {
            System.out.println(1);
        }
        else if ((x1==x2 && x2>x3)|| (x1==x3 && x3>x2) || (x2==x3 && x3>x1)) {
            System.out.println(2);
        }
        else {
            System.out.print("3");
        }

    }
}