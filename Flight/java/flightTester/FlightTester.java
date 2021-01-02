package flightTester;

import com.xworkz.flight.FlightBooking;
import com.xworkz.flight.FlightDTO;
import com.xworkz.flight.constants.Company;

public class FlightTester {
	public static void main(String[] args) {

		FlightBooking flightBooking = new FlightBooking();

		FlightDTO flightDTO = new FlightDTO("spice123", Company.SPICEJET, "Bangalore", "Mysore", 8, true, 1200, 1000);
		flightBooking.addFlight(flightDTO);
		FlightDTO flightDTO2 = new FlightDTO("airAsia123", Company.AIRASIA, "Mysore", "chennai", 50, true, 1500, 1000);
		flightBooking.addFlight(flightDTO2);
		FlightDTO flightDTO3 = new FlightDTO("decan123", Company.DECCCANAIR, "Mysore", "delhi", 60, true, 2000, 1000);
		flightBooking.addFlight(flightDTO3);
		flightBooking.displayFlight();
		flightBooking.searchFlightByStartingPoint("Mysore");
	}
}
