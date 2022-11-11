package introduction;

public class scopes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            System.out.println(a);
            System.out.println(b);
            int c = 100;
            System.out.println(c);

        }
        //System.out.println(c);
    }
}
