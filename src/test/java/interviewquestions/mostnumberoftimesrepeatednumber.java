package interviewquestions;

import java.util.*;
import java.util.stream.Collectors;

public class mostnumberoftimesrepeatednumber {

    public static void main(String[] args) {

        int arr[] = new int[]{2,3,5,6,7,10,2,3,4,5,7,10,10,7,10};

        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i]))
                hmap.put(arr[i], hmap.get(arr[i])+1);
            else
                hmap.put(arr[i], 1);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = hmap.entrySet().iterator();
        int maxcount=0;
        int element =arr[0];
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer value =next.getValue();
            if(maxcount<value){
                maxcount=value;
                element = next.getKey();
            }
        }
        System.out.println("This element " + element + " is repeated maximum number of times " + maxcount);

        List<String> lss = new ArrayList<>(Arrays.asList("vijay","Harish","nayan","Self"," "));
        List<String> collect = lss.stream().map(ele -> ele.substring(0, 1).toUpperCase() + ele.substring(1).toLowerCase()).collect(Collectors.toList());
        System.out.println(collect);
    }


}
