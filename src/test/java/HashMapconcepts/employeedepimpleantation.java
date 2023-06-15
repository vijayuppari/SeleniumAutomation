package HashMapconcepts;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class employeedepimpleantation {

    public static void main(String[] args) {

      //  Map<Employee,Department> epdep = new HashMap<>();
        Map<Employee,Department> epdep = new IdentityHashMap<>();
        epdep.put(new Employee(100,"vijay","Software Eng"), new Department(200,"IT","1200"));
        epdep.put(new Employee(101,"Harish","Developer"), new Department(201,"ECC","500"));
        epdep.put(new Employee(102,"Amit","Maintainace"), new Department(202,"EEE","90000"));
        epdep.put(new Employee(100,"vijay","Software Eng"), new Department(203,"CSE","80000"));

            epdep.forEach((k,v)-> System.out.println(k+" " + v));


    }
}
