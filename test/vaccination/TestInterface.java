package vaccination;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestInterface {

	   @Test public void TestSaySmth() {
	    
		   UserInterface.SaySomething("Bye");
		   
   }
	   
	   @Test public void TestAskForString() {
	    	
		   UserInterface.AskForString("Write car");

   }
	   
	   @Test public void TestAskForDate() {
	    			   
		   UserInterface.AskForDate("Write 10/02/2020");
		   UserInterface.AskForDate("Write as");


   }
	   
	   @Test public void TestAskForNumber() {

		   assertEquals(UserInterface.AskForNumber("Write 10"), 10);


   }
	
}
