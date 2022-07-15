import java.util.Scanner;

public class FiboBinet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        int a = scan.nextInt();
        int a = 50;
        System.out.println(fiboFormula(a));
//        System.out.println(fibo(a));
    }

    static long fiboFormula(int n){
        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

