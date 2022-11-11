package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>(20);

//        System.out.println(ar.size());

        ar.add(100);
//        System.out.println(ar.size());

        ar.add(200);
        ar.add(300);
        ar.add(400);

//        System.out.println(ar.indexOf(200));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(num -> num%2 !=0);
//        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("naveen","varshith","varshith", "karthik", "abhi"));

        System.out.println(names);
        names.retainAll(Collections.singleton("varshith"));
        System.out.println(names);

    }
}
