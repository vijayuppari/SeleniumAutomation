package algorithims;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysortforEvenOdd {

    public static void main(String[] args) {

      //  int input[] = new int[]{1,4,7,10,23,16};
        Integer input[]= new Integer[]{1,4,7,10,23,16};
        //int output[] = new int[input.length];
       // ArraysortEvenOdd(input,output);
        ArraysortbyEvenOdd(input);

    }
    // Approach 1:
        public static void ArraysortEvenOdd(int input[], int output[]){
        for(int i=0;i<input.length;i++){
            System.out.print(input[i] + " ");
        }
        int index=0;

        for(int i=0;i<input.length;i++){
            if(input[i] % 2 == 0){
                output[index++]= input[i];
            }
        }
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0){
                output[index++]= input[i];
            }
        }
        System.out.println("\n");
        for (int i=0;i<output.length;i++){
            System.out.print(output[i] + " ");
        }
    }

    // Approach 2; using java 8
    public static void ArraysortbyEvenOdd(Integer input[]){
        List<Integer> inputs = Arrays.asList(input);

        List<Integer> collect = inputs.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> output = inputs.stream().filter(i -> i % 2 != 0).collect(Collectors.toCollection(() -> collect));
        output.forEach(e->System.out.print(e +" "));
    }
}
