package Javatechie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentImpl {

    public static void main(String[] args) {

        List<Student> students = Stream.of(
                new Student(1, "vijay", 30, "Male", "CSE", "Hyderabad", 2, Arrays.asList("9030", "9603")),
                new Student(2, "Naresh", 60, "Male", "ECE", "Banglore", 5, Arrays.asList("9632", "9604")),
                new Student(3, "Mukesh", 45, "Male", "IT", "Hyderabad", 51, Arrays.asList("9031", "9605")),
                new Student(4, "Naveen", 65, "Male", "MECH", "Mumbai", 20, Arrays.asList("9032", "9606")),
                new Student(5, "Satheesh", 25, "Male", "CHEMICAL", "Kolkatta", 12, Arrays.asList("9033", "9607")),
                new Student(6, "Ravi", 47, "Male", "CIVIL", "Kanpur", 83, Arrays.asList("9034", "9608")),
                new Student(7, "Ganga", 68, "Male", "CSE", "Hyderabad", 500, Arrays.asList("9035", "9609")),
                new Student(8, "Sravani", 20, "Female", "CSE", "Mumbai", 100, Arrays.asList("9036", "9602"))).collect(Collectors.toList());

        // Fetch the student details whose rank is between 50 and 100
        List<Student> studentByRank = students.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100).collect(Collectors.toList());
       // System.out.println(studentByRank);

        // Fetch the students who stay in Hyderabad and sort by their names
        List<Student> sortByname = students.stream().filter(student -> student.getCity().equals("Hyderabad")).
                sorted(Comparator.comparing(Student::getFirstname)).collect(Collectors.toList());
        //System.out.println(sortByname);

    // Fetch the students who stay in Hyderabad and sort by their names descending order
        List<Student> sortBynamedesc = students.stream().filter(student -> student.getCity().equals("Hyderabad")).
                sorted(Comparator.comparing(Student::getFirstname, Comparator.reverseOrder())).collect(Collectors.toList());
       // System.out.println(sortBynamedesc);

        // Fetch the all dep names in the Student List // Approach 1
        List<String> depnames = students.stream().map(Student::getDept).distinct().collect(Collectors.toList());
       // System.out.println(depnames);

        // Fetch the all dep names in the Student List // Approach 2
        Set<String> depnamesset = students.stream().map(Student::getDept).collect(Collectors.toSet());
        //System.out.println(depnamesset);

        // Fetch the all contacts in the Student List
        List<String> contacts = students.stream().flatMap(student -> student.getContacts().stream()).distinct().collect(Collectors.toList());
        //System.out.println(contacts);

        // if one2One -> use map
        // if One2Many -> use flatmap

        // Fetch Group the students by their dep
        Map<String, List<Student>> depgroup = students.stream().collect(Collectors.groupingBy(Student::getDept));
        //System.out.println(depgroup); // Here key is dep and value is List

        // Fetch Group the students by their count
        Map<String, Long> studentbyGroup = students.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        //System.out.println(studentbyGroup); // Here key is dep and value is Count means Long

        // Get the Maximum students dep
        Map.Entry<String, Long> results = students.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        //System.out.println(results);

        // Get the Average age of students
        Map<String, Double> resultsavgg = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
       // System.out.println(resultsavgg);

        // Find the highest rank in each dep
        Map<String, Optional<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
       // System.out.println(collect);

        //Find the second rank student in the list
        Optional<Student> first = students.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst();
        //System.out.println(first.get());

    }






}
