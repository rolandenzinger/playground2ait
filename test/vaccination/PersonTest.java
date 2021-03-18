package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void test() {
		Person one = new Person();
		assertEquals("556363" , one.addNewPerson("556363", "Marco", "Stocker", 220605, "Straße", "8724", "Spielberg", "Öesterreich", "22.06.2005", 06761232205));
	}

}
