package algorithims;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Zoneids {

    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
       // System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for(String zoneId: availableZoneIds){
            System.out.println(zoneId);
        }

        System.out.println(now.plusDays(2));



    }
}
