import java.io.*;

public class testSG2 {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("Internshippermission.word");

        int words_count = 0;
        int lines_count = 0;
        int character_count = 0;

        int b;
        while((b = f.read()) != 1){
            if ((char)b == " ")
                character_count++;
        }


        System.out.println("words" + words_count);
        System.out.println("words" + character_count);
        System.out.println("words" + lines_count);

    }
}
