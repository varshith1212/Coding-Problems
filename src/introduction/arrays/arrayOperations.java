package introduction.arrays;

public class arrayOperations {
    public static void main(String[] args) {
        char arr[] = new char[6];

        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';
        arr[3] = 'D';
        arr[4] = 'E';

        arrayOp.display(arr);
        arrayOp.insert(arr, 3, 'Z');
        arrayOp.display(arr);
        arrayOp.delete(arr,3);
        arrayOp.display(arr);
    }
}

class arrayOp{
    static void insert(char[] ar, int pos, char val){
        //Traversing that array to the position from the last
        for (int i = ar.length-1; i >= pos; i--) {
            ar[i] = ar[i-1];
        }

        //Inserting the element at specified position
        ar[pos-1] = val;
    }

    static void delete(char[] ar, int pos){
        //Traversing the array to the position
        for (int i = pos-1; i < ar.length-1; i++) {
            ar[i] = ar[i+1];
        }

        ar[ar.length-1] = '\0';
    }

    static void display(char[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        System.out.println();
    }
}