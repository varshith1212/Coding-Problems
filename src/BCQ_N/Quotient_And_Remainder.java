package BCQ_N;

import java.util.Scanner;

public class Quotient_And_Remainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dividend = scan.nextInt();
        int divisor = scan.nextInt();
        System.out.println("Quotient:"+ dividend/divisor);
        System.out.println("Remainder:" + dividend%divisor);
    }
}
