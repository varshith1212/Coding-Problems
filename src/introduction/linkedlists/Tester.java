package introduction.linkedlists;

public class Tester {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addAtEnd("V");
        list.addAtEnd("A");
        list.addAtEnd("R");
        list.display();
        list.addAtBeginning("D");
        list.display();
        System.out.println(list.find("S"));
        list.insert("S","R");
        list.display();
    }
}
