package HashMapconcepts;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {


    // Fail Fast is nothing but if we are trying to add anything in between for List, Set or Map
    // we will get the "ConcurrentModifictionException" so to overcome these we have methods like
    //CopyofWriteToArrayList, CopyofWriteToArraySet and ConcurrentMap
    public static void main(String[] args) {

        // Even if we use "CopyOnArrayList" method it wont print the newly added element, it just maintain one copy and avoid
        // the concurrentexception issue

        //Incase Map it will print the newly added element becuase there is no Cloing concept in Map
        List<String> ls = new CopyOnWriteArrayList<>();
        ls.add("A");
        ls.add("B");

        Iterator<String> iterator = ls.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            ls.add("C");
        }
    }
}
