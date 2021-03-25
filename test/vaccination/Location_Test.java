package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Location_Test {

	@Test

	void testLocation() {
		Location lo = new Location();
		assertEquals(lo.addLocation("Leon", "Leonstrasse", "Leons1234", "Leonsstadt", "Leonsland"), 1);
		
		
		//assertTrue(lo.deleteLocation(1));
		
		lo.listAllLocation();
	}
	
	

}
