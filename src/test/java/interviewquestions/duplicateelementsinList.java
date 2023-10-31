package interviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateelementsinList {

    public static void main(String[] args) {

        List<Integer> elements = Arrays.asList(1, 2, 3, 6, 3, 5, 1, 9, 59, 20);
        List<Integer> dup = elements.stream().filter(e -> Collections.frequency(elements, e) > 1).distinct().collect(Collectors.toList());
        System.out.println("Duplicate Elements are " + dup);

    }
}
