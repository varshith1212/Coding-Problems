package BCQ_N;

import java.util.Scanner;

public class LastDigitEliminationAndRemainingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int r = num%10;
        num = num/10;
        System.out.println("Last Digit:" + r + " Number:" + num);
    }
}
