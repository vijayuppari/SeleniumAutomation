package Javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stremhiddenfeatures {

    public static void main(String[] args) {

        // Remove Null values from the list
        List<String> names = Arrays.asList("vijay","Naveen",null);
        List<String> collect = names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
        System.out.println(collect);

        // Iterate as per our requirements
        Stream.iterate(0,t->t+2).limit(5).collect(Collectors.toList());

        List<Student> students = Stream.of(
                new Student(1, "vijay", 30, "Male", "CSE", "Hyderabad", 2, Arrays.asList("9030", "9603")),
                new Student(2, "Naresh", 60, "Male", "ECE", "Banglore", 5, Arrays.asList("9632", "9604")),
                new Student(3, "Mukesh", 45, "Male", "IT", "Hyderabad", 51, Arrays.asList("9031", "9605")),
                new Student(4, "Naveen", 65, "Male", "MECH", "Mumbai", 20, Arrays.asList("9032", "9606"))).collect(Collectors.toList());

        Long average = students.stream().mapToDouble(Student::getAge).boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingDouble(Double::doubleValue), Math::round
                ));
        System.out.println(average);

        // Stream.concat
        Stream<Integer> num1 = Stream.of(1, 2, 3);
        Stream<Integer> num2 = Stream.of(4, 5, 6);
        Stream<Integer> nums = Stream.concat(num1, num2);
        int sum = nums.mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        // Stream.partitioningBy
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 67, 76, 45, 100);
        Map<Boolean, List<Integer>> collect1 = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(collect1);
        System.out.println(collect1.get(Boolean.TRUE));

    }
}
