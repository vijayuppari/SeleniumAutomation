package LeetcodeByRetarget;

import java.util.*;

public class SortPeople {


    public static String[] sortPeople(String[] names, int[] heights){

        Map<Integer, String> mapping = new HashMap<>();
        for (int i=0;i<names.length;i++){
            mapping.put(heights[i],names[i]);
        }
        List<Integer> allheights = new ArrayList<>(mapping.keySet());
        allheights.sort(Collections.reverseOrder()); //180.170,165

        String[] result= new String[names.length];
        for (int j=0;j<allheights.size();j++){
            result[j] = mapping.get(allheights.get(j));
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170})));
        System.out.println(Arrays.toString(sortPeople(new String[]{"Alice","Bob","Bob"}, new int[]{155,185,150})));



    }

}
