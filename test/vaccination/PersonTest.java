package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void test() {
		Person one = new Person();
		assertEquals("556363", one.addNewPerson("556363", "Max", "Mustermann", 12345, "Straße", "1234", "Stadt", "Land",
				"12.34.5678", 12345678));
		one.listAllPersons();
		one.deletePerson("556363");
		one.listCreate("Max Mustermann");
	}

}
