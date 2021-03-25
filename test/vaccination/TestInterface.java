package vaccination;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestInterface {

	   @Test public void TestSaySmth() {
	    
		   UserInterface.SaySomething("Bye");
		   
   }
	   
	   @Test public void TestAskForString() {
	    
		 assertEquals(UserInterface.AskForString("Write car"), "car");

   }
	   
	   @Test public void TestAskForDate() throws ParseException {
	    			   
			assertEquals(UserInterface.AskForDate("Write 10/02/2020"), new SimpleDateFormat("dd/MM/yyyy").parse("10/02/2020"));

   }
	   

	@Test public void TestAskForNumber() {

		   assertEquals(UserInterface.AskForNumber("Write 10"), 10);


   }
	
}
