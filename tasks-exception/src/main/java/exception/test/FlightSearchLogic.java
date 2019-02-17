package exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchLogic {

    public boolean findFilght(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warszawa", true);
        flightMap.put("Poznań", false);

        if(flightMap.containsKey(flight.getArrivalAirport())){
            return flightMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
