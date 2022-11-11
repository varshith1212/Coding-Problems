package contests;

import java.util.Scanner;

public class codechef_contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int x = sc.nextInt();
            average(x);
        }
    }

    static void average(int x){
        for (int j = 1; j < 300; j++) {
            for (int k = j + 1; k < 300; k++) {
                for (int l = k + 1; l < 300; l++) {
                    if((j+k+l)==(x*3)){
                        System.out.println(j +" "+ k +" "+l);
                        return;
                    }
                }
            }
        }
    }

}


