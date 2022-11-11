package introduction;

import java.util.Scanner;

class Rectangle{
    public float length;
    public float width;

    public float calculateArea(){
        float area = length*width;
        float val = Math.round((area*100)/100);
        return val;
    }

    public float calculatePerimeter(){
        float perimeter = 2*length*width;
        float val = Math.round((perimeter*100)/100);
        return val;
    }
}

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();

        rec.width = 5f;
        rec.length = 12f;

        System.out.println(rec.calculateArea());
    }
}
