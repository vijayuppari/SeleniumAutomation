package LeetcodeByRetarget;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestCommonprefix {

    public static String longestPrefix(String [] arr){

        StringBuilder result= new StringBuilder();
        int counter=0;
        boolean flag= true;
        while (flag){
            HashSet<String> aresame = new HashSet<>();
            for(int i=0;i< arr.length;i++) {
                if (arr[i].length()>counter){
                    aresame.add(String.valueOf(arr[i].charAt(counter)));
                }
                else{
                    flag= false;
                    break;
                }
            }
            if(flag){
                if(aresame.size()!=1)
                    flag=false;
                else{
                    result.append(new ArrayList<>(aresame).get(0));
                    counter++;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(longestPrefix(new String [] {"flower","flow","flight"}));
        System.out.println(longestPrefix(new String [] {"dog","racecar","car"}));
        System.out.println(longestPrefix(new String [] {"a","ab"}));
    }
}
