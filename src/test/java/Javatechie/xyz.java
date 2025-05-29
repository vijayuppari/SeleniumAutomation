package Javatechie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class xyz {

    public static boolean isPrime(int num){

        if(num<=1)
            return false;
        for (int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void getprimenums(int num){
        for(int i=2;i<num;i++){
            if(isPrime(i)){
                System.out.println(i+ ",");
            }
        }
    }

    public static void main(String[] args) {

      // getprimenums(50);
        String arr1[] = {"vijay","Hari","Nani"};
        String arr2[] = {"vijay","Hari","Nani1"};
        test6();


    }

    public static void test1() {
        String s = "vivjayrkumaruppari";
        Map<Character, Integer> hmap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch) + 1);
            }
            else{
                hmap.put(ch,1);
            }
        }
        //hmap.forEach((k,v)-> System.out.println(k + " " + v));
        /*for(Character characters: hmap.keySet()){
            if(hmap.get(characters)>1){
                System.out.println("key is " + characters + " Number of times " + hmap.get(characters));
            }
        }*/
        /*for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }*/

        for(int i= s.length()-1;i>0;i--){
            char c = s.charAt(i);
            Integer freq = hmap.get(c);
                if(freq==1){
                    System.out.println(s.charAt(i));
                    break;
                }
        }
    }

    public static void test2(){
        String s="a3b2c1";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
            else {
                int numericValue = Character.getNumericValue(s.charAt(i));
                for(int j=1;j<numericValue;j++){
                    System.out.print(s.charAt(i-1));
                }
            }
        }
    }

    public static void test3(){
        String s="aaabbc";
        Map<Character, Integer> hmap = new HashMap<>();
        char[] chars = s.toCharArray();
        for(Character ch: chars){
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            }
            else{
                hmap.put(ch,1);
            }
        }

        hmap.forEach((k,v)->System.out.print(k+ " " + v));
    }

    public static void test4(){
        String s="aaabbc";
        Map<Character, Integer> hmap = new HashMap<>();
        char[] chars = s.toCharArray();
        for(Character ch: chars){
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            }
            else{
                hmap.put(ch,1);
            }
        }

        //hmap.forEach((k,v)->System.out.print(k+ " " + v));

        for(Character ch1: hmap.keySet()){
            if(hmap.get(ch1)>2){
                System.out.println("key is " + ch1 + " Number of times " + hmap.get(ch1));
            }
        }
    }

    public static void test6(){

        Integer num[]={10,19,90,78,100,190,6,5,100,90,100};
        List<Integer> ls1= Arrays.asList(num);



        /*List<Integer> ls= Arrays.asList(10,19,90,78,100,190,6);
        Optional<Integer> first = ls.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first);*/

       /* List<Integer> ls1= Arrays.asList(num);
        Optional<Integer> first = ls1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first);*/

        /*List<Integer> ls1= Arrays.asList(num);
        Set<Integer> hset = new HashSet<>();
        List<Integer> collect = ls1.stream().filter(ele -> !hset.add(ele)).collect(Collectors.toList());
        System.out.println(collect);*/
    }

    public String getreverseword(String word){
        if(word==null || word.isEmpty()){
            return word;
        }
        return word.charAt(word.length()-1)+getreverseword(word.substring(0,word.length()-1));
    }


}
