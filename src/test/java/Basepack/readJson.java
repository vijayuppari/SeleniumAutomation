package Basepack;

import io.restassured.path.json.JsonPath;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class readJson {

    public static void main(String[] args) throws FileNotFoundException {
        String name="Dinesh";
        FileReader fileReader = new FileReader("src/test/java/samplej.json");
        JsonPath jsonPath =new JsonPath(fileReader);
        List<LinkedHashMap<String,Object>> values = jsonPath.get("value");

        for(LinkedHashMap<String,Object> value: values){
            if(name.equalsIgnoreCase((String) value.get("name"))){
                HashMap<String,String> locationvalues = (HashMap<String, String>) value.get("location");
                String state = locationvalues.get("state");
                String zip = locationvalues.get("zip");
                System.out.println("location details are for name: " + name  + " \n state as : " + state + " ans zip as: " + zip);
                break;
            }
        }




    }

}
