package vaccination;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	
	public static Date AskForDate (String info ) {
		Date ans = null;
		
		
		Scanner src = new Scanner(System.in);
		
		System.out.println(info);
		
		try {
			
		String input = src.nextLine();
			
			ans = new SimpleDateFormat("dd/MM/yyyy").parse(input);
			
		} catch (ParseException| NumberFormatException e) {
			
		}
		
		
		return ans;
	}
	
	public static int AskForNumber (String question) {
		int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        num = Integer.parseInt(sc.nextLine());

		return num;
    }
	
}


