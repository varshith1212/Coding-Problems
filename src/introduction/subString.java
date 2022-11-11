package introduction;

import java.util.Locale;
import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text = s.next();
        String pattern = s.next();

        if(text.toUpperCase().contains(pattern.toUpperCase())){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }
}