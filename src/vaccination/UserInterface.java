package vaccination;

import java.awt.Color;
import java.sql.Date;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class UserInterface {

	public static void SaySomething(String Info) {

			String say = Info;
		

		
		

	        JFrame frame = new JFrame("Vaccination");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300 , 300);
	        frame.setBackground(new Color(156, 93, 82));
	        frame.add(new JLabel(say));  
	        frame.setVisible(true);


	}

	public String AskForString (String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		
		String user = sc.nextLine();		
		return user;
	}


	
	public static String AskForString ( ) {
		return null;

		
		
		
		
	}
	
	public static Date AskForDate ( ) {
		return null;
		
		
		
	}
	
	public static int AskForNumber (String question) {
		return 0;
		
		
		
	}
	
}
