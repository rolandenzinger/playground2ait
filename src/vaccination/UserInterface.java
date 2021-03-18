package vaccination;

import java.sql.Date;
import java.util.Scanner;

public class UserInterface {

	public void SaySomething(String Info) {
		
		
		
	}
	
	public String AskForString (String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		
		String user = sc.nextLine();		
		return user;
		
		
		
		
	}
	
	public Date AskForDate ( ) {
		return null;
		
		
		
	}
	
	public int AskForNumber ( ) {
		return 0;
		
		
		
	}
	
}
