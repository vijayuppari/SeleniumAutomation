package HashMapconcepts;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapxample {

    public static void main(String[] args) {
/*
       TreeMap<String,Integer> tmap= new TreeMap<String,Integer>();
        tmap.put("vijay",100);
        tmap.put("Harish",900);
        tmap.put("Sameer",50);
        tmap.put("Aakash",80);

        tmap.forEach((k,v)->System.out.println(k+ " " + v));

        System.out.println("Last Key is " + tmap.lastKey());

        System.out.println("First Key is " + tmap.firstKey());*/

        TreeMap<Integer, String> tmap1= new TreeMap<Integer, String>();
        tmap1.put(100,"vijay");
        tmap1.put(900,"Harish");
        tmap1.put(50, "Sameer");
        tmap1.put(80, "Aakash");

        // Print entries less  than 100
        System.out.println(tmap1.headMap(100).entrySet());

        // Print entries greater  than 100
        System.out.println(tmap1.tailMap(100).entrySet());




    }
}
