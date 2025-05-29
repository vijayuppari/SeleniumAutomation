package java8hiddenfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class listiterator {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("Banana");
        //Collections.addAll(fruits, "apple", "orange", "Banana");

        // forward traversing
        ListIterator<String> ListIteratorforward = fruits.listIterator();
//        System.out.println("forward traversal");
//        while (ListIteratorforward.hasNext()){
//            System.out.println(ListIteratorforward.next());
//        }
//        System.out.println("********************************");
//
//        System.out.println("backwards traversal");
//        while (ListIteratorforward.hasPrevious()){
//            System.out.println(ListIteratorforward.previous());
//        }
//        System.out.println("********************************");

        System.out.println("Update elements");
        while (ListIteratorforward.hasNext()){
            String next = ListIteratorforward.next();
            if(next.equalsIgnoreCase("apple")){
                ListIteratorforward.set("Delight");
            }
        }
        System.out.println(fruits);
        System.out.println("********************************");








    }

}
