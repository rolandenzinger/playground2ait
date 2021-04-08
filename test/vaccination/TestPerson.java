package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPerson {

	@Test
	void test() {
		PersonArray list = new PersonArray();
		assertEquals("556363", list.addNewPerson("556363", "Max", "Mustermann", "12345", "Straße", "1234", "Stadt",
				"Land", "12.34.5678", "12345678"));
		assertEquals("556364", list.addNewPerson("556364", "Max", "Mustermann", "12345", "Straße", "1234", "Stadt",
				"Land", "12.34.5678", "12345678"));
		list.listAllPersons();
		list.deletePerson(new Person("556363", "Max", "Mustermann", "12345", "Straße", "1234", "Stadt",
				"Land", "12.34.5678", "12345678"));
		list.deletePerson(new Person("556365", "Max", "Mustermann", "12345", "Straße", "1234", "Stadt",
				"Land", "12.34.5678", "12345678"));
		list.listAllPersons();
	}

}
