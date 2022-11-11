import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int ans;
        ans = countNumM1(a);
        System.out.println(ans);
        ans = countNumM2(a);
        System.out.println(ans);
        ans = countNumM3(a);
        System.out.println(ans);
    }

    private static int countNumM1(int a) {
        String s = Integer.toString(a);
        return s.length();
    }

    private static int countNumM2(int a) {
        int ans = (int) Math.floor(Math.log10(a) + 1);
        return ans;
    }

    private static int countNumM3(int a) {
        int x = a; int count = 0;
        while( x != 0 )
        {
            x = x / 10;
            count++;
        }
        return count;
    }

}
