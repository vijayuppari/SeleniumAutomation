package interviewquestions;

import java.util.Optional;

public class Optionalofempty {

    public static void main(String[] args) {

        Optional<Integer> integer = Optional.of(40);
        Optional<Object> empty = Optional.empty();

        System.out.println("Optional Of " + integer.orElse(10));
        System.out.println("Default value is " + empty.orElse(100));
    }
}
