package vaccination;

public class Location_Array {
	
	private int locationID;
	private String name;
	private String street;
	private String zip;
	private String city;
	private String country;
	
	
	Location_Array(int locationID, String name, String street, String city, String country, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.country = country;
		this.zip = zip;
		this.locationID = locationID;
	}

	public int getLocationID() {
		return locationID;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getZip() {
		return zip;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	
	
	
	

}
