package introduction;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        /*
        if(a > b){
            if (a>c)
                System.out.println(a);
            else
                System.out.println(c);

        }
        else{
            if (b > c){
                System.out.println(b);
            }
            else
                System.out.println(c);
        }
        */
        if (a>b & a>c)
            System.out.println(a);
        else if(b>c & b>a)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
