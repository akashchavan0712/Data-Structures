package arrayList;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        
        // Creating arrayList 

        ArrayList <Integer> array = new ArrayList<>();

        // Adding Into The ArrayList

        array.add(5);
        array.add(2);
        array.add(7);
        array.add(1);
        array.add(6);

        System.out.println(array);
        // System.out.println(array.size());
        // System.out.println(array.get(3));
        array.set(3,11);
        System.out.println(array);


    }
}
