package Javatechie;

import java.util.*;
import java.util.stream.Collectors;

public class xyz3 {

    public static void main(String[] args) {

        Integer[] a1 = {1,2,3,2,1,8};
        Integer[] a2 = {1,2,3,4,5,8};
        Integer[] a3 = {1,2,3,4};

       // boolean commonele = commonele(a1, a2);
        //System.out.println(commonele);

       /* Integer[] a5 = {1,5,6,32,25,12};
        Arrays.sort(a5);
        int secondlargest = a5[a5.length-2];
        System.out.println(secondlargest);
        int secondsmalest = a5[1];
        System.out.println(secondsmalest);
*/
   /*     int num=1;
    for(int i=1;i<5;i++){
        for(int j=1;j<i;j++){
            System.out.print(num);
            num++;
        }
        System.out.println("\n");
     }*/

        /*String str ="I am Java developer I am proud of it";
        Map<String,Integer> hmap = new HashMap<>();
        String[] words = str.split(" ");
        for(String word: words){
            if(hmap.containsKey(word)){
                hmap.put(word, hmap.get(word)+1);
            }
            else{
                hmap.put(word, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : hmap.entrySet()){
            if(entry.getValue()>=1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }*/

        Integer arr[] = {1,2,4,5,62,2,1};
        Set<Integer> hset= new HashSet<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Set<Integer> collect = list.stream().filter(ele -> hset.add(ele)).collect(Collectors.toSet());
        System.out.println(collect);

    }

    public static boolean commonele(Integer a1[], Integer a2[]){
        if(a1.length!=a2.length){
            return false;
        }

        Set<Integer> hset = new HashSet<>();

        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    hset.add(a1[i]);
                }
            }
        }
        for(Integer s: hset){
            System.out.println(s);
        }
        return true;
    }
}
