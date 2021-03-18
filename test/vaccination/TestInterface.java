package vaccination;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInterface {

	   @Test public void TestSaySmth() {
	    	
		   UserInterface.SaySomething("Bye");
		   
          //asserEquals(UserInterface.SaySomething("hello"));


   }
	   
	   @Test public void TestAskForString() {
	    	
		   
		   
           //asserEquals(UserInterface.SaySomething("hello"));


   }
	   
	   @Test public void TestAskForDate() {
	    	
		   
		   
		   //    asserEquals(UserInterface.SaySomething("hello"));


   }
	   
	   @Test public void TestAskForNumber() {
	    	
		   
		   assertEquals(UserInterface.AskForNumber("Write ten"), 10);
		   
		   
		   //       asserEquals(UserInterface.SaySomething("hello"));


   }
	
}
