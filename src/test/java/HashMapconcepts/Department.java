package HashMapconcepts;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Department {

    int depid;
    String depname;
    String depsalary;

}
