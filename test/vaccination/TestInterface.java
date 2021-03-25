package vaccination;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInterface {

	   @Test public void TestSaySmth() {
	    
		   
		   UserInterface.SaySomething("Bye");
		   

   }
	   
	   @Test public void TestAskForString() {
	    	
		   UserInterface.AskForString("Write car");
		   
		   
		   
           //asserEquals(UserInterface.SaySomething("hello"));


   }
	   
	   @Test public void TestAskForDate() {
	    	
		   
		   UserInterface.AskForDate("Write 10/02/2020");
		   
		   //    asserEquals(UserInterface.SaySomething("hello"));


   }
	   
	   @Test public void TestAskForNumber() {
	    	
		   
		   assertEquals(UserInterface.AskForNumber("Write ten"), 10);
		   

   }
	
}
