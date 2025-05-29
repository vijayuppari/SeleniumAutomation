package interviewquestions;

import java.util.StringJoiner;

public class Stringjoiner {

    public static void main(String[] args) {

        StringJoiner employeeList = new StringJoiner("::");
        employeeList.add("vijay");
        employeeList.add("Nani");
        employeeList.add("Hari");

        System.out.println("Employee List values are " + employeeList.toString());


    }
}
