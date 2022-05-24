package HackerRank;

import java.util.HashMap;

public class phoneNumber {
    public static void main(String[] args) {
        String s = "two one nine six eight one six four six zero";

        String ans = "";

        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        String[] parts = s.split(" ");

        for (int i = 0; i < parts.length; i++) {
            if(map.containsKey(parts[i])){
                ans += map.get(parts[i]);
            }
            else if(parts[i].equals("double")){
                ans += map.get(parts[i+1]);
            }
            else if(parts[i].equals("triple")){
                ans += map.get(parts[i+1]);
                ans += map.get(parts[i+1]);
            }
        }

         /*
        for(int i=0; i< parts.length; i++){

            if(parts[i].equals("zero")){
                ans = ans + "0";
            }
            else if(parts[i].equals("one")){
                ans = ans + "1";
            }
            else if(parts[i].equals("two")){
                ans = ans + "2";
            }
            else if(parts[i].equals("three")){
                ans = ans + "3";
            }
            else if(parts[i].equals("four")){
                ans = ans + "4";
            }
            else if(parts[i].equals("five")){
                ans = ans + "5";
            }
            else if(parts[i].equals("six")){
                ans = ans + "6";
            }
            else if(parts[i].equals("seven")){
                ans = ans + "7";
            }
            else if(parts[i].equals("eight")){
                ans = ans + "8";
            }
            else if(parts[i].equals("nine")){
                ans = ans + "9";
            }
            else if(parts[i].equals("double")){
                ans = ans + "d";
            }
            else if(parts[i].equals("triple")){
                ans = ans + "tt";
            }
        }
        */

        System.out.println(ans);
    }
}