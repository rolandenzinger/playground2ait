package vaccination;

public class PersonArray {
	Person[] personList = new Person[1];

	public String addNewPerson(String personID, String firstName, String lastName, String socialSecurityNumber,
			String street, String zip, String city, String country, String birthday, String telephone) {
		if (personList[personList.length - 1] == null) {
			personList[personList.length - 1] = new Person(personID, firstName, lastName, socialSecurityNumber, street,
					zip, city, country, birthday, telephone);
		} else {
			Person[] tmp = new Person[personList.length + 1];
			for (int i = 0; i < personList.length; i++) {
				tmp[i] = personList[i];
			}
			personList = new Person[tmp.length];
			for (int i = 0; i < tmp.length; i++) {
				personList[i] = tmp[i];
			}
			for (int i = 0; i < personList.length; i++) {
				if (personList[i] == null) {
					personList[i] = new Person(personID, firstName, lastName, socialSecurityNumber, street, zip, city,
							country, birthday, telephone);
					i = personList.length + 1;
				}
			}
		}
		return personID;
	}

	public Person[] getPersonList() {
		return personList;
	}

	public void deletePerson(Person person) { // löscht eine Person
		for (int i = 0; i < personList.length; i++) {
			if (personList[i] == null) {

			} else if (personList[i].getPersonID().equals(person.getPersonID())) {
				personList[i] = null;
				System.out.println("Löschen verlief erfolgreich!");
				return;
			}
		}
		System.out.println("Person wurde nicht gefunden!");
	}

	public void listAllPersons() { // listet alle Personen hinzu
		for (int i = 0; i < personList.length; i++) {
			if (personList[i] != null) {
				System.out.println("ID: " + personList[i].getPersonID() + "\nFirst Name: "
						+ personList[i].getFirstName() + "\nLast Name: " + personList[i].getLastName()
						+ "\nSocial Security Number: " + personList[i].getSocialSecurityNumber() + "\nStreet: "
						+ personList[i].getStreet() + "\nZip: " + personList[i].getZip() + "\nCity: "
						+ personList[i].getCity() + "\nCountry: " + personList[i].getCountry() + "\nBirthday: "
						+ personList[i].getBirthday() + "\nTelephone: " + personList[i].getTelephone()
						+ "\n--------------------------");
			}
		}
	}
}
