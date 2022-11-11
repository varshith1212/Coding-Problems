package codechefMREC;

import java.util.Scanner;

public class krishna {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no.of names:");
        int n = s.nextInt();
        int count = n;

        System.out.println("Enter the names:");
        String[] names = new String[100];

        for(int i = 0 ; i < 2*n ; i++){
            names[i] = s.next();
        }

        for(int i = 0 ; i < 2*n ; i = i+2){
            System.out.print(names[i]);
            if(count-1 > 0) {
                System.out.print("--");
                count--;
            }
        }
    }
}
