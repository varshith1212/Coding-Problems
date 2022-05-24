package BCQ_N;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int number = 0,r;
        while(num>0){
            r = num%10;
            number = number * 10 + r;
            num /= 10;
        }
        System.out.println("Reverse: " + number);
    }
}
