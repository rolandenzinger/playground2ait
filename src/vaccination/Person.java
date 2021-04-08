package vaccination;

public class Person {
	private String personID;
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private String street;
	private String zip;
	private String city;
	private String country;
	private String birthday;
	private String telephone;

	public Person(String personID, String firstName, String lastName, String socialSecurityNumber,
			String street, String zip, String city, String country, String birthday, String telephone) { // fügt eine
																											// person
																											// hinzu
		this.personID = personID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.country = country;
		this.birthday = birthday;
		this.telephone = telephone;
	}

	public String getPersonID() {
		return personID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
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

	public String getBirthday() {
		return birthday;
	}

	public String getTelephone() {
		return telephone;
	}

}