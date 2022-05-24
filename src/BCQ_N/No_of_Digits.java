package BCQ_N;

import java.util.Scanner;

public class No_of_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        while(num-->0){
            num = num/10;
            count++;
        }
        /*String num = scan.next();
        int count = num.length();*/
        System.out.println(count);
    }
}
