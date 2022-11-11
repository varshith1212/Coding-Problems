package introduction;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int sum = sum(x,y);
        System.out.println(sum);
    }

    static int sum(int a, int b){
        return a+b;
    }
}
