package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class synchronizedArrayList {
    public static void main(String[] args) {

        List<String> namesList = Collections.synchronizedList(new ArrayList<>());

        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");

        synchronized (namesList){
            Iterator<String> it = namesList.iterator();

            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

        CopyOnWriteArrayList empList = new CopyOnWriteArrayList<>();

        empList.add("name");
    }
}
