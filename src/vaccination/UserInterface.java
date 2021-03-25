package vaccination;

import java.awt.Color;
import java.util.Date;
import java.util.Scanner;

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
	

	
	public static String AskForString (String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println(question);

        String user = sc.nextLine();
        return user;
    }
	
	public static Date AskForDate ( ) {
		return null;
		
		
		
	}
	
	public static int AskForNumber (String question) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println(question);
        num = Integer.parseInt(sc.nextLine());
        return num;
    }
	
}


