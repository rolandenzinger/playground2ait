package vaccination;

import java.util.Scanner;

public class Location {

	private Location_Array[] locations;
	private int counter = 0;
	public Scanner sc = new Scanner(System.in);

	public int addLocation(String name, String street, String zip, String city, String country) { // Fügt Location hinzu

		if (counter >= 0) {
			Location_Array[] locationClone = new Location_Array[locations.length+1];
		
			
			for(int i = 0; i < locations.length; i++) {
				locationClone[i] = locations[i];
			}

			locations = new Location_Array[counter];
			
			

			for (int i = 0; i < locations.length; i++) {
				if (locations.length == counter) {
					locations[counter] = new Location_Array(counter, name, street, zip, city, country);

				} else {
					locations[i] = locationClone[i];
				}
			}
			counter++;
			return counter;
		} else {
			locations = new Location_Array[counter];
			locations[0] = new Location_Array(counter, name, street, zip, city, country);
			counter++;
			return counter;
		}

	}

	public boolean deleteLocation(int locationID) { // Löscht Location raus

		boolean quit = false;

		int stelle = 0;

		for (int i = 0; i < locations.length; i++) {
			if (locations[i].getLocationID() == locationID) {
				quit = true;
				stelle = i;
			}
		}

		Location_Array[] locationClone = locations.clone();
		locations = new Location_Array[counter - 1];

		for (int i = 0; i < locations.length; i++) {
			if (locationClone.length == stelle) {

			} else {
				locations[i] = locationClone[i];
			}
		}

		return quit;

	}

	public void listAllLocation() { // Gibt die Liste der Location aus

		for (int i = 0; i < locations.length; i++) {
			System.out.println(
					locations[i].getLocationID() + "," + locations[i].getName() + "," + locations[i].getStreet() + ","
							+ locations[i].getZip() + "," + locations[i].getCity() + "," + locations[i].getCountry());
			System.out.println("------------------------------------------------------");

		}

	}
	
	public Location_Array[] getLocations() {
		return locations;
	}

}
