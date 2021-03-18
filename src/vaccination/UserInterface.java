package vaccination;

import java.awt.Color;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UserInterface {

	public static void SaySomething(String Info) {

		JLabel say =  new JLabel(Info);
		
	       JFrame frame = new JFrame("Vaccination");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300 , 300);
	       frame.setResizable(true);
	       frame.add(say);
	       frame.setVisible(true);
		
	}
	
	public String AskForString ( ) {
		return null;
		
		
		
		
	}
	
	public Date AskForDate ( ) {
		return null;
		
		
		
	}
	
	public int AskForNumber ( ) {
		return 0;
		
		
		
	}
	
}
