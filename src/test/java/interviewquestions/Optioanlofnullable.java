package interviewquestions;

import java.util.Optional;

public class Optioanlofnullable {

    public static void main(String[] args) {

        Optional<String> value = Optional.ofNullable("vijay");
        System.out.println(value.get());

        Optional<String> valuenull = Optional.ofNullable(null);
        valuenull.ifPresent(va1 -> System.out.println("Non value is" + va1));
        System.out.println("default values are " + valuenull.orElse("0"));

    }
}
