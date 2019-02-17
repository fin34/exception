package exception.test;

public class FlightSearch {

    public static void main(String[] args) {

        FlightSearchLogic searchFlight = new FlightSearchLogic();

        try{
            System.out.println("Flight available:");
            System.out.println(searchFlight.findFilght(new Flight("Katowice", "Poznań")));
        } catch (RouteNotFoundException r){
            System.out.println("No airport on the list");
        }
    }
}
