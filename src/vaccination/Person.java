
public class Person {
	private String personID;
	private String firstName;
	private String lastName;
	private int socialSecurityNumber;
	private String street;
	private String zip;
	private String city;
	private String country;
	private String birthday;
	private int telephone;

	public String addNewPerson(String personID, String firstName, String lastName, int socialSecurityNumber,
			String street, String zip, String city, String country, String birthday, int telephone) { // fügt eine
																										// person hinzu
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
		return personID;
	}

	public void deletePerson(String personID) { // löscht eine Person
		this.personID = null;
		this.firstName = null;
		this.lastName = null;
		this.socialSecurityNumber = 0;
		this.street = null;
		this.zip = null;
		this.city = null;
		this.country = null;
		this.birthday = null;
		this.telephone = 0;
		System.out.println("Löschen verlief erfolgreich");
	}

	public void listAllPersons() { // listet alle Personen auf

	}
}