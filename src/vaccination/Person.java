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
	private String[] list = new String[1];

	public String addNewPerson(String personID, String firstName, String lastName, String socialSecurityNumber,
			String street, String zip, String city, String country, String birthday, String telephone) { // fügt eine
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
		listAdd(personID);
		return personID;
	}

	public void deletePerson(String personID) { // löscht eine Person
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(personID)) {
				list[i] = null;
			}
		}
		this.personID = null;
		this.firstName = null;
		this.lastName = null;
		this.socialSecurityNumber = null;
		this.street = null;
		this.zip = null;
		this.city = null;
		this.country = null;
		this.birthday = null;
		this.telephone = null;
		System.out.println("Löschen verlief erfolgreich");
	}

	public void listAdd(String personID) { // fügt eine Person zur Liste hinzu
		String[] tmp = new String[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			tmp[i] = list[i];
		}
		list = tmp;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				list[i] = personID;
			}
		}
	}

	public void listAllPersons() { // listet alle Personen hinzu
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.println(list[i]);
			}
		}
	}

}