package contests;

import java.util.Arrays;
import java.util.Scanner;

public class HackerrankTesting {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n = s.nextInt();
            s.nextLine();
            String st = s.nextLine();
            String a[]=st.split(" ");

            Arrays.sort(a);
            String ans[] = new String[a.length];
            int k = 0;
            int min;
            int index = 0;
            for(int i = 0;i<a.length;i++) {

                min = Integer.MAX_VALUE;

                for(int j = 0; j < a.length; j++) {
                    if(!a[j].isEmpty()) {
                        if(a[j].length()<min) {
                            min = a[j].length();
                            index = j;
                        }
                    }
                }
                ans[k] = a[index];

                k++;
                a[index] = "";
            }
            for(int i=0;i<ans.length;i++)
                System.out.print(ans[i]+" ");

        }
    }
}