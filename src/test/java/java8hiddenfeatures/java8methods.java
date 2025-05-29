package java8hiddenfeatures;

import java.util.*;
import java.util.stream.Collectors;

public class java8methods {

    public static void main(String[] args) {

        List<String> ls10 = Arrays.asList("Sravani","Vijay","Sravani");
        Set<String> collect1 = ls10.stream().filter(name -> Collections.frequency(ls10, name) > 1).collect(Collectors.toSet());
        System.out.println(collect1);
          // 1.  Its unmodifiable list, if we can try to add it wont possible .... nCopies
        List<Integer> list = Collections.nCopies(5, 10);
        System.out.println(list);

        try{
            list.add(100);
        }catch(UnsupportedOperationException e){
            System.out.println("Modification wont be possible because its immutable list");
        }

        //2. disjoint// it will return the common elements from different Lists
        commonele();

        // 3. frequency: // it will return the frequency of number in the given list
        List<Integer> ls1 = Arrays.asList(2, 3, 4, 7, 8,6,7,2,2,2,4);
        int count = Collections.frequency(ls1, 2);
        System.out.println(count);

        Map<Integer, Integer> collect = ls1.stream().collect(Collectors.toMap(
                number -> number, number -> Collections.frequency(ls1, number),
                (existing, newvalue) -> existing));
        System.out.println(collect);

        // Collections.Singleton// this one also unmodifiable list

        Set<String> collsingleton = Collections.singleton("Vijaykumar");
        try{
            collsingleton.add("Naveen");
        }catch(UnsupportedOperationException e){
            System.out.println("Modification wont be possible because its immutable list");
        }

        // Collections.rotate // We can rotate the list left or right side as per requirement
        List<Integer> originallist = Arrays.asList(2, 3, 4, 7, 8,9,10);
        System.out.println("Origial list " + originallist);
        Collections.rotate(originallist,3);
        System.out.println("After right Rotate " + originallist);

        Collections.rotate(originallist,-2);
        System.out.println("After Rotate Left " + originallist);

        List<Integer> originallist1 = Arrays.asList(0,9,8,7,6,5,4,3,2,1,10,11,12,13,14);
        System.out.println("Origial list 1 " + originallist1);
        Collections.rotate(originallist1,originallist1.size());
        System.out.println("After right Rotate " + originallist1);

        List<Integer> originallist2 = Arrays.asList(1,9,8,7,6,5,4,3,2);
        System.out.println("Origial list 2 " + originallist2)
        ;
        Collections.rotate(originallist2,-15);
        System.out.println("After right Rotate " + originallist2);



    }

    public static void commonele(){
        List<Integer> ls1 = Arrays.asList(2, 3, 4, 7, 8);
        List<Integer> ls2 = Arrays.asList(9,10,11);
        boolean commonele = Collections.disjoint(ls1, ls2);
        if (commonele)
            System.out.println("No common elements in both lists");
         else
            System.out.println(" Common elements in both lists");
    }
}
