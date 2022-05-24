package BCQ_N;

import java.util.Scanner;

public class FactorsAndCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num%i == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Count:" + count);
    }
}
